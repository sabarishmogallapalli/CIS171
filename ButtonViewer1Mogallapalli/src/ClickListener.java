import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**  
* Sabarish Mogallapalli - smogallapalli
* CIS171 27114
* Apr 20, 2022  
*/
public class ClickListener implements ActionListener{
	int i = 0;
	public void actionPerformed (ActionEvent event) {
		i++;
		System.out.println("I was clicked " + i +" times!");
	}
}
