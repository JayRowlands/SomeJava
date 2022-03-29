import java.util.Scanner;

/**
 * Class to test Graph.java works to specification
 *
 */
public class GraphMain {
	public static void main(String[] args) {

		//Creates interests for the profiles
		String[] interests = new String[3];
		interests[0] = "football";
		interests[1] = "swimming";
		interests[2] = "reading";

		//Creates the profiles
		Profile newUser = new Profile("Mike", 12, 3, 1976, "Swansea", "Wales", "Welsh", interests );
		Profile aUser = new Profile("John", 21, 4, 2000, "Cardiff", "Wales", "Welsh", interests );
		Profile theUser = new Profile("Kevin", 28, 8, 1997, "London", "England", "English", interests );
		Profile tUser = new Profile("Lin", 28, 8, 1997, "London", "England", "English", interests );
		Profile hUser = new Profile("Bob", 28, 8, 1997, "London", "England", "English", interests );
		Profile eUser = new Profile("Vick", 28, 8, 1997, "London", "England", "English", interests );
		Profile bUser = new Profile("Rich", 28, 8, 1997, "London", "England", "English", interests );
		Profile xUser = new Profile("Andrew", 28, 8, 1997, "London", "England", "English", interests );

		//Creates an empty binary tree
		BST newBST = new BST();
		
		newBST.insertProfile(newUser);
		newBST.insertProfile(aUser);
		newBST.insertProfile(theUser);
		newBST.insertProfile(tUser);
	    newBST.insertProfile(hUser);
	    newBST.insertProfile(eUser);
		newBST.insertProfile(bUser);
		newBST.insertProfile(xUser);
	
		Scanner input = new Scanner (System.in);
		System.out.println ("Please enter a file to open:");
		String filename = input.next ();
		input.close ();
		
		Graph newGraph = new Graph(filename, newBST);
	}
}
