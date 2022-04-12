/**  
* Sabarish Mogallapalli - Your DMACC Username  
* CIS171 27114
* 3/28/2022
*/ 

public class Pizza extends MenuItem {
	private String topping;
	private String size;
	private double price;
	private int orderNumber;
	private static int nextOrderNumber = 1001;
	

	public Pizza(String topping, String size, double price) {
		setTopping(topping);
		setSize(size);
		setPrice(price);
		
		nextOrderNumber++;
		orderNumber = nextOrderNumber;
		
		if(getSize() == null) {
			throw new IllegalArgumentException("Object not created");
		}
	}
	
	public String getTopping() {
		return topping;
	}
	
	public void setTopping(String topping) {
		this.topping = topping;
	}
	
	public String getSize() {
		return size;
	}
	
	public void setSize(String size) {
		this.size = size.toLowerCase();
		if (this.size.equals("small")) {
			this.size = "small";
		}
		else if (this.size.equals("medium")) {
			this.size = "medium";
		}
		else if (this.size.equals("large")) {
			this.size = "large";
		}
		else if (this.size.equals("extra large")) {
			this.size = "extra large";
		}
		else {
			this.size = null;
		}
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getOrderNumber() {
		return orderNumber;
	}
	
	public static Pizza quickOrder(String topping) {
		Pizza p = new Pizza(topping, "large", 9.99);
		return p;
	}

	public String repeatOrder() {
		String order = super.getDescription() + ". Your order number is: " + this.getOrderNumber() +  " and you ordered a " + this.getSize() + " " + this.getTopping() + " pizza for $" + this.getPrice() + ".";
		return order;
	}

	@Override
	public String toString() {
		return "Pizza [order number=" + orderNumber + ", topping=" + topping + ", size=" + size + ", price=" + price + "]";
	}
	
}
