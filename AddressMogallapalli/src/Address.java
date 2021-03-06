/**  
* Sabarish Mogallapalli - smogallapalli  
* CIS171 27114
* 3/28/2022
*/ 

public class Address {
private String address;
private String address2;
private String city;
private String state;
private String postalCode;

public Address() {
	setAddress("12345 ExampleWood Lane");
	setAddress2("67890 WoodExample Drive");
	setCity("Clive");
	setState("Iowa");
	setPostalCode("50325");
}

public Address(String address, String address2, String city, String state, String postalCode) {
	setAddress(address);
	setAddress2(address2);
	setCity(city);
	setState(state);
	setPostalCode(postalCode);
	if ((getState() == null) || (getPostalCode() == null)) {
		throw new IllegalArgumentException("Object not found");
	}
}

public Address(String address, String city, String state, String postalCode) {
	setAddress(address);
	setCity(city);
	setState(state);
	setPostalCode(postalCode);
	if ((getState() == null) || (getPostalCode() == null)) {
		throw new IllegalArgumentException("Object not found");
	}
}


public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getAddress2() {
	return address2;
}
public void setAddress2(String address2) {
	this.address2 = address2;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
	if (this.state.length() == 2) {
		this.state = state;
	}
	else {
		this.state = null;
		System.out.print("Please only enter the abbreviation of the state (i.e. IA)");
	}
}
public String getPostalCode() {
	return postalCode;
}
public void setPostalCode(String postalCode) {
	this.postalCode = postalCode;
	if (this.postalCode.length() == 5) {
		this.postalCode = postalCode;
	}
	else {
		this.postalCode = null;
		System.out.print("Please only enter 5 digits for the zip code (i.e. 50266)");
	}
}

public String print() {
	String address = "";
	if (this.address2 == null  || this.address2.isEmpty()) {
		address =  this.getAddress() + " " + this.getCity() + ", " + this.getState() + " " + this.getPostalCode();	
	}
	else {
		address =  this.getAddress() + " " + this.getAddress2() + " " + this.getCity() + ", " + this.getState() + " " + this.getPostalCode();
	}
	return address;
}

}
