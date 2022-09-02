package chapter08.exercise;

public class Customer {
	private String firstName; //고객이름 
	private String lastName;  //고객 성 
	private BankAccount account;//고객이 소유한 계좌

	public Customer(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public BankAccount getAccount() {
		return account;
	}

	public void setAccount(BankAccount account) {
		this.account = account;
	}

	@Override
	public String toString() {
		return "이름: " + firstName + " " + lastName + ", 잔고: " + account.getBalance() + "";
	}
}