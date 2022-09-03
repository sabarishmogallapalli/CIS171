import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;

import model.Blanket;
import model.ElectricBlanket;

/**  
* Sabarish Mogallapalli - smogallapalli
* CIS171 27114
* Apr 26, 2022  
*/
public class BlanketTesterMogallapalli {

	public static void main(String[] args) {
		Blanket goldKingCashmere = new Blanket("king", "gold", "cashmere");
		ElectricBlanket redKingCashmere = new ElectricBlanket("king", "red", "cashmere", 5, true);
		Blanket blackTwinWool = new Blanket("twin", "black", "wool");
		ElectricBlanket multiQueenCotton = new ElectricBlanket("queen", "multi-colored", "cotton", 1, false);
		ArrayList<Blanket> blanketArray = new ArrayList<Blanket>();
		blanketArray.add(goldKingCashmere);
		blanketArray.add(redKingCashmere);
		blanketArray.add(blackTwinWool);
		blanketArray.add(multiQueenCotton);
		System.out.println("-----Blankets under $100-----");
		for(Blanket i: blanketArray) {
			if (i.getPrice() < 100) {
				System.out.println(i.featureReport());
			}
		}
		
		Blanket kingCashmere = new Blanket();
		kingCashmere.setMaterial("cashmere");
		kingCashmere.setSize("king");
		System.out.println("\n-----King Cashmere Blanket-----");
		System.out.println(kingCashmere.featureReport());
		System.out.println(checkPrice(kingCashmere));
		System.out.println("\n-----Invalid Size Input Test-----");
		kingCashmere.setSize("twwin"); //KEEP THIS COMMENT HERE TO EXPLAIN WHAT IS HAPPENING: this command tests how the set size handles invalid input. The method uses an if statement to determine whether the input matches the words queen, king, or twin which are the three sizes. If the text in the input does not match up with the text of these three sizes then it throws an illegal argument exception describing to the user that they entered invalid input.
	}
	
	public static String checkPrice(Blanket Blanket) {
		String checkResult = "";
		if (Blanket.getPrice() == 110.00) {
			checkResult = true + ": the price came out as expected, the program accurately works";
		}else {
			checkResult = false + ": the price didn't come out as expected, please check to see if the program accurately works.";
		}
		return checkResult;
	}
	
//	public static String featureReport(Blanket blanket) {
//		DecimalFormat df = new DecimalFormat("###.00");
//		String description = blanket.getColor() + " " + blanket.getSize() + " blanket made from " + blanket.getMaterial() + ", total price: $" + df.format(blanket.getPrice());
//		return description;
//	}

}
