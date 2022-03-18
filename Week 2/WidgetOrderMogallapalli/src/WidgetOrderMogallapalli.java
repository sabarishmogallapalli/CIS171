
/**  
* Sabarish Mogallapalli - smogallapalli  
* CIS171 27114
* Jan 20, 2022  
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
		final double WIDGET_PRICE = 8.99;
		final double TAX_RATE =0.065;
		final double SHIPPING_RATE = 0.20;
		double shippingCharge = widgetsPurchased * SHIPPING_RATE; 
		double totalWidgetPrice = WIDGET_PRICE * widgetsPurchased;
		double taxPrice = totalWidgetPrice * 0.065;
		double orderPrice = totalWidgetPrice + taxPrice + shippingCharge;
		System.out.println("Number of widgets purchased: " + widgetsPurchased);
		System.out.println("Subtotal: $" + df.format(totalWidgetPrice));
		System.out.println("Tax: $" + df.format(taxPrice));
		System.out.println("Shipping: $" + df.format(shippingCharge));
		System.out.println("Order total: $" + df.format(orderPrice));
		
	}

}
