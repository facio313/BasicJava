package chapter04.exercise;

public class Exercise_Extra4 {
	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		
		while(true) {
			if(i%2 == 0) {
				sum -= i;
			} else {
				sum += i;
			} if(sum>=100) {
				System.out.println(sum);
				break;
			}
			i++;
		}
	}
}