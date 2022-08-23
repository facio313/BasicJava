package chapter04.exercise;

public class Exercise_Extra8 {
	public static void main(String[] args) {
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 3; j++) {
				int sum = i*j;
				System.out.println(i + "*" + j + "=" + sum);
			}
		}
	}
}