package chapter04;

import java.util.Random;

public class SwitchCaseExample {
	public static void main(String[] args) {
		Random random = new Random();
		int num = random.nextInt(6) + 1;
		switch (num) {
		case 1:
			System.out.println("1");
			break; // break를 만날 때까지 실행됨
		case 2:
			System.out.println("2");
		case 3:
			System.out.println("3");
		case 4:
			System.out.println("4");
			break;
		case 5:
			System.out.println("5");
		case 6:
			System.out.println("6");
			break;
		default:
			break;
		}
	}
}
