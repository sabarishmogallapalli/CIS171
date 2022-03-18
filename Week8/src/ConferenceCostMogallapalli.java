import java.util.Scanner;

/**
 * Sabarish Mogallapalli - smogallapalli CIS171 27114 Mar 7, 2022
 */

public class ConferenceCostMogallapalli {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int days = 0;
		int tiers = 0;
		int sentinelValue = 999;
		int lowestValue = 1;
		int highestValue = 5;
		System.out.print("Enter the number of days per week the attendee will attend: ");
		days = input.nextInt();
		while (days != sentinelValue) {
			if (lowestValue <= days && days <= highestValue) {
				System.out.print("Enter the tier level that the attendee will attend: ");
				tiers = input.nextInt();
				if (lowestValue <= tiers && tiers <= highestValue) {
					System.out.println("The cost is: " + determineConferenceCost(days, tiers));
					System.out.print("Enter the number of days per week the attendee will attend: ");
					days = input.nextInt();
				} else {
					System.out.print("Invalid input.");
					break;
				}

			} else {
				System.out.print("Invalid input.");
				break;
			}
		}
		input.close();
	}

	public static double determineConferenceCost(int numDays, int tierLevel) {
		int[][] rates = { { 100, 190, 270, 340, 400 }, // Tier 1
				{ 90, 170, 250, 320, 380 }, // Tier 2
				{ 85, 160, 240, 310, 370 }, // Tier 3
				{ 75, 150, 230, 300, 360 } // Tier 4
		};
		int price = rates[numDays - 1][tierLevel - 1];
		return price;
	}
}
