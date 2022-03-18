import java.util.Scanner;
/**  
* Sabarish Mogallapalli - smogallapalli  
* CIS171 27114
* Jan 25, 2022  
*/

public class MadLibsMogallapalli {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a name: ");
		String name = input.nextLine();
		System.out.print("Please enter favorite place to eat: ");
		String place = input.nextLine();
		System.out.print("Please enter favorite food to eat: ");
		String food = input.nextLine();
		
		input.close();
		
		System.out.println(name + "'s favorite place to eat is " + place + ".");
		System.out.println(name + " loves to eat " + food + ".");
	}

}
