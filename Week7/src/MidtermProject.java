import java.util.Scanner;

/**
 * Sabarish Mogallapalli - smogallapalli CIS171 27114 Mar 1, 2022
 */

public class MidtermProject {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int startValue = 0;
		int numTimes = 0;
		double numFactor = 0.00;
		double total = 0.00;
		// initial user input
		System.out.print("Please enter the characters: a,s,m, or d (to either add, subtract, multiply, or divide): ");
		String userChoice = in.nextLine().toLowerCase();
		if (getArithmeticOperator(userChoice)) {
			System.out.print("Please enter a starting value to add from: ");
			try {
				startValue = in.nextInt();
			} catch (Exception e) {
				System.out.print("Invalid input.");
			}
			System.out.print("Please enter the number of times you want the loop to iterate for: ");
			try {
				numTimes = in.nextInt();
			} catch (Exception e) {
				System.out.print("Invalid input.");
			}
			System.out.print("Please enter a number to add to each of these numbers: ");
			try {
				numFactor = in.nextDouble();
			} catch (Exception e) {
				System.out.print("Invalid input.");
			}
			if (numFactor <= 0) {
				System.out.print("Invalid input.");
				in.close();
				return;
			}
			if (numTimes <= 0) {
				System.out.print("Invalid input.");
				in.close();
				return;
			}

			if (userChoice.contentEquals("a")) {
				total = additionOperation(startValue, numTimes, numFactor);
			} else if (userChoice.contentEquals("s")) {
				total = subtractionOperation(startValue, numTimes, numFactor);
			} else if (userChoice.contentEquals("m")) {
				total = multiplicationOperation(startValue, numTimes, numFactor);
			} else if (userChoice.contentEquals("d")) {
				total = divisionOperation(startValue, numTimes, numFactor);
			}

			System.out.print("The total is: " + total);
		}
		in.close();
	}

	public static boolean getArithmeticOperator(String userChoice) {
		if (userChoice.contentEquals("a") || userChoice.contentEquals("s") || userChoice.contentEquals("m")
				|| userChoice.contentEquals("d")) {
			return true;
		} else {
			System.out.print("Invalid input.");
			return false;
		}

	}

	public static double additionOperation(int startValue, int numberTimes, double numberAdded) {
		double total = 0.00;
		for (int i = 0; i < numberTimes; i++) {
			startValue += numberAdded;
			total = startValue;
		}
		return total;
	}

	public static double subtractionOperation(int startValue, int numberTimes, double numberAdded) {
		double total = 0.00;
		for (int i = 0; i < numberTimes; i++) {
			startValue -= numberAdded;
			total = startValue;
		}
		return total;
	}

	public static double multiplicationOperation(int startValue, int numberTimes, double numberAdded) {
		double total = 0.00;
		for (int i = 0; i < numberTimes; i++) {
			startValue *= numberAdded;
			total = startValue;
		}
		return total;
	}

	public static double divisionOperation(int startValue, int numberTimes, double numberAdded) {
		double total = 0.00;
		for (int i = 0; i < numberTimes; i++) {
			startValue /= numberAdded;
			total = startValue;
		}
		return total;
	}

}

/**
 * Steps taken in the program: 1. User input of letter 2. getArithmeticOperator
 * 3. Enter values: starting, iterations, factor 4. try catch to ensure all
 * input is good 5. pass values into specified methods 6. return total 7. print
 * total
 */
