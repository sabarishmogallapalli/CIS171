import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.Scanner;

/**
 * Sabarish Mogallapalli - smogallapalli CIS171 27114 Mar 11, 2022
 */

public class ExceptionHandlingCheck {
	public static void main(String[] args) {
		PrintWriter outputFile = null;
		try {
			outputFile = new PrintWriter("Test.txt");
			writeData(outputFile);
		}
		catch (IOException exception) {
			System.out.print(true);
		}
		finally {
			outputFile.close();
		}
		
	}

	private static void writeData(PrintWriter outputFile) {
		// TODO Auto-generated method stub

	}
}
