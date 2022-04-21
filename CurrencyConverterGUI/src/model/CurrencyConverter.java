package model;

/**  
* Sabarish Mogallapalli - smogallapalli
* CIS171 27114
* Apr 20, 2022  
*/
public class CurrencyConverter {
	private double usDollars;
	private double euros;
	private double britishPounds;
	private final double USD_TO_EUROS_RATE = .91403;
	private final double USD_TO_GBP_RATE = .80240;
	public CurrencyConverter() {
		super();
	}
	public CurrencyConverter(double usDollars) {
		super();
		this.usDollars = usDollars;
		doConversion();
	}
	public double getUsDollars() {
		return usDollars;
	}
	public void setUsDollars(double usDollars) {
		this.usDollars = usDollars;
		doConversion();
	}
	public double getEuros() {
		return euros;
	}
	public void setEuros(double euros) {
		this.euros = euros;
	}
	public double getBritishPounds() {
		return britishPounds;
	}
	public void setBritishPounds(double britishPounds) {
		this.britishPounds = britishPounds;
	}
	
	public void doConversion() {
		this.euros = this.usDollars * USD_TO_EUROS_RATE;
		this.britishPounds = this.usDollars * USD_TO_GBP_RATE;
	}
	
}
