import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Sabarish Mogallapalli - smogallapalli CIS171 27114 Mar 10, 2022
 */

public class FindACityMogallapalli {

	public static void main(String[] args) {
		String[] cityList = { "Des Moines", "St. Louis", "Champaign", "Los Angeles", "Washington D.C.", "San Antonio",
				"San Fransisco", "Las Vegas", "Orlando", "Honolulu" };

		Scanner in = new Scanner(System.in);
		System.out.print("Please choose a city by entering a number between 1 and 10: ");
		int cityNumber = in.nextInt() - 1;
		in.close();
		String cityChoice = "";
		// TODO Auto-generated method stub
		try {
			cityChoice = cityList[cityNumber];
			System.out.print(cityChoice);

		} catch (ArrayIndexOutOfBoundsException exception) {
			System.out.println("The entered input was out of the range of inputs requested.");
			System.out.println(exception.getMessage());
		} catch (InputMismatchException exception) {
			System.out.println("The entered input does not match.");
			System.out.println(exception.getMessage());
		}
	}

}
