package chapter02.exercise;

import java.util.Scanner;

public class Exercise24 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("원기둥 밑변의 반지름을 입력하시오.(단위: cm): ");
		double underHalf = scanner.nextDouble();//radius
		System.out.print("원기둥의 높이를 입력하시오.(단위: cm): ");
		double height = scanner.nextDouble();
		double pi = Math.PI;//그냥 Math.PI를 바로 써도 됨 ⬇⬇⬇
		
		double underArea = (double)(pi*underHalf*underHalf);
		System.out.print("원기둥 밑변의 넓이는 " + underArea + "cm²이고, ");
		double volume = underArea*height;
		System.out.println("원기둥의 부피는 "+ volume + "cm³이다.");
	}
}