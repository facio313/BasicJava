package chapter03.exercise;

import java.util.Scanner;

public class Exercise33 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("윤년인지를 확인할 연도를 입력하세요: ");
		int yoon = scanner.nextInt();
		System.out.println(((yoon%4 == 0)&&(yoon%100 != 0)||(yoon%400 == 0)) ? yoon + "년은 윤빗취입니다." : yoon + "년은 윤년이 아닙니다.");
//윤년은 4의 배수이어야 하고, 100의 배수는 아니어야 한다.
//또한 400의 배수는 무조건 윤년이 된다.
//무조건 때문에 or로 보면 된다.
	}
}