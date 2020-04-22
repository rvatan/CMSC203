//package lab9inheritance;

/**
 * This is a subclass named CheckingAccount that extends to 
 * its super class named BankAccount
 * @author Ramiz Vatan
 * Date = 04/21/2020
 */

public class CheckingAccount extends BankAccount {
	
	private final static double FEE = 0.15;
	
	public CheckingAccount (String name, double initAmount) {
		super(name,initAmount);
		setAccountNumber(getAccountNumber()+"-10");
	}
	
	
	public boolean withdraw (double amount) {
		amount += FEE;
		return super.withdraw(amount);
	}
	
	

}
