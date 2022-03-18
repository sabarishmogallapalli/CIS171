import java.util.Scanner;
/**  
* Sabarish Mogallapalli - smogallapalli  
* CIS171 27114
* Feb 15, 2022  
*/

public class MileageRatingMogallapalli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int minValue = 0;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter your gas mileage as a decimal:");
		if (in.hasNextDouble()) {
			Double mileageGas = in.nextDouble();
			if(mileageGas >= minValue) {
				String scaleRating = MileageRatingMogallapalli.mileageRatingScale(mileageGas);
				System.out.print("Your mileage Rating Scale is: " + scaleRating);	
			}
			else {
				System.out.println("Input error.");
			}
		} else {
			System.out.println("Input error.");
		}
		in.close();
	}
	public static String mileageRatingScale (double gasMileage) {
		int levelThree = 40;
		int levelTwo = 30;
		int levelOne = 20;
		String ratingScale = "";
		if (gasMileage >= levelThree) {
			ratingScale = "Excellent";
		}
		else if (gasMileage >= levelTwo) {
			ratingScale = "Good";
		}
		else if (gasMileage >= levelOne) {
			ratingScale = "Fair";
		}
		else if (gasMileage < levelOne) {
			ratingScale = "Poor";
		}
		return ratingScale;
	} 
	
}
