package chapter04.exercise;

import java.util.Scanner;

public class Exercise43 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("점수를 입력하세요.");
		
		System.out.print("프로그래밍 기초: ");
		int pro = scanner.nextInt();
		System.out.print("데이터베이스: ");
		int db = scanner.nextInt();
		System.out.print("화면 구현: ");
		int dis = scanner.nextInt();
		System.out.print("애플리케이션 구현: ");
		int app = scanner.nextInt();
		System.out.print("머신러닝: ");
		int mach = scanner.nextInt();
		
		int total = pro + db + dis + app + mach;
		System.out.println(total);
		
		double average = (double) total / 5;//5.0으로 치면 (double) 안 써도 됨 
		System.out.printf("%.2f\n", average);
		
		if(average >= 90 ) {
			System.out.println("학점: A");
		} else if(average >= 80) {
			System.out.println("학점: B");
		} else if(average >= 70) {
			System.out.println("학점: C");
		} else if(average >= 60) {
			System.out.println("학점: D");
		} else {
			System.out.println("학점: F");
		}
//		String grade;
//		if(average >= 90 ) {
//			grade = "A";
//		} else if(average >= 80) {
//			grade = "B";
//		} else if(average >= 70) {
//			grade = "C";
//		} else if(average >= 60) {
//			grade = "D";
//		} else {
//			grade = "F";
//		}
//		System.out.println("학점: " + grade);
	}
}