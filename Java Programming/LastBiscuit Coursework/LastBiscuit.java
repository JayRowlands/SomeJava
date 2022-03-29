import java.util.Scanner;

public class LastBiscuit {
	public static void main(String[] args) {
		
		//Declares a Scanner for user input
		Scanner Input = new Scanner(System.in);
	
		//Initialises public variables
		int Barrel1 = 0;
		int Barrel2 = 0;
		
		boolean Winner = false;
		
		int Player1Takes = 0;
		int Player2Takes = 0;
		
		boolean Player1SelectionCheck = false;
		boolean Player2SelectionCheck = false;
		
		boolean Player1InputCheck = false;
		boolean Player2InputCheck = false;
		
		String Player1BarrelSelection = "";
		String Player2BarrelSelection = "";
			
			//Declares the number of biscuits in each barrel
			Barrel1 = 6;
			Barrel2 = 8;
			
			System.out.print("Biscuits Left - Barrel 1: " + Barrel1);
			System.out.println("");
			System.out.print("Biscuits Left - Barrel 2: " + Barrel2);
			System.out.println("");	
			
			// A do while labelled "Result"		
	Result:	do {
	//PLAYER 1
			//loops while the Input Check for taking the correct amount of biscuits is false
				while (Player1InputCheck == false) {
	
				System.out.print("Biscuits taken by player 1: ");
				// Performs a check that the next input is a valid integer, sets the Input Check to true if it's a valid integer
			
				while (Player1InputCheck == false) {
					if (Input.hasNextInt()) {
					Player1Takes = Input.nextInt();
					Player1InputCheck = true;
				}
				// If not an integer output message and loop back to start
				else 
				{
					System.out.println("Please enter a number");
					Input.next();
				}
				}
				
			System.out.print("From barrel1 (one), barrel2 (two), or both (both)? ");
				
			// While the Barrel Selection Check is false loop
			while (Player1SelectionCheck == false) {
			// Scanner input for users Barrel Selection	
				Player1BarrelSelection = Input.next();
			
				// If Selection equals "one" or "two" or "both" set Selection Check to true
				if (Player1BarrelSelection.equals("one") ||
					Player1BarrelSelection.equals("two") ||
					Player1BarrelSelection.equals("both")) {
					Player1SelectionCheck = true;
				}
				else
				{
					// If not met then set back to false to loop and prompt the user with an error message
					System.out.print("Please enter 'one', 'two' or 'both'");
					Player1SelectionCheck = false;
				}
			}
			//Selects the appropriate statement based on the users selection
			switch (Player1BarrelSelection) {
			
			case "one":
					//If condition is met then perform calculation and set Input Check to true to avoid looping
					if (Player1Takes > 0 && Player1Takes <= Barrel1) {
						Barrel1 = Barrel1 - Player1Takes;
						Player1InputCheck = true;
					}
					else
					{
						// If not met then set variables back to false to loop and prompt the user with an error message
						Player1InputCheck = false;
						Player1SelectionCheck = false;
						System.out.print("Please enter a number between 0 and " + Barrel1);
						System.out.println("");
					}
				//Breaks out of the switch
				break;
			
			case "two":
					//If condition is met then perform calculation and set Input Check to true to avoid looping
					if (Player1Takes > 0 && Player1Takes <= Barrel2) {
						Barrel2 = Barrel2 - Player1Takes;
						Player1InputCheck = true;
					}
					else
					{
						// If not met then set variables back to false to loop and prompt the user with an error message
						Player1InputCheck = false;
						Player1SelectionCheck = false;
						System.out.print("Please enter a number between 0 and " + Barrel1);
						System.out.println("");
					}
				//Breaks out of the switch
				break;
			
			case "both":
				
			//If condition is met then perform calculations and set Input Check to true to avoid looping
			if (Player1Takes > 0 && Player1Takes <= Barrel1 &&
					Player1Takes <= Barrel2) {
					Barrel1 = Barrel1 - Player1Takes;
					Barrel2 = Barrel2 - Player1Takes;
					Player1InputCheck = true;
				}
				else
				{
					// If not met then set variables back to false to loop and prompt the user with an error message
					Player1InputCheck = false;
					Player1SelectionCheck = false;
					//Find the minimum value between barrel's and use this as the minimum number of biscuits available for taking
					int MaxPlayer1 = Math.min(Barrel1, Barrel2);
					System.out.print("Please enter a number between 0 and " + MaxPlayer1);
					System.out.println("");
				}
			//Breaks out of the switch
			break;
			}
						
			}
			// Sets the two check back to false ready for the next turn
			Player1SelectionCheck = false;
			Player1InputCheck = false;
			
			System.out.print("Biscuits Left - Barrel 1: " + Barrel1);
			System.out.println("");
			System.out.print("Biscuits Left - Barrel 2: " + Barrel2);
			System.out.println("");

			//If both barrel's are empty then Player 1 wins
			if (Barrel1 == 0 && Barrel2 == 0 ) {
				System.out.println("Winner is player 1");
				Winner = true;
				//The do while loop following the "Result:" label is broken out of
				break Result;
			}
	//PLAYER 2
			
			//loops while the Input Check for taking the correct amount of biscuits is false
			while (Player2InputCheck == false) {
				System.out.print("Biscuits taken by player 2: ");
				// Performs a check that the next input is a valid integer, sets the Input Check to true if it's a valid integer
				while (Player2InputCheck == false) {
					if (Input.hasNextInt() ) {
						Player2Takes = Input.nextInt();
						Player2InputCheck = true;
					}
					else 
					{
						// If not an integer output message and loop back to start
						System.out.println("Please enter a number");
						Input.next();
					}
				}
			System.out.print("From barrel1 (one), barrel2 (two), or both (both)? ");
				
			// While the Barrel Selection Check is false loop
			while (Player2SelectionCheck == false) {
				// Scanner input for users Barrel Selection	
				Player2BarrelSelection = Input.next();
			
				// If Selection equals "one" or "two" or "both" set Selection Check to true
				if (Player2BarrelSelection.equals("one") ||
					Player2BarrelSelection.equals("two") ||
					Player2BarrelSelection.equals("both")) {
					Player2SelectionCheck = true;
				}
				else
				{
					// If not met then set back to false to loop and prompt the user with an error message
					System.out.print("Please enter 'one', 'two' or 'both'");
					Player2SelectionCheck = false;
				}
			}
			//Selects the appropriate statement based on the users selection
			switch (Player2BarrelSelection) {
			
			
			case "one":
					//If condition is met then perform calculation and set Input Check to true to avoid looping
					if (Player2Takes > 0 && Player2Takes <= Barrel1) {
						Barrel1 = Barrel1 - Player2Takes;
						Player2InputCheck = true;
					}
					else
					{
						// If not met then set variables back to false to loop and prompt the user with an error message
						Player2InputCheck = false;
						Player2SelectionCheck = false;
						System.out.print("Please enter a number between 0 and " + Barrel1);
						System.out.println();
					}
				//Breaks out of the switch
				break;
			
				case "two":
					//If condition is met then perform calculation and set Input Check to true to avoid looping
					if (Player2Takes > 0 && Player2Takes <= Barrel2) {
						Barrel2 = Barrel2 - Player2Takes;
						Player2InputCheck = true;
					}
					else
					{
						// If not met then set variables back to false to loop and prompt the user with an error message
						Player2InputCheck = false;
						Player2SelectionCheck = false;
						System.out.print("Please enter a number between 0 and " + Barrel1);
						System.out.println();
					}
				//Breaks out of the switch
				break;
			
				
			case "both":
			//If condition is met then perform calculations and set Input Check to true to avoid looping
			if (Player2Takes > 0 && Player2Takes <= Barrel1 &&
					Player2Takes <= Barrel2) {
					Barrel1 = Barrel1 - Player2Takes;
					Barrel2 = Barrel2 - Player2Takes;
					Player2InputCheck = true;
				}
				else
				{
					// If not met then set variables back to false to loop and prompt the user with an error message
					Player2InputCheck = false;
					Player2SelectionCheck = false;
					//Find the minimum value between barrel's and use this as the minimum number of biscuits available for taking
					int MaxPlayer2 = Math.min(Barrel1, Barrel2);
					System.out.print("Please enter a number between 0 and " + MaxPlayer2);
					System.out.println();
				}
			//Breaks out of the switch
			break;
			}	
			}
			
			System.out.print("Biscuits Left - Barrel 1: " + Barrel1);
			System.out.println("");
			System.out.print("Biscuits Left - Barrel 2: " + Barrel2);
			System.out.println("");
			
			// Sets the two check back to false ready for the next turn
			Player2SelectionCheck = false;
			Player2InputCheck = false;
			
			//If both barrel's are empty then Player 2 wins
			if (Barrel1 == 0 && Barrel2 == 0 ) {
				System.out.println("Winner is player 2");
				Winner = true;
				//The do while loop following the "Result:" label is broken out of
				break Result;
			}
			
			//For as long as there is no winner loop
			}while (Winner == false);

			//Closes the scanner
			Input.close();
	}
}
