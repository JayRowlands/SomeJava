import java.util.Scanner;
/**
 * Class to test FileReader.java
 *
 */
public class FileReaderMain {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println ("Please enter a file to open:");
		String filename = input.next ();
		FileReader.readProfiles(filename);
		input.close ();
	}
}
