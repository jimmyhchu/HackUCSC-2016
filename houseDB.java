import java.util.*;

public class houseDB {

	private String name;
	private String address;
	private int rent;
	private int stay;
	private String contact;

	
	public void setName(String name){
		this.name = name;
	}
	
	public String getContact(){
		return this.contact;
	}
	
	public void setContact(String contact) {
		this.contact = contact;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	

	
	public void setRent (int rent) {
		this.rent = rent;
	}
	
	public void setStay(int stay) {
		this.stay = stay;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getAddress() {
		return this.address;
	}
	
	public int getRent() {
		return this.rent;
	}
	
	public int getStay() {
		return this.stay;
	}
	

	
	public String toString() {
		return "Name: " + this.name + "\n" + "address: " + this.address
	 + "\n" + "Length of stay: " + this.stay + "\n" + "Maximum Rent: " + this.rent + "\n" 
	 + "Contact: " + this.contact + "\n" + "\n";
	}
}
