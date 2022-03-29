/**
 * Class to represent the binary tree as nodes
 *
 */
public class BSTNode {

	Profile profile; //the profile stored as an Object type
	BSTNode left; //The left child of the parent node
	BSTNode right; //The right child of the parent node
	
	/**
	 * Constructs a new node
	 * @param p The profile parsed as an Object
	 */
	public BSTNode(Profile p) {
		this.profile = p;
		left = null;
		right = null;
	}
	
	/**
	 * Gets the profile associated with the node reference
	 * @return profile Returns the profile
	 */
	public Profile getProfile() {
		return (Profile) this.profile;	
	}
	
	/**
	 * Sets the left child of the parent
	 * @param l The left node 
	 */
	public void setLeft(BSTNode l) {
		this.left = l;
	}
	
	/**
	 * Sets the right child of the parent
	 * @param r The right node
	 */
	public void setRight(BSTNode r) {
		this.right = r;
	}
	
	/**
	 * Gets the left child of the parent node
	 * @return left The left child
	 */
	public BSTNode getLeft() {
		return this.left;
	}
	
	/**
	 * Gets the right child of the parent node 
	 * @return right The right child
	 */
	public BSTNode getRight() {
		return this.right;
	}
}
