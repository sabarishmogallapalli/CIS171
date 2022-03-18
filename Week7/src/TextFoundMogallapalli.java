import java.util.Scanner;

/**
 * Sabarish Mogallapalli - smogallapalli CIS171 27114 Feb 28, 2022
 */

public class TextFoundMogallapalli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Boolean vowelFinder = false;
		while (!vowelFinder) {
			System.out.println("Enter a line of input: ");
			String line = input.nextLine();
			if (line.contains("exit")) {
				break;
			} else {
				vowelFinder = businessLogic(line);
				if (vowelFinder == true) {
					break;
				} else {
					continue;
				}
			}

		}
		input.close();
	}

	public static boolean businessLogic(String word) {
		boolean pattern = false;
		if (word.contains("ee")) {
			pattern = true;
		} else if (word.contains("oo")) {
			pattern = true;
		} else {
			pattern = false;
		}
		return pattern;
	}

}
