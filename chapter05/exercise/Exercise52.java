package chapter05.exercise;

import java.util.Arrays;
import java.util.Random;

public class Exercise52 {

	public static void main(String[] args) {
		Random random = new Random();
		int[] array = new int[6];
		
		for(int i = 0;i < array.length; i++ ){
			array[i] = random.nextInt(45) + 1;
			for(int j = 0; j < i; j++) {
				if(array[i]==array[j]) {
					i--;
				}
			}
		}
		Arrays.sort(array);
		System.out.print("let me first then I'll give you my love : ");
		for(int i=0; i < 6;i++ ) {
			System.out.print(array[i] + " ");
		}
	}
}

// 선생님 방법
//int[] lotto = new int[6];
//Random random = new Random();
//입력 :  첫 번째 방법
//for(int i = 0; i < lotto.length; i++) {
//	lotto[i] = random.nextInt(45) + 1;
//	for(int j = 0; j < i; j++) {
//		if(lotto[0] == lotto[i]) {
//		i--;
//	}
//}
//입력 : 두 번째 방법
//int[balls] = new int[45];
//	for(int i = 0; i < balls.length; i++) {
//		balls[i] = i + 1;
//	}
//for(int i = 0; i < balls.length, i++) {
//	balls[i];
//	balls[random.nexInt(45)];
//	int temp;
//	}
//섞인 공에서 앞의 6개 잘라서 lotto에 넣기
//for(int i = 0; i<lotto.length; i++) {
//	lotto[i] + balls[i];
// 출력
//for (int i = 0; i < lotto.length; i++) {
//	System.out.println(lotto[i] + " ");
//}
