import java.util.ArrayList;
/**
 * Class to represent profile objects
 *
 */
public class Profile {

	public String name; //Name of the profile
	public int day; //The day the profile was born
	public int month; //The month the profile was born
	public int year; //The year the profile was born
	public String town; //The current town of residency
	public String country; //The country the profile lives in
	public String nationality; //The profiles nationality
	public String[] interests; //Array of interests the profile has represented as strings
	
	public int numOfFriends; //The number of friends the profile has
	public ArrayList<Profile> userFriends = new ArrayList<Profile>(); //ArrayList of profiles to stores the profiles friends

	/**
	 * Constructs a new profile object
	 * @param name The name of the profile
	 * @param day The day the profile was born
	 * @param month The month the profile was born
	 * @param year The year the profile was born
	 * @param town The town the profile was born
	 * @param country The country the profile was born
	 * @param nationality The nationality of the profile
	 * @param interests The interests the profile has
	 */
	public Profile(String name, int day, int month, int year, String town, String country, String nationality, String[] interests) {
	this.name = name;
	this.day = day;
	this.month = month;
	this.year = year;
	
	setTown(town);
	setCountry(country);
	setNationality(nationality);
	setInterests(interests);
	}
	
	/**
	 * Sets the town residency of the profile
	 * @param town The town of the profile
	 */
	public void setTown(String town) {
		this.town = town;
	}
	
	/**
	 * Gets the town the current user of the profile lives in
	 * @return town The town represented as a string
	 */
	public String getTown() {
		return this.town;
	}
	
	/**
	 * Sets the country the user of the profile lives in
	 * @param country The country of the profile
	 */
	public void setCountry(String country) {
		this.country = country;
	}
	
	/**
	 * Gets the country the current user of the profile lives in
	 * @return country The country represented as a string
	 */
	public String getCountry() {
		return this.country;
	}
	
	/**
	 * Sets the nationality of the user of the profile 
	 * @param nationality The nationality of the profile user
	 */
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	
	/**
	 * Gets the nationality of the current user of the profile
	 * @return nationality The nationality represented as a String
	 */
	public String getNationality() {
		return this.nationality;
	}
	
	/**
	 * Sets the interests of the profile user
	 * @param interests An array of string the user is interested in
	 */
	public void setInterests(String[] interests) {
		this.interests = interests;
	}
	
	/**
	 * Gets the interests the user of the profile is interested in
	 * @return interests An array of strings
	 */
	public String[] getInterests() {
		return this.interests;
	}
	
	/**
	 * Gets the name of the profile
	 * @return name The name represented as a string
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * Gets the date of birth of the profile user
	 * @return dob The date of birth represented as a string
	 */
	public String getDateOfBirth() {
		return this.day + "/" + this.month + "/" + this.year;
	}
	
	/**
	 * Adds a profile to an ArrayList of friends the profile has
	 * @param p The profile to add as a friend
	 */
	public void addFriend(Profile p) {
		userFriends.add(p);
		numOfFriends++;
	}
	
	/**
	 * gets the number of friends the profile has
	 * @return numOfFriends The number of friends represented as an int
	 */
	int numOfFriends() {
		return numOfFriends;
	}
	
	/**
	 * Gets a specific friend of the profile
	 * @param i The index of the profile we want to get
	 * @return The profile at the specific index
	 */
	Profile getFriend(int i) {
		return (Profile) userFriends.get(i);
	}
	
	/**
	 * Prints out the profile in a formatted way
	 */
	public String toString() {
		
		String fullProfile; //
		String interestStrings = ""; //
		String names = ""; //
		String[] interests = getInterests(); //
		
		fullProfile = "Name: " + getName() + "\n"; 
		fullProfile += "DoB: " + getDateOfBirth() + "\n";
		fullProfile += "Town: " + getTown() + "\n";
		fullProfile += "Country: " + getCountry() + "\n";
		fullProfile += "Nationality: " + getNationality() + "\n" + "\n";
	
		
		for (int i = 0; i < interests.length; i ++) {
			if (interests[i] != null) {
				interestStrings += interests[i] + "\n";
			}
		}
		fullProfile += "Interests: " + "\n" + interestStrings.replace(",", "") + "\n";
		
		
		fullProfile += "Number of friends: " + numOfFriends() + "\n";
		for (int n = 0; n< userFriends.size(); n++) {
			names += userFriends.get(n).getName() + "\n";
		}
		fullProfile += "Friends with : " +  "\n" + names + "\n" + "\n";
		
		
 		return fullProfile;
	}
}
