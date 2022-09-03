import javax.swing.JFrame;
import javax.swing.JPanel;

/**  
* Sabarish Mogallapalli - smogallapalli
* CIS171 27114
* Apr 25, 2022  
*/
public class BankAccountViewerMogallapalli {
	//Sabarish Mogallapalli
	public static void main(String[] args) {
		BankAccount accountOne = new BankAccount(500);
		JFrame frame = new JFrame ();
		JPanel panelOne = new BankAccountPanel(accountOne);
		frame.add(panelOne);
		frame.setSize(400, 400);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}

}
