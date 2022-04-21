import javax.swing.JFrame;
import javax.swing.JPanel;

import view.CurrencyPanel;
/**  
* Sabarish Mogallapalli - smogallapalli
* CIS171 27114
* Apr 20, 2022  
*/
public class StartProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		JPanel panel = new view.CurrencyPanel();
		
		frame.add(panel);
		
		frame.setSize(250, 250);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
