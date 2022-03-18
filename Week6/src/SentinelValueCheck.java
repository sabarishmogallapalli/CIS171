import java.util.Scanner;
/**  
* Sabarish Mogallapalli - smogallapalli  
* CIS171 27114
* Feb 22, 2022  
*/

public class SentinelValueCheck {
public static void main(String[] args) 
{
	Scanner in = new Scanner(System.in);
	int sum = 0;
	int userInput;
	int totalValuesEntered = 0;
	
	System.out.println("Enter a whole number: ");
	do {
		userInput = in.nextInt();
		sum += userInput;
		totalValuesEntered++;
	}
	while(userInput != 0);
	System.out.println("Average of all numbers: " + sum/totalValuesEntered);
	in.close();
}
}
