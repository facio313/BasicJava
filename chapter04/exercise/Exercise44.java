package chapter04.exercise;

import java.util.Scanner;

public class Exercise44 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("가위 바위 보 게임");
		
		System.out.print("철수: ");
		String cheol = scanner.next();		
		System.out.print("영희: ");
		String young = scanner.next();
		
		String result = ""; // String도 일단 빈 값 넣어놓는 것인가? null을 넣으면 마지막에 null로 찍힘
		if(cheol.equals(young)) {
			result = "비김";
		} else if(cheol.equals("가위") && young.equals("바위")
				|| cheol.equals("바위") && young.equals("보")
				|| cheol.equals("보") && young.equals("가위")) {
			result = "영희 승리!";
		} else {
			result = "철수 승리!";
		}
		System.out.println("결과: " + result);
	}
} // 결과가 뭔지 생각해서 적용해라!! --> 철수랑 영희랑 가위바위보 해서 나올 결과는 1. 비기거나, 2. 영희가 이기거나, 3. 철수가 이기거나.

//		String versus = cheol + young;
//		switch(versus) {
//		case "가위바위":
//			if("바위".equals(cheol)) {
//				System.out.println("결과: 철수 승리!");
//			} else {
//				System.out.println("결과: 영희 승리!");
//			} break;
//		case "바위가위":
//			if("바위".equals(cheol)) {
//				System.out.println("결과: 영희 승리!");
//			} else {
//				System.out.println("결과: 철수 승리!");
//			} break;
//		case "가위보":
//			if("보".equals(cheol)) {
//				System.out.println("결과: 철수 승리!");
//			} else {
//				System.out.println("결과: 영희 승리!");
//			} break;
//		case "보가위":
//			if("보".equals(cheol)) {
//				System.out.println("결과: 영희 승리!");
//			} else {
//				System.out.println("결과: 철수 승리!");
//			} break;	
//		case "바위보":
//			if("보".equals(cheol)) {
//				System.out.println("결과: 철수 승리!");
//			} else {
//				System.out.println("결과: 영희 승리!");
//			} break;
//		case "보바위":
//			if("보".equals(cheol)) {
//				System.out.println("결과: 영희 승리!");
//			} else {
//				System.out.println("결과: 철수희 승리!");
//			} break;
//		case "가위가위":
//		case "바위바위":
//		case "보보":
//			System.out.println("결과: 무승부");
//		default:
//			System.out.println("가위 바위 보 중에서도 못 고르냐");
//		}
		