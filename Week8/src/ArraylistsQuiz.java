import java.util.ArrayList;

/**
 * Sabarish Mogallapalli - smogallapalli CIS171 27114 Mar 8, 2022
 */

public class ArraylistsQuiz {
	public static void main(String[] args) {
		ArrayList<String> cityList = new ArrayList<String>();
		cityList.add("London");
		cityList.add("New York");
		cityList.add("Paris");
		cityList.add("Toronto");
		cityList.add("Hong Kong");
		cityList.add("Singapore");
		System.out.print(cityList.size());
		System.out.print(" " + cityList.contains("Toronto"));
		System.out.print(" " + cityList.indexOf("New York"));
		System.out.print(" " + cityList.isEmpty());

	}
}
