import java.util.ArrayList;
import java.util.Scanner;

public class SolarSystem {

	String systemName;
	
	//creates an ArrayList based on the Planets class to store the planets in
	ArrayList<Planets> systemPlanets = new ArrayList<>();
	
	//takes in string input and sets the name of the system
	SolarSystem(String name) {
		systemName = name;
	}
	
	//takes in the planet data from FantasySolarSystem 
	void addPlanet(String name, double mass, double distance) {
		
		//creates a new Planets Object and uses the planets method from the Planets class
		Planets newPlanet = new Planets(name, mass, distance);
	
		//adds the new planet to the ArrayList
		systemPlanets.add(newPlanet);
	}
	
	//method to get planets and output them in a structured string
	public String toString(){
		//planetCount becomes the systemName and end with a new line
		String planetCount = systemName + "\n";
		
		//goes through each element of the systemPlanets ArrayList and accesses the Planets class
		for (Planets elem: systemPlanets) {
			//uses the Planets class' methods to get the information about the planets
			planetCount =  planetCount + "Planet " + elem.getPlanetName() + " has a mass of " + elem.getPlanetMass() + " Earths, is " + elem.getPlanetDistance() +"AU from its star, and orbits in "+ elem.getOrbitalPeriod() +" years\n";
			
		}
		return planetCount;
	}
	
	//prints a table when the method is called
	public void printTable() {
		System.out.println("Solar System name: " + (systemName) + "\n");
		System.out.println("name\tmass\tdistance\tperiod (years)");
		
		//goes through each element of the systemPlanets ArrayList and accesses the Planets class
		for (Planets elem: systemPlanets) {
			//prints a string containing the planets data in a structured format
			System.out.println(elem.getPlanetName() + "\t" +
				elem.getPlanetMass() + "\t" +
				elem.getPlanetDistance() + "\t\t" + 
				elem.getOrbitalPeriod() + "\t");
	
		}
		
	}
}
