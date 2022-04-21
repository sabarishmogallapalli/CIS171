import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
/**  
* Sabarish Mogallapalli - smogallapalli
* CIS171 27114
* Apr 20, 2022  
*/
public class ButtonFrame1 extends JFrame{
	private static final int FRAME_WIDTH = 100;
	private static final int FRAME_HEIGHT = 60;
	
	public ButtonFrame1() {
		createComponents();
		setSize(FRAME_WIDTH,FRAME_HEIGHT);
	} 
	
	private void createComponents() {
		JButton a = new JButton("A: Click me!");
		JButton b = new JButton("B: Click me!");
		JPanel panel = new JPanel();
		panel.add(a);
		panel.add(b);
		add(panel);
		
		ActionListener listenerA = new ClickListener();
		ActionListener listenerB = new ClickListener();
		a.addActionListener(listenerA);
		b.addActionListener(listenerB);
	}
}
