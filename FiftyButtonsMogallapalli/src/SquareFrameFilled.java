import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SquareFrameFilled {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		int i = 1;
		String buttonLabel = String.valueOf(i);
		JButton button = new JButton(buttonLabel);
		JLabel name = new JLabel("Sabarish");
		panel.add(name);
		
		for(i = 1; i <= 51; i++) {
			button = new JButton(buttonLabel);
			buttonLabel = String.valueOf(i);
			panel.add(button);
		}
		
		panel.add(button);
		frame.add(panel);
		final int FRAME_WIDTH = 300;
		final int FRAME_HEIGHT = 100;
		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		frame.setTitle("A frame with two components");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);	
	}
}
