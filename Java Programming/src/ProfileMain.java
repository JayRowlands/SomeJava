import java.util.Scanner;

/**
 * Class to test Profile.java works efficiently
 *
 */
public class ProfileMain {
	public static void main (String[] args) {
		/*
		Scanner input = new Scanner (System.in);
		System.out.println ("Please enter a file to open:");
		String filename = input.next ();
		input.close ();
		
		FileReader.readProfiles(filename);
		*/
		
		String[] interests = new String[3];
		interests[0] = "football";
		interests[1] = "swimming";
		interests[2] = "reading";
		
		Profile profile1 = new Profile("Mike", 12, 3, 1987, "Swansea", "Wales", "Welsh", interests );
	
		String[] newInterests = new String[3];
		newInterests[0] = "reading";
		newInterests[1] = "gaming";
		newInterests[2] = "musician";
		
		Profile profile2 = new Profile("Brian", 19, 12, 1997, "Cardiff", "Wales", "English", newInterests);		
		Profile profile3 = new Profile("Jeff", 19, 12, 1997, "Cardiff", "Wales", "English", newInterests);		
		Profile profile4 = new Profile("Meg", 19, 12, 1997, "Cardiff", "Wales", "English", newInterests);		
		Profile profile5 = new Profile("Kev", 19, 12, 1997, "Cardiff", "Wales", "English", newInterests);		
		
		profile1.addFriend(profile2);
		profile1.addFriend(profile3);
		profile1.addFriend(profile4);
		profile1.addFriend(profile5);
		
		
		System.out.println(profile1.toString());
	}
}
