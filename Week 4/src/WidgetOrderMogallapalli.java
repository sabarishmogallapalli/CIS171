
/**  
* Sabarish Mogallapalli - smogallapalli  
* CIS171 27114
* Feb 7, 2022  
*/
import java.util.Scanner;
import java.text.DecimalFormat;

public class WidgetOrderMogallapalli {
	public static void main(String[] args) 
	{
		System.out.print("Please enter the number of widgets purchased:");
		Scanner in = new Scanner (System.in);
		int widgetsPurchased = in.nextInt();
		DecimalFormat df = new DecimalFormat("0.00");
		double finalOrder = orderTotal(widgetsPurchased);
		System.out.println("Order total: $" + df.format(finalOrder));
		in.close();
	}
	public static double orderTotal(int numWidgets)
	{
		final double WIDGET_PRICE = 8.99;
		final double SHIPPING_RATE = 0.20;
		double shippingCharge = numWidgets * SHIPPING_RATE; 
		double totalWidgetPrice = WIDGET_PRICE * numWidgets;
		double taxPrice = totalWidgetPrice * 0.065;
		double orderPrice = totalWidgetPrice + taxPrice + shippingCharge;
		return orderPrice;
	}
	

}
