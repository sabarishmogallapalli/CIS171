
/**  
* Sabarish Mogallapalli - smogallapalli  
* CIS171 27114
* Jan 23, 2022  
*/

import java.util.Scanner;

public class AverageAgeMogallapalli {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("This program will output the ages of four people and output the average.");
		System.out.println("Please enter the age of the first person: ");
		int personOne = input.nextInt();
		System.out.println("Please enter the age of the second person: ");
		int personTwo = input.nextInt();
		System.out.println("Please enter the age of the third person: ");
		int personThree = input.nextInt();
		System.out.println("Please enter the age of the fourth person: ");
		int personFour = input.nextInt();
		int numPeople = 4;
		double average = 0.00; 
		
		average = (double)(personOne + personTwo + personThree + personFour) / numPeople;
		
		System.out.println("The average age is " + average + " years old.");	
		input.close();
	}

}
