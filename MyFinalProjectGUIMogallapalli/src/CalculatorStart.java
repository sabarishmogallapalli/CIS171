import javax.swing.JFrame;
import javax.swing.JPanel;

import view.CalculatorPanel;
/**  
* Sabarish Mogallapalli - smogallapalli
* CIS171 27114
* May 2, 2022  
*/

//creates and instantiates the display and opens up the viewer
public class CalculatorStart {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		JPanel panel = new view.CalculatorPanel();
		
		frame.add(panel);
		
		frame.setSize(215, 260);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
