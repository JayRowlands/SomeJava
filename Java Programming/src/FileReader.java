import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * Class to read files into Profiles and add them to a binary tree
 *
 */
public class FileReader {
	/**
	 * Checks the file exists and creates a scanner to read the file
	 * @param filename The name of the file we want to read
	 * @return The scanner into our method to read data from the file
	 */
	public static BST readProfiles(String filename) {
		
		Scanner in = null;
	    
	    File newFile = new File(filename);
	    
	    try {
	    	in = new Scanner(newFile);
	    }
	    catch (FileNotFoundException e){
	    	System.out.println("System cannot find the specified file");
	    	System.exit(0);
	    }	
		return FileReader.readDataFile(in);	
	}
	
	/**
	 * Method to read the data from the scanner
	 * @param in The scanner containing the data from file
	 * @return newBST The binary search tree we're adding profiles too
	 */
	private static BST readDataFile(Scanner in) {
	
		BST newBST = new BST();
		
		while (in.hasNextLine()) {
			Scanner newLine = new Scanner(in.nextLine());
			newBST.insertProfile(profile(newLine));
		}
		return newBST;
	}
	
	/**
	 * Method to create profiles
	 * @param in The line from the file we are going to be creating a profile from
	 * @return The profile Object
	 */
	public static Profile profile(Scanner in) {
		
		in.useDelimiter(",");
		
		String name = in.next();
		int day = in.nextInt();
		int month = in.nextInt();
		int year = in.nextInt();
		String town = in.next();
		String country = in.next();
		String nationality = in.next();
		String[] interests = interests(in);
		
		Profile profile = new Profile(name, day, month, year, town, country, nationality, interests);
		System.out.println(profile.toString());
		
		return profile;
	}
	
	/**
	 * Method to add interests into an array
	 * @param in The remaining unread data from the file
	 * @return interests An array of interests represented as strings
	 */
	public static String[] interests(Scanner in) {	
		
		ArrayList<String> newInterests = new ArrayList<String>();
		
		in.useDelimiter(";");
		
		while (in.hasNext()) {
			newInterests.add(in.next());
		}
		int length = newInterests.size();
		String[] interests = new String[length];
		
		interests = newInterests.toArray(interests);
		
		return interests;
	}
	
}
