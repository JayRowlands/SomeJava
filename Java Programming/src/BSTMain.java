/**
 * Class to test BST.java
 *
 */
public class BSTMain {
	public static void main(String [] args) {
		
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
		
		//Using the addRecursive function to test it's efficiency and it is working correctly 
	/*
		newBST.insertProfile(aUser);
		newBST.insertProfile(newUser);
		newBST.insertProfile(theUser);
		newBST.insertProfile(tUser);
	    newBST.insertProfile(hUser);
	    newBST.insertProfile(eUser);
		newBST.insertProfile(bUser);
		newBST.insertProfile(xUser);
		*/
		
		//Hard coded binary tree node locations
		newBST.root = new BSTNode(newUser);
		newBST.root.left = new BSTNode(aUser);
		newBST.root.left.left = new BSTNode(hUser);
		newBST.root.left.left.left = new BSTNode(xUser);
		
		newBST.root.left.right = new BSTNode(theUser);
		newBST.root.left.right.right = new BSTNode(tUser);
		
		newBST.root.right = new BSTNode(eUser);
		newBST.root.right.left = new BSTNode(bUser);
		
		//Print each hard coded location to ensure the Nodes are being added to the tree properly
		
		System.out.println(newBST.root.getProfile().getName());
		System.out.println(newBST.root.left.getProfile().getName());
		System.out.println(newBST.root.left.left.getProfile().getName());
		System.out.println(newBST.root.left.left.left.getProfile().getName());
		
		System.out.println(newBST.root.left.right.getProfile().getName());
		System.out.println(newBST.root.left.right.right.getProfile().getName());
		
		System.out.println(newBST.root.right.getProfile().getName());
		System.out.println(newBST.root.right.left.getProfile().getName());

	}
}
