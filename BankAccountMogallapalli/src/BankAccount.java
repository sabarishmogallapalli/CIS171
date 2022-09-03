
/**  
* Sabarish Mogallapalli - smogallapalli
* CIS171 27114
* Apr 25, 2022  
*/
public class BankAccount {
	private double balance;

	public BankAccount(double balance) {
		super();
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public double deposit(double depositAmount) {
		balance += depositAmount;
		return balance;
	}
	
	public double withdraw(double depositAmount) {
		balance -= depositAmount;
		return balance;
	}
}
