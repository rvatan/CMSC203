//package lab9inheritance;

/**
 * This is a subclass named SavingsAccount that extends to 
 * its super class named BankAccount
 * @author Ramiz Vatan
 * Date = 04/21/2020
 */

public class SavingsAccount extends BankAccount {
	
	private double rate = 2.5;
	private int savingsNumber = 0;
	private String accountNumber;
	
	public SavingsAccount (String name, double initBalance) {
		super(name, initBalance);
		accountNumber = "";
		this.rate=rate;
	}
	
	public SavingsAccount (SavingsAccount oldAccount, double amount) {
		super(oldAccount, amount);
		savingsNumber += 1;
	}
	
	public void postInterest() {
		rate = (rate/100)/12;
		setBalance((getBalance()*rate)+getBalance());
	}
	
	public String getAccountNumber() {
		savingsNumber += 1;
		accountNumber = super.getAccountNumber() + "-" + savingsNumber;
		return accountNumber;
	}

}
