package chapter04.exercise;

public class Exercise_Extra2 {
	public static void main(String[] args) {
		int sum = 0;
	
		for(int i=1; i<=20; i++) {
			if(i%2 != 0&&i%3 != 0) {
				sum += i;
			} 
		}
		System.out.println("실행결과: " + sum);
	}
	
}