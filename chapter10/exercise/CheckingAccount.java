package chapter10.exercise;

public class CheckingAccount extends BankAccount{
	private int balance;
	
	public CheckingAccount(int balance) {
		super(balance);
		this.balance = balance;
	}

	@Override
	public String getAccountType() {
		// TODO Auto-generated method stub
		return null;
	}
}
