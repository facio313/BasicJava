package chapter07.exercise;

public class Bank {
	private Customer[] customers; //하나의 은행에 여러 명!
	private int numberOfCustomers; // 필드의 값을 초기화할 때 생성자를 많이 사용 
	
	public Bank() {
		customers = new Customer[10];
	}

	public void addCustomer(Customer customer) {
		this.customers[numberOfCustomers++] = customer;
		//numberOfCustomers++;
	}
	

	public int getNumberOfCustomers() { // set은 안 쓰이는 이유?
		return numberOfCustomers;

	}

	public Customer[] getCustomers() {
		return customers;
	}

	/*
	 * 배열의 index번째 고객(customer) 객체를 반
	 * @param index 
	 * @return
	 */
	public Customer getCustomer(int index) {
		return customers[index];
	}
}