import java.util.Scanner;
import java.util.*;
/**  
* Sabarish Mogallapalli - smogallapalli  
* CIS171 27114
* Jan 27, 2022  
*/

public class CompareNumbersMogallapalli {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number with two decimal points: ");
		Double num1 = input.nextDouble();
		System.out.print("Enter another number with two decimal points: ");
		Double num2 = input.nextDouble();
		boolean equalTo = num1 == num2;
		if(equalTo)
		{
			System.out.println(num1 + " is equal to " + num2);
		}
		else if(num1 > num2) 
		{
			System.out.println(num1 + " is greater than " + num2);
		}
		else if (num2 > num1) 
		{
			System.out.println(num1 + " is less than " + num2);
		}
		input.close();
	}

}
