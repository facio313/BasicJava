package chapter05.exercise;

import java.util.Random;

public class Exercise54 {
	public static void main(String[] args) {
		Random random = new Random();
		int[] sumArray = new int[6];
		
		for(int i = 0; i < 10000; i++) { // i 꼭 안 써도 됨
			int dice = random.nextInt(6) + 1;
			switch(dice) {
			case 1:
				sumArray[0]++;
				break;
			case 2:
				sumArray[1]++;
				break;
			case 3:
				sumArray[2]++;
				break;
			case 4:
				sumArray[3]++;
				break;
			case 5:
				sumArray[4]++;
				break;
			case 6:
				sumArray[5]++;
				break;
			}
		}
			
//			if(dice == 1) {
//				sumArray[0]++;
//			} else if(dice == 2) {
//				sumArray[1]++;
//			} else if(dice == 3) {
//				sumArray[2]++;
//			} else if(dice == 4) {
//				sumArray[3]++;
//			} else if(dice == 5) {
//				sumArray[4]++;
//			} else if(dice == 6) {
//				sumArray[5]++;
//			}
//		}
			System.out.println("-------------");
			System.out.println("면\t빈도");
			System.out.println("-------------");
			System.out.println("1\t" + sumArray[0]);
			System.out.println("2\t" + sumArray[1]);
			System.out.println("3\t" + sumArray[2]);
			System.out.println("4\t" + sumArray[3]);
			System.out.println("5\t" + sumArray[4]);
			System.out.println("6\t" + sumArray[5]);
	}
}