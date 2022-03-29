/*I have improved this program by responding to the feedback received from my LastBicuit rubric
 * 
 * I have improved my Structure by not using a labelled break, i replaced it with boolean variables to terminate my loops
 * I have improved my Identifier Naming by not starting my variables with capital letters
 * I have improved upon my Final Variables (Constants) by setting the system name as final
 * I have improved my Code Layout by ensuring the code correctly indented
 */
import java.util.Scanner;

public class FantasySolarSystem {
	public static void main(String[] args) {
		
		boolean done = false;

		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the name of the solar system");
		
		//once system name is set it's final and cannot be changed
		final String systemName = input.nextLine();
		
		//creates a new Solar System Object and sets the system name in the Solar System class
		SolarSystem solarSystems = new SolarSystem(systemName);
			 
		 
		System.out.println("Please enter a planet name, or done to finish");
		
		//creates the planet and uses the Solar System classes' methods to add the planet to the Object
		do {
			;
			String planetName = input.nextLine();
			
			//ignores case sensitivity if "done" is entered
			if (planetName.equalsIgnoreCase("done")){
				//sets the loop to true to leave the loop
				done = true;
			}
			else
			{
				//creates random values for the planet
				double planetMass = Math.random();
				double planetDistance = Math.random();
				//uses the solarSystems Object to access the method addPlanet on the SolarSystem class, uses the planets values that have been set in this class
				solarSystems.addPlanet(planetName, planetMass, planetDistance);
				//uses the solarSystems Object to access the toString method in the SolarSystem class
				solarSystems.toString();
			}
		//loops while done is equal to false
		}while (done == false);
			
		//uses the solarSystems Object to access the printTable method
		solarSystems.printTable();
		//close the input scanner
		input.close();
	}
	
}
