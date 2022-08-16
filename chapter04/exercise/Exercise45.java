package chapter04.exercise;

import java.util.Random;
import java.util.Scanner;

public class Exercise45 {
	public static void main(String[] args) {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		
		int mystery = random.nextInt(100) + 1;
		System.out.println(mystery);
		
		while (true) {
			System.out.print("1부터 100 사이의 정수 중 하나를 선택하세요: ");
			int type = scanner.nextInt();
			if(type > mystery) {
				System.out.println("정답은 더 작은 수입니다."); 
			} else if(type < mystery) {
				System.out.println("정답은 더 큰 수입니다.");
			} else break;
		}
		System.out.println("정답입니다.");
		System.out.println("게임을 종료합니다.");
		
//		while (run) {
//			System.out.print("1부터 100 사이의 정수 중 하나를 선택하세요: ");
//			int type = scanner.nextInt();
//			if(type > mystery) {
//				System.out.println("정답은 더 작은 수입니다."); 
//			} else if(type < mystery) {
//				System.out.println("정답은 더 큰 수입니다.");
//			} else {
//		System.out.println("정답입니다.");
//		System.out.println("게임을 종료합니다.");
//		break;
//		}
	}
}

// 이진탐색(가장 빠른 알고리즘 - 대신 정렬이 돼있어야 함)