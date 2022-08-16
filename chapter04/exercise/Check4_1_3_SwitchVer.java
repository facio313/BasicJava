package chapter04.exercise;

import java.util.Scanner;

public class Check4_1_3_SwitchVer {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("점수 입력: ");	
		int score = scanner.nextInt();
		System.out.println("등급은 ");
		switch (score/10) {
		case 9: 
			System.out.println("A입니다.");
			break;
		case 8:
			System.out.println("B입니다.");
			break;
		case 7:
			System.out.println("C입니다.");
			break;
		default:
			System.out.println("D입니다.");
			break;
		}
	}
}
