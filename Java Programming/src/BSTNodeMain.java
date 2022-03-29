/**
 * Class to test BSTNode.java
 *
 */
public class BSTNodeMain {
	public static void main(String[] args) {
		
		//Blank objects to test the nodes
		Profile newObject = null;
		Profile testObject = null;
		BSTNode newNode = new BSTNode(newObject);
		
		BSTNode testNode = new BSTNode(testObject);
		
		//Uses these methods to set a node to the left and right child
		newNode.setLeft(testNode);
		newNode.setRight(testNode);
		
		System.out.println(newNode.getProfile());
		System.out.println(newNode.getLeft());
		System.out.println(newNode.getRight());
		System.out.println(newNode.getLeft().getProfile());
		System.out.println(newNode.getRight().getProfile());
	}
}
