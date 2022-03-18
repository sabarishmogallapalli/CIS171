import java.util.Scanner;

/**
 * Sabarish Mogallapalli - smogallapalli CIS171 27114 Mar 1, 2022
 */

public class OldestInFamilyMogallapalli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("How many family member's ages would you like to enter?");
		double ageCount = input.nextDouble();
		String memberName = "";
		int memberAge = 0;
		double averageAge = 0;
		double totalAge = 0;
		int maxAge = 0;
		String maxName = "";

		for (int i = 0; i < ageCount; i++) {
			System.out.println("Enter a family member's name: ");
			memberName = input.next();
			System.out.println("Enter " + memberName + "'s age: ");
			memberAge = input.nextInt();
			totalAge = totalAge + memberAge;
			if (memberAge > maxAge) {
				maxAge = memberAge;
				maxName = memberName;
			}
		}
		averageAge = totalAge / ageCount;
		System.out.println("The average age in the family is: " + averageAge);
		System.out.println(maxName + " is the oldest member of the family.");
		input.close();
	}

}
