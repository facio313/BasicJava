package chapter05.exercise;

import java.util.Random;
import java.util.Scanner;

public class test {
	public static void main(String[] args) {
//		 int[] array = {38, 94, 16, 3, 76, 94, 82, 47, 59, 8};
//		 int min = array[0];
//		 int max = array[0];
//		 for(int i = 0; i < array.length; i++) {
//			if(array[i] > max) {
//				max = array[i];
//			}
//		 	if(array[i] < min) {
//				min = array[i];
//			}
//		 }
//		 System.out.println(max + ", " + min);
//	}
//}
		Random random = new Random();
		
		int[] lotto = new int[6];
		int[] balls = new int[45];
		for(int i = 0; i < balls.length; i++) {
			balls[i] = i + 1;
		}
		for(int i = 0; i < balls.length; i++) {
			int ranNum = random.nextInt(45);
			int temp = balls[i];
			balls[i] = balls[ranNum];
			balls[ranNum] = temp;
		}
		for(int i = 0; i<lotto.length; i++) {
			lotto[i] = balls[i];
		}
		
		for (int i = 0; i < lotto.length; i++) {
			System.out.println(lotto[i] + " ");
}
	}
}
