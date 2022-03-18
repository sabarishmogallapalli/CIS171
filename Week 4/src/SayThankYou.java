
/**  
* Sabarish Mogallapalli - smogallapalli  
* CIS171 27114
* Feb 3, 2022  
*/

public class SayThankYou {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sayThanks("Bruce"));
		System.out.println(sayThanks("Bruce","Springsteen"));
		System.out.println(sayThanks("Mr.","Bruce","Springsteen"));
	}
	public static String sayThanks (String firstName) {
		return "Thanks, " + firstName;
	}
	public static String sayThanks (String firstName, String lastName) {
		return "Thank you, " + firstName + " " + lastName;
	}
	public static String sayThanks (String title, String firstName, String lastName) {
		return "Thank you so much, " + title + " " + firstName + " " + lastName;
		
	}
}
