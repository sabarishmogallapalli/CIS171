/**  
* Sabarish Mogallapalli - Your DMACC Username  
* CIS171 27114
* 3/28/2022
*/ 

public class Pizza {
	private String topping;
	private String size;
	private double price;
	
	public Pizza(){
		setTopping("cheese");
		setSize("large");
		setPrice(9.99);
	}
	
	public Pizza(String topping, String size, double price) {
		setTopping(topping);
		setSize(size);
		setPrice(price);
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
		this.size = size;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String repeatOrder() {
		String order = "You ordered a " + this.getSize() + " " + this.getTopping() + " pizza for $" + this.getPrice() + ".";
		return order;
	}

	@Override
	public String toString() {
		return "Pizza [topping=" + topping + ", size=" + size + ", price=" + price + "]";
	}
	
}
