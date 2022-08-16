package chapter02.exercise;

import java.util.Scanner;

public class Check2_4_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫 번째 수: ");
		String strNum1 = scanner.nextLine();
		
		System.out.print("두 번째 수: ");
		String strNum2 = scanner.nextLine();

/*
 * scanner에서 문자열 받기
 * next() => 공백을 입력하거나 엔터를 입력했을 때까지의 글자를 변환
 * nextLine() => 엔터를 입력했을 때까지의 글자를 반환(보통 이게 더 많음)
 */
		
		
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		int result = num1 + num2;
		System.out.println("덧셈 결과: " + result);
		
		/*Scanner scanner = new Scanner(System.in);
		 * System.out.print("첫 번째 수: ");
		 * int num1 = scanner.nextInt();
		 * String strNum1 = scanner.nextLine();
		 * System.out.print("두 번째 수: ");
		 * int num2 = scanner.nextInt();
		 * String strNum2 = scanner.nextLine();
		 */
		
//		byte byteValue = 10;
//		double result = byteValue + byteValue;
//		System.out.println(result);
	}
}
