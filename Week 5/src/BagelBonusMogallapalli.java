import java.util.Scanner;
import java.text.DecimalFormat;
/**  
* Sabarish Mogallapalli - smogallapalli  
* CIS171 27114
* Feb 15, 2022  
*/

public class BagelBonusMogallapalli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int toPercent = 100;
		DecimalFormat percentFormat = new DecimalFormat("#.##");
		DecimalFormat moneyFormat = new DecimalFormat("#.##");
		Scanner in = new Scanner(System.in);
		System.out.print("Monthly amount spent at the Bagel Shop: ");
		double input = Double.parseDouble(in.nextLine()); 
		double discountValue = BagelBonusMogallapalli.DiscountCouponCalculator(input);
		double discountMade = (BagelBonusMogallapalli.DiscountCouponCalculator(input) * input);
		int cupsOfCoffee = BagelBonusMogallapalli.CoffeeRewards(input); 
		System.out.println("You receive a discount coupon of $" + moneyFormat.format(discountMade) + ". (" + percentFormat.format(discountValue * toPercent) + "% of your previous month's purchase)");
		System.out.println("You have earned " + cupsOfCoffee + " cup(s) of coffee.");
		in.close();
	}
	
	public static double DiscountCouponCalculator (double monthlySpent) {
		double firstPurchaseRange = 0;
		double secondPurchaseRange = 20.01;
		double thirdPurchaseRange = 35.01;
		double fourthPurchaseRange = 75.01;
		double fifthPurchaseRange = 150;
		double firstPercentDiscount = 0;
		double secondPercentDiscount = 0.05;
		double thirdPercentDiscount = 0.07;
		double fourthPercentDiscount = 0.09;
		double fifthPercentDiscount = 0.12;
		double discountEarned = 0;
		if(monthlySpent > fifthPurchaseRange) {
			discountEarned = fifthPercentDiscount;
		}
		else if (monthlySpent >= fourthPurchaseRange ) {
			discountEarned = fourthPercentDiscount;
		}
		else if (monthlySpent >= thirdPurchaseRange) {
			discountEarned = thirdPercentDiscount;
		}
		else if (monthlySpent >= secondPurchaseRange) {
			discountEarned = secondPercentDiscount;
		}
		
		else if (monthlySpent < secondPurchaseRange){
			discountEarned = firstPercentDiscount;
		}
		return discountEarned;
	}
	
	public static int CoffeeRewards (double monthlySpent) {
		double coffeesEarned = 0;
		double firstPurchaseRange = 25.00;
		double secondPurchaseRange = 50.00;
		double thirdPurchaseRange = 50.01;
		double fourthPurchaseRange = 100.00;
		double fifthPurchaseRange = 100.01;
		int coffeeCups = 0;
		if (monthlySpent > fifthPurchaseRange) {
			coffeeCups = 3;
		}
		else if (monthlySpent > thirdPurchaseRange) {
			coffeeCups = 2;
		}
		else if (monthlySpent > firstPurchaseRange) {
			coffeeCups = 1;
		}
		return coffeeCups;
	}
}
