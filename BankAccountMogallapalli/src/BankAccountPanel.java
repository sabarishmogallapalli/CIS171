import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**  
* Sabarish Mogallapalli - smogallapalli
* CIS171 27114
* Apr 25, 2022  
*/
public class BankAccountPanel extends JPanel{
	BankAccount account;
	private JLabel amount = new JLabel("Amount:");
	private JTextField amountHolder = new JTextField(10);
	private Button withdraw = new Button("Withdraw");
	private Button deposit = new Button("Deposit");
	private JLabel balance = new JLabel("Balance:");
	public BankAccountPanel(BankAccount b) {
		super();
		account = b;
		DepositClickListener d = new DepositClickListener();
		WithdrawClickListener w = new WithdrawClickListener();
		deposit.addActionListener(d);
		withdraw.addActionListener(w);
		add(amount);
		add(amountHolder);
		add(deposit);
		add(withdraw);
		add(balance);
	}
	class DepositClickListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent event) {
			String depositText = amountHolder.getText();
			try {
				double depositAmount = Double.parseDouble(depositText);
				account.deposit(depositAmount);	
			}
			catch (Exception e) {
				System.out.println("Invalid input, please try again. " + e.getMessage());
			}
			balance.setText("balance=$" + account.getBalance());
		}
	}
	class WithdrawClickListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent event) {
			String withdrawText = amountHolder.getText();
			try {
				double withdrawAmount = Double.parseDouble(withdrawText);
				account.withdraw(withdrawAmount);	
			}
			catch (Exception e) {
				System.out.println("Invalid input, please try again. " + e.getMessage());
			}
			balance.setText("balance=$" + account.getBalance());
		}
	}
}
