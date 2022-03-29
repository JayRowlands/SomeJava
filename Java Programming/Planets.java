public class Planets {
	
	String planetName;
	double planetMass;
	double planetDistance;
	double planetPeriod;
		
	//takes input from the SolarSystem class to add the planet
	public Planets(String name, double mass, double distance) {
		
		//calls the method setPlanetName using name for input
		setPlanetName(name);
			
		//calls the method setPlanetMass using name for mass
		setPlanetMass(mass);
			
		//calls the method setPlanetDistance using name for distance
		setPlanetDistance(distance);
			
	}
	//sets the planets name as the name input
	public void setPlanetName(String name) {
		
		planetName = name;
		
	}
	
	//sets the mass of the planet using the mass input
	public void setPlanetMass(double mass) {
		
		//rounds the double mass value to three decimal places
		double massRounded = Math.round(mass*1000)/1000.0;
		
		//sets the planets mass as the rounded value
		planetMass = massRounded;
	
	}

	//sets the distance of the planet using the distance input
	public void setPlanetDistance(double distance) {
		
		//rounds the double distance value to three decimal places
		double distanceRounded = Math.round(distance*1000)/1000.0;
		
		//sets the planets distance as the rounded value
		planetDistance = distanceRounded;
		
		//calls the method and uses the planets distance as input
		setOrbitalPeriod(planetDistance);
	
	}
	
	//sets the orbital period using the distance of the planet
	public void setOrbitalPeriod(double period) {
		
		//square roots the distance(period) cubed
		double periodCalc = Math.sqrt(period * period * period);
		
		//rounds the double orbital period to three decimal places
		double periodRounded = Math.round(periodCalc*1000)/1000.0;
		
		//sets the planets orbital period as the rounded value
		planetPeriod = periodRounded;
	
	}
	
	//when called it returns the name of the planet
	public String getPlanetName() {
	
		return planetName;
		
	}
	
	//when called it returns the mass of the planet
	public double getPlanetMass() {
		
		return planetMass;
		
	}

	//when called it returns the distance of the planet
	public double getPlanetDistance() {
	
		return planetDistance;
		
	}
	
	//when called it returns the orbital period of the planet
	public double getOrbitalPeriod() {
	
		return planetPeriod;
		
	}
}
