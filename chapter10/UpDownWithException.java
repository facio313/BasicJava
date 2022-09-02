package chapter10;

import java.util.Random;
import java.util.Scanner;

public class UpDownWithException {
	public static void main(String[] args) {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		boolean run = true;

		int mystery = random.nextInt(100) + 1;
		System.out.println(mystery);

		while (run) {
			try {
				System.out.print("1부터 100 사이의 정수 중 하나를 선택하세요: ");
				int type = scanner.nextInt();
				if (type < mystery) {
					throw new LessNumberException("작은 수를 입력하였습니다.");
				} else if (type > mystery) {
					throw new GreaterNumberException("큰 수를 입력하였습니다.");
				} else {
					System.out.println("정답입니다.");
					System.out.println("게임을 종료합니다.");
					break;
				}
			} catch (LessNumberException | GreaterNumberException e) { //멀티캐치
//				e.printStackTrace();
				System.out.println(e.getMessage());
			}
		}
	}
}
