import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Graph {

	/**
	 * Constructs a new graph
	 * @param filename The filename containing edges
	 * @param tree The tree containing users
	 */
	public Graph(String filename, BST tree) {
		Scanner in = null;
		File newFile = new File(filename);

		try {
			in = new Scanner(newFile);
		}
		catch (FileNotFoundException e){
			System.out.println("System cannot find the specified file");
			System.exit(0);
		}	


		BST newBST = tree;
		String name = "";
		String secondName = "";
		ArrayList<Profile> invitations = new ArrayList<Profile>();
		while(in.hasNextLine()) {
			Scanner newLine = new Scanner(in.nextLine());
			newLine.useDelimiter(",");
			name = newLine.next();
			secondName = newLine.next();

			Profile profileFriends = newBST.search(newBST.root, name);
			Profile addFriend = newBST.search(newBST.root, secondName);

			profileFriends.addFriend(addFriend);
			invitations.add(profileFriends);
			addFriend.addFriend(profileFriends);
			invitations.add(addFriend);
		}
		bigParty(invitations);	
	}

	/**
	 * Invites profiles to a party
	 * @param invitations ArrayList of profiles and their friends who may come to the party
	 * @return BinarySearchTree of invited profiles
	 */
	BST bigParty (ArrayList<Profile>invitations) {

		BST invitationList = new BST();
		for (int i = 0; i < invitations.size(); i++) {	
				invitationList.insertProfile(invitations.get(i));
			
		}
		invitationList.printAlphabetical(invitationList.root);

		return invitationList;
	}
}
