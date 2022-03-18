import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.Scanner;

/**
 * Sabarish Mogallapalli - smogallapalli CIS171 27114 Mar 11, 2022
 */

public class SortShirtSizesMogallapalli {
	public static void main(String[] args) {
		try {
			String address = "https://bbmedia.dmacc.edu/CIS/CIS171/shirtsizes.txt";
			URL pageLocation = new URL(address);
			Scanner in = new Scanner(pageLocation.openStream());
			in.useDelimiter(",");
			PrintWriter smallOut = new PrintWriter("smallshirts.txt");
			PrintWriter mediumOut = new PrintWriter("mediumshirts.txt");
			PrintWriter largeOut = new PrintWriter("largeshirts.txt");
			PrintWriter extraOut = new PrintWriter("extralargeshirts.txt");
			String size = "";
			String noComma = "";

			while (in.hasNextLine()) {
				size = in.nextLine();
				noComma = size.replace(',', ' ');
				if (size.contains("S,")) {
					smallOut.println(noComma.substring(2, size.length()));
				} else if (size.contains("M,")) {
					mediumOut.println(noComma.substring(2, size.length()));
				} else if (size.contains("XL,")) {
					extraOut.println(noComma.substring(3, size.length()));
				} else if (size.contains("L,")) {
					largeOut.println(noComma.substring(2, size.length()));
				}
			}
			in.close();
			smallOut.close();
			mediumOut.close();
			largeOut.close();
			extraOut.close();
		} catch (IOException exception) {
			System.out.print("https://bbmedia.dmacc.edu/CIS/CIS171/shirtorders2022.txt is not available.");
		}

	}
}
