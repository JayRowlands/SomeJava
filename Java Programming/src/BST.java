/**
 * Class to create the binary search tree and insert nodes into the tree
 * Also contains an inOrder traversal method to print the tree
 *
 */
public class BST {

	BSTNode root; //Reference to the root node of the binary search tree

	/**
	 * Constructs an empty binary search tree
	 */
	public BST() {
		root = null;
	}

	/**
	 * Inserts the profile by either placing it into root
	 * Or by calling the recursive method to add it in it's appropriate place
	 * @param p The profile we're adding to the binary search tree
	 */
	public void insertProfile(Profile p) {

		BSTNode newNode = new BSTNode(p);
		if (this.root == null) {
			this.root = newNode;
		} 
		else{
			addRecursive(root, newNode);
		}
	}

	/**
	 * Recursively adds the nodes to the binary tree in their appropriate locations
	 * @param parent The parent node of the child we're adding
	 * @param current The child node
	 * @return The current or parent node depending on if the node exists already
	 */
	private BSTNode addRecursive(BSTNode parent, BSTNode current) {
		if (parent == null) {
			return current;
		}
		else if (current.getProfile().getName().compareTo(parent.getProfile().getName()) < 0){
			parent.left = addRecursive(parent.left, current);
		}
		else if (current.getProfile().getName().compareTo(parent.getProfile().getName()) > 0) {
			parent.right = addRecursive(parent.right, current);
		}
		return parent;
	}
	/**
	 * Uses the InOrder traverse method to print the binary search tree alphabetically
	 * @param n The root node 
	 */
	public void printAlphabetical(BSTNode n) {
		if (n.left != null) {
			printAlphabetical(n.left);
		}

		System.out.println(n.getProfile().getName());

		if (n.right != null) {
			printAlphabetical(n.right);
		}
	}

	public Profile search(BSTNode root, String searchName) {

		if (root == null || root.getProfile().getName().equals(searchName)) {
			return root.getProfile();
		}
		if (root.getProfile().getName().compareTo(searchName) > 0) {
			return search(root.left, searchName);
		}
		if (root.getProfile().getName().compareTo(searchName) < 0) {
			return search(root.right, searchName);
		}
		return null;
	}
}