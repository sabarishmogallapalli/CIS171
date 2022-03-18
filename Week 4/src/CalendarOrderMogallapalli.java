
/**  
* Sabarish Mogallapalli - smogallapalli  
* CIS171 27114
* Feb 7, 2022  
*/

public class CalendarOrderMogallapalli {

	public static void main(String[] args) {
		System.out.printf("Your total is $%.2f", computeOrderTotal(11.99));
		
		System.out.printf("\nYour total is $%.2f", computeOrderTotal(11.99,3));
		
		System.out.printf("\nYour total is $%.2f", computeOrderTotal(11.99, 3, .1));

	}
	public static double computeOrderTotal(double calendarPrice) {
		double taxPrice = calendarPrice * 0.07;
		double totalDue = calendarPrice + taxPrice;
		return totalDue;
	}
	public static double computeOrderTotal(double calendarPrice, int quantityOrdered) 
	{
		double subtotalDue = calendarPrice * quantityOrdered;
		double taxPrice2 = subtotalDue * 0.07;
		double totalDue2 = subtotalDue + taxPrice2;
		return totalDue2;
	}
	public static double computeOrderTotal(double calendarPrice, int quantityOrdered, double couponValue) 
	{
		double subtotalDue2 = quantityOrdered * calendarPrice;
		double couponDiscount = couponValue * subtotalDue2;
		double subtotalReduction = subtotalDue2 - couponDiscount;
		double taxPrice3 = subtotalReduction * 0.07;
		double totalDue3 = subtotalReduction + taxPrice3;
		return totalDue3;
	}

}
