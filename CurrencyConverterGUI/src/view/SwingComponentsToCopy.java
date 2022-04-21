package view;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**  
* Sabarish Mogallapalli - smogallapalli
* CIS171 27114
* Apr 20, 2022  
*/
public class SwingComponentsToCopy {
	
	private JLabel title = new JLabel("     ~~ Currency Converter ~~      ");
	private JLabel dollarText = new JLabel("Convert US Dollar: ");
	private JTextField dollarField = new JTextField(5);
	
	private JLabel euroText = new JLabel("       To Euro: ");
	private JTextField euroField = new JTextField(5);
	
	private JLabel gbpText = new JLabel("To British Pounds: ");
	private JTextField gbpField = new JTextField(5);
	
	private JButton calculateButton = new JButton("Calculate");
	private JButton clearButton = new JButton("Clear");
}
