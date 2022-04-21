/**  
* Sabarish Mogallapalli - smogallapalli
* CIS171 27114
* April 19, 2022
*/
package model;

public class Instructor {
	private String firstName;
	private String lastName;
	private String email;
	

	public Instructor() {
		setFirstName("Sabarish");
		setLastName("Mogallapalli");
		setEmail("johndoe@dmacc.edu");
	}
	
	public Instructor(String nameFirst, String nameLast, String address) {
		setFirstName(nameFirst);
		setLastName(nameLast);
		setEmail(address);
	}
	
	public Instructor(String nameFirst, String nameLast) {
		setFirstName(nameFirst);
		setLastName(nameLast);
		setEmail(makeEmailAddress(nameFirst, nameLast));
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = this.makeEmailAddress(firstName, lastName);
	}
	
	public String makeEmailAddress(String firstName, String lastName) {
		String emailAddress = (firstName.charAt(0) + lastName + "@dmacc.edu").toLowerCase();
		return emailAddress;
		
	}
	@Override
	public String toString() {
		return "Instructor [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + "]";
	}
}
