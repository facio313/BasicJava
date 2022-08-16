package chapter04.exercise;

public class Exercise_Extra3 {
	public static void main(String[] args) {
		int sum = 0;
		int total = 0;
		
		for(int i = 1; i<=10; i++) {
			sum += i;
			total = total + sum;
		}
		System.out.println(total);
	}
}

