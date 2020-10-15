import java.util.*; //importing java package

public class Address {

	public String firstname;
	public String lastname;
	public String address;
	public String city;
	public String state;
	public String zip;
	public String number;
	public String email;

	// constructor
	public Address(String firstname, String lastname, String address, String city, String state, String zip,String number, String email) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.number = number;
		this.email = email;
	}

	public Address() {

	}

	public void Display() {
		System.out.println(firstname + " " + lastname + " " + address + " " + city + " " + state + " " + zip + " "
				+ number + " " + email);
	}
}