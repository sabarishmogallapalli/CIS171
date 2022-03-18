
/**  
* Sabarish Mogallapalli - smogallapalli  
* CIS171 27114
* Feb 7, 2022  
*/

public class CompoundInterestMogallapalli {

	public static void main(String[] args) {
		System.out.printf("Your total is $%.2f", computeBalance(10000, .045, 13));

		System.out.printf("\nYour total is $%.2f", computeBalance(20000, .03, 15));

		System.out.printf("\nYour total is $%.2f", computeBalance(30000, .01, 20));



	}
	public static double computeBalance(double deposit, double interestRate, double numYears) 
	{
		double interestParentheses = 1 + interestRate; 
		double timeExponent = Math.pow(interestParentheses, numYears);
		double futureValue = timeExponent * deposit;
		return futureValue;
	}

}
