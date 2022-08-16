package chapter02.exercise;

import java.util.Scanner;

public class Exercise21 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//컴퓨터 : 데이터 입력 -> 처리 -> 출력
		//입력
		System.out.print("가로의 길이는?(단위는: m): ");//콘솔로 나올 때 치고 라인이 바뀌지 않나? print를 쓰는데..?println이 아니라
		double width = scanner.nextDouble();
		System.out.print("세로의 길이는?(단위는: m): ");
		double height = scanner.nextDouble();
		//처리
		double area = width*height;
		double perimeter = (width+height) * 2;
		//출력
		System.out.println("직사각형의 넓이: " + area);
		System.out.println("직사각형의 둘레: " + perimeter);
	}
}