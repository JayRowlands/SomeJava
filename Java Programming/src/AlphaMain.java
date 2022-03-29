/**
 * Class to test the printAlphabetical method in BST.java
 *
 */
public class AlphaMain {
	public static void main(String[] args) {
		
		//Array of strings to create interests for profiles
		 
		String[] interests = new String[3];
		interests[0] = "football";
		interests[1] = "swimming";
		interests[2] = "reading";
		
		Profile aUser = new Profile("John", 21, 4, 2000, "Cardiff", "Wales", "Welsh", interests );
		Profile newUser = new Profile("Mike", 12, 3, 1976, "Swansea", "Wales", "Welsh", interests );
		Profile theUser = new Profile("Kevin", 28, 8, 1997, "London", "England", "English", interests );
		Profile tUser = new Profile("Lin", 28, 8, 1997, "London", "England", "English", interests );
		Profile hUser = new Profile("Bob", 28, 8, 1997, "London", "England", "English", interests );
		Profile eUser = new Profile("Vick", 28, 8, 1997, "London", "England", "English", interests );
		Profile bUser = new Profile("Rich", 28, 8, 1997, "London", "England", "English", interests );
		Profile xUser = new Profile("Andrew", 28, 8, 1997, "London", "England", "English", interests );

		//Creates a new empty binary search tree
		BST newBST = new BST();
		
		//Inserts profiles into the binary search tree
		newBST.insertProfile(aUser);
		newBST.insertProfile(newUser);
		newBST.insertProfile(theUser);
		newBST.insertProfile(tUser);
	    newBST.insertProfile(hUser);
	    newBST.insertProfile(eUser);
		newBST.insertProfile(bUser);
		newBST.insertProfile(xUser);
		
		//Prints the binary search tree alphabetically in order of names
		newBST.printAlphabetical(newBST.root);
	}
}
