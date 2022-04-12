import java.util.ArrayList;

public class Order {
	private double orderTotal;
	private ArrayList<Pizza> orderList;
	
	public Order() {
		System.out.println("A new order has been created");
		orderList = new ArrayList<Pizza>();
	}

	public double getOrderTotal() {
		return orderTotal;
	}
	
	public void addToOrder(Pizza p) {
		orderList.add(p);
		this.orderTotal += p.getPrice();
	}
}
