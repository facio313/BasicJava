package chapter08.exercise;

public abstract class BankAccount {
	/* api문서란? /**로 시작?
	 * 게좌의 잔액
	 */
	private int balance;

	public BankAccount(int blance) {
		this.balance = blance;
	}

	public int getBalance() {
		return this.balance;
	}

	public void deposit(int amount) {
		balance += amount;
	}
	 /* 출금 메소드
	 * param amount 출금할 금액
	 * return 출금 성공 시 true, 실패 시 false 반환
	 */
	
	public boolean withdraw(int amount) {
		if (balance >= amount) {
			this.balance -= amount;
			return true;
		}
		return false;
	}
	 /* 이체 메소
	  * @param amount 이체할 금액
	  * @param otherAccount  이체될 계좌번
	  * @return 이체 성공 시 true, 실패 시 false 반환
	  */

	public boolean transfer(int amount, BankAccount otherAccount) {
		if (withdraw(amount)) {
			otherAccount.deposit(amount);
			return true;
		}
		return false;

//		if (balance - amount <= 0) {
//			return false;
//		}
//		this.balance -= amount;
//		otherAccount.deposit(amount);
//		return true;
	}
	
	public String toString() {
//		return String.format()
		return "잔고: " + this.balance;
	}
	
	public String getAccountType() {
		return accountType;
	}
}