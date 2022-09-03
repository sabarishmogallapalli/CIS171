package model;

import java.text.DecimalFormat;

/**  
* Sabarish Mogallapalli - smogallapalli
* CIS171 27114
* Apr 26, 2022  
*/
public class Blanket {
	private String size;
	private String color;
	private String material;
	public double price;
	public Blanket() {
		super();
		this.size = "twin";
		this.color = "blue";
		this.material = "wool";
		this.price = 25.00;
	}
	
	public Blanket(String size, String color, String material) {
		super();
		this.price = 25.00;
		setSize(size.toLowerCase());
		this.color = color.toLowerCase();
		setMaterial(material.toLowerCase());
	}

	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
		if (this.size.contentEquals("queen")) {
			this.price += 25.00;
		}else if (this.size.contentEquals("king")) {
			this.price += 40.00;
		}else if (this.size.contentEquals("twin")) {
			this.price = 25.00;
		}else {
			throw new IllegalArgumentException("Invalid input. Please only enter the following sizes: twin, queen, or king");
		}
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
		if (this.material.contentEquals("wool")) {
			this.price += 20.00;
		}else if (this.material.contentEquals("chenille")) {
			this.price += 30.00;
		}else if (this.material.contentEquals("cashmere")) {
			this.price += 45.00;
		}
	}
	public double getPrice() {
		return price;
	}

	public String featureReport() {
		DecimalFormat df = new DecimalFormat("###.00");
		String description = getColor() + " " + getSize() + " blanket made from " + getMaterial() + ", total price: $" + df.format(getPrice());
		return description;
	}
}
