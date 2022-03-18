
/**  
* Sabarish Mogallapalli - smogallapalli  
* CIS171 27114
* Jan 23, 2022  
*/

public class AverageAgeMogallapalli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int BroAge = 12;
		int DadAge = 43;
		int MomAge = 41;
		int MyAge = 17;
		int BirdAge = 8;
		int numFamily = 5;
		double average = 0.00; 
		
		average = (BroAge + DadAge + MomAge + MyAge + BirdAge) / numFamily;
		
		System.out.println("Brother's age is " + BroAge + ".");
		System.out.println("Dad's age is " + DadAge + ".");
		System.out.println("Mom's age is " + MomAge + ".");
		System.out.println("Bird's age is " + BirdAge + ".");
		System.out.println("My age is " + MyAge + ".");
		System.out.println("The average age is " + average + " years old.");	

	}

}
