import javax.swing.JOptionPane;
/**  
* Sabarish Mogallapalli - smogallapalli  
* CIS171 27114
* Feb 1, 2022  
*/

public class PowerZoneMogallapalli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String idInput = JOptionPane.showInputDialog("Enter member ID: ");
		String id = (idInput.substring(0,2) + "-" + idInput.substring(2, 5) + "-" + idInput.substring(5)).toUpperCase();
		String numInput = JOptionPane.showInputDialog("Enter number of minutes for the massage: ");
		int minutes = Integer.parseInt(numInput);
		int hours = minutes / 60;
		int remaining = minutes % 60;
		String time = hours + " hour and " + remaining + " minutes."; 
		String output = "Thank you, Member " + id + " for your massage reservation for " + time;
		JOptionPane.showMessageDialog(null, output);

	}

}
