import java.util.Scanner;

/**
 * Sabarish Mogallapalli - smogallapalli CIS171 27114 Feb 21, 2022
 */

public class AverageCaloriesMogallapalli {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); // scanner to be used throughout the program

		int numDays = 7; // variable to define the number of days the average is calculated for
		int calorieIntake = 0; // declare and initialize the calorie intake

		for (int i = 1; i <= numDays; i++) // for loop to input calorie intake for each day of the period
		{
			System.out.print("Enter calorie intake as a whole number:");
			calorieIntake = calorieIntake + in.nextInt();
		}
		double averageIntake = (double) calorieIntake / numDays; // use the calorieIntake (which is now the total intake
																	// for all the days) and divide it by the number of
																	// days (calculated by the counter 'numDays') to
																	// find out average daily intake
		System.out.print("The average daily caloric intake is: " + averageIntake);

		in.close();
	}
}
