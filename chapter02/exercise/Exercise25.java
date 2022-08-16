package chapter02.exercise;

import java.util.Scanner;

public class Exercise25 {
	public static void main(String[] args) {
		//입력
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("500원짜리 동전의 갯수: ");
		int fiveH = scanner.nextInt();//coin500
		System.out.print("100원짜리 동전의 갯수: ");
		int oneH = scanner.nextInt();
		System.out.print("50원짜리 동전의 갯수: ");
		int fiveT = scanner.nextInt();
		System.out.print("10원짜리 동전의 갯수: ");
		int oneT = scanner.nextInt();
		//처리
		int total = 500*fiveH + 100*oneH + 50*fiveT + 10*oneT;
		//출력	
		System.out.println("저금통 안의 동전의 총 액수 : " + total);
		System.out.printf("총 금액: %,d", total);
	}
}