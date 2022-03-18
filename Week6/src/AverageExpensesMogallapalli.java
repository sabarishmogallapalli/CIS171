import java.util.Scanner;
/**  
* Sabarish Mogallapalli - smogallapalli  
* CIS171 27114
* Feb 21, 2022  
*/

public class AverageExpensesMogallapalli {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("How many days of expenses would you like to enter?:");
		int numDays = in.nextInt(); //assigning value to number of days to use in while loop as counter
		int day = 1; //initialize counter
		double averageExpenditure = 0.00;
		double total = 0.00;
		
		while (day <= numDays) {
			Scanner input = new Scanner(System.in);
			System.out.print("Enter the expense: ");
			double dayExpense = input.nextDouble(); //using scanner to receive user input for expense and assigning to variable
			total += dayExpense; //creating a combined total with updated expense
			averageExpenditure = total / day; //calculating average expense over period of days
			day = day + 1; //increasing counter
			input.close();
		}
		System.out.print("The average daily expenditure is: $" + averageExpenditure); // printing out average to console
		in.close();
	}

}
