package chapter04.exercise;

//import java.util.Random;

public class Exercise_Extra6 {
	public static void main(String[] args) {
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <=6; j++) {
				if(i + j == 6) {
					System.out.print(i + "+" + j + "=6" + " ");
				}
			}
		}
	}
}
//	Random random = new Random();
//		
//		for	(int i = 0; ; i++) {
//			int first = random.nextInt(6) + 1;
//			int second = random.nextInt(6) + 1;
//			int sum = first + second;
//			if (sum == 6) {
//				String sumStr = first + "+" + second + "=" + 6;
//				System.out.print(sumStr + ",");						
//			}
//		}
//	}
//}