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
			System.out.print(array[i] + ".");
		}
	}
}