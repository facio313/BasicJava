package chapter04;

import java.util.Scanner;

public class BreakOutterExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("생략할 곱하기: ");
		int dan = scanner.nextInt();
		
		for (int i = 2; i <= 9; i++) {
//			System.out.println(i + "단");
			System.out.println("");
			for (int j = 1; j <= 9; j++) {
				if(dan == j) {
					continue;
				}
				System.out.println(i + " * " + j + " = " + i * j);
			}
		}
	}
}