import java.util.*;

public class userDB{
	private String name;
	private String major;
	private int age;
	private String gradYear;
	private int stay;
	private int rent;
	private String personality;
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setPersonality(String personality) {
		this.personality = personality;
	}
	
	public String getPersonality() {
		return this.personality;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return this.age;
	}
	public void setStay(int stay) {
		this.stay = stay;
	}
	
	public void setGradYear(String gradYear) {
		this.gradYear = gradYear;
	}
	
	public void setRent (int rent) {
		this.rent = rent;
	}
	
	public String getName(){
		return this.name;
	}
	
	public String getMajor() {
		return this.major;
	}
	
	public int getStay() {
		return this.stay;
	}
	
	public String getGradYear() {
		return this.gradYear;
	}
	
	public int getRent(){
		return this.rent;
	}
	
	public String toString() {
		return "Name: " + this.name + "\n" + "Age: " + this.age + "\n" + "Major: " + this.major + "\n" + "Graduation Year: " + this.gradYear 
	 + "\n" + "Length of stay: " + this.stay + "\n" + "Maximum Rent: " + this.rent + "\n" + "Personality: " +
	this.personality + "\n";
	}


}
