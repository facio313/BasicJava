package chapter05.exercise;

import java.util.Random;
import java.util.Scanner;

public class Exercise53 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		System.out.print("가위 바위 보를 입력하세요: ");
		String man = scanner.nextLine();
		System.out.println("게이머: " + man);
		
		String[] ai = {"가위", "바위", "보"};
		int index = random.nextInt(3);
		System.out.println("인공지능 컴퓨터: " + ai[index]);
		
		
		String result = "";
		if(man.equals(ai[index])) {
			result = "사귄다";
		} else if(man.equals("가위") && ai[index].equals("바위")
				|| man.equals("바위") && ai[index].equals("보")
				|| man.equals("보") && ai[index].equals("가위")) {
			result = "넌 시리에게 졌어";
		} else {
			result = "게이머 승리!";
		} System.out.println("결과: " + result);
	}
}
