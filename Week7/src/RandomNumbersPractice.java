import java.util.Random;
import java.util.Scanner;

/**
 * Sabarish Mogallapalli - smogallapalli CIS171 27114 Mar 1, 2022
 */

public class RandomNumbersPractice {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random r = new Random();
		System.out.println("How many random numbers do you want to see: ");
		int randNums = input.nextInt();
		System.out.println("Smallest number: ");
		int minLimit = input.nextInt();
		System.out.println("Largest number: ");
		int maxLimit = input.nextInt();
		for (int i = 0; i < randNums; i++) {
			int randomNumber = r.nextInt((maxLimit - minLimit) + 1) + minLimit;
			System.out.println(randomNumber);
		}
		input.close();
	}
}
