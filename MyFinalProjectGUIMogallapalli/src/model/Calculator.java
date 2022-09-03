package model;

/**  
* Sabarish Mogallapalli - smogallapalli
* CIS171 27114
* May 2, 2022  
*/

//This class holds most all of the business logic for the calculator program
public class Calculator {
	private double startingValue;
	private double factor;
	private double numTimes;
	private double total;
	
	//empty constructor
	public Calculator() {
		super();
		this.startingValue = 0;
		this.factor = 1;
		this.numTimes = 1;
	}
	
	//constructor with fields
	public Calculator(double startingValue, double factor, double numTimes) {
		super();
		this.startingValue = startingValue;
		this.factor = factor;
		this.numTimes = numTimes;
	}
	
	//getter and setter methods for fields
	public double getStartingValue() {
		return startingValue;
	}
	public void setStartingValue(double startingValue) {
		this.startingValue = startingValue;
	}
	public double getFactor() {
		return factor;
	}
	public void setFactor(double factor) {
		this.factor = factor;
	}
	public double getNumTimes() {
		return numTimes;
	}
	public void setNumTimes(double numTimes) {
		this.numTimes = numTimes;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	
	//This method is called when the user presses the add button on the JPanel and it takes the startingValue and adds the factor to the startingValue the amount of times has been entered through the use of a loop with a increment operator and returns the total
	public double addTotal(double startingValue, double factor, double numTimes) {
		double totalCalculate = 0.00;
		for (int i = 0; i < numTimes; i++) {
			startingValue += factor;
			totalCalculate = startingValue;
		}
		return totalCalculate;
	}
	//This method is called when the user presses the subtract button on the JPanel and it takes the startingValue and subtracts the factor from the startingValue the amount of times has been entered through the use of a loop with a increment operator and returns the total
	public double subTotal(double startingValue, double factor, double numTimes) {
		double totalCalculate = 0.00;
		for (int i = 0; i < numTimes; i++) {
			startingValue -= factor;
			totalCalculate = startingValue;
		}
		return totalCalculate;
	}
	//This method is called when the user presses the multiply button on the JPanel and it takes the startingValue and multiplies the factor to the startingValue the amount of times has been entered through the use of a loop with a increment operator and returns the total
	public double multiplyTotal(double startingValue, double factor, double numTimes) {
		double totalCalculate = 0.00;
		for (int i = 0; i < numTimes; i++) {
			startingValue *= factor;
			totalCalculate = startingValue;
		}
		return totalCalculate;
	}
	//This method is called when the user presses the divide button on the JPanel and it takes the startingValue and divides the factor from the startingValue the amount of times has been entered through the use of a loop with a increment operator and returns the total
	public double divideTotal(double startingValue, double factor, double numTimes) {
		double totalCalculate = 0.00;
		for (int i = 0; i < numTimes; i++) {
			startingValue /= factor;
			totalCalculate = startingValue;
		}
		return totalCalculate;
	}
	
}
