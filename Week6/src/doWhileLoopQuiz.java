
/**  
* Sabarish Mogallapalli - smogallapalli  
* CIS171 27114
* Feb 21, 2022  
*/

public class doWhileLoopQuiz {

	public static void main(String[] args) {
		double d;
		double x = Math.random() * 100;
		do 
		{
			d = Math.sqrt(x) * Math.sqrt(x) - x;
			System.out.println(d);
			x = Math.random() * 1001;
		}
		while (d != 0);
	}
}
