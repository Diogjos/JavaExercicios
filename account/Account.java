package account;

public class Account {
	
	private String name;
	private double balance;
	
	public Account (String name, double balance) {
		this.name = name;
		
			if (balance > 0) {
			this.balance = balance;
		}
	}
	
	public void deposit(double depositAmount) {
		
		if (depositAmount > 0) {
			balance = balance + depositAmount;
		}
	}
	
	public void withdraw(double withdrawAmmount) {
		
		if (balance > 0) {
			balance = balance - withdrawAmmount;
		} 
		
	}

	public double getBalance() {
		return balance;
	}

	public void setName (String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;	
	}
	
}
