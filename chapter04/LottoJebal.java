package chapter04;

import java.util.Random;

public class LottoJebal {
	public static void main(String[] args) {
		Random random = new Random();
		
		int num1 = random.nextInt(45) + 1;
		int num2 = random.nextInt(45) + 1;
		int num3 = random.nextInt(45) + 1;
		int num4 = random.nextInt(45) + 1;
		int num5 = random.nextInt(45) + 1;
		int num6 = random.nextInt(45) + 1;
		
		int a[] = {num1, num2, num3, num4, num5, num6};
		
		for(int i =0;i <6; i++ ){ // i = 0~5
			for(int j = i+1; j<6; j++ ) { // j = 1~5
				if(a[j] < a[i]) { // a가 모야?
					int temp = a[i]; // 잠시 담아놓을 곳
					a[i] = a[j]; // 변수값 교환
					a[j] = temp;
				}
			}
		}
		
		for(int i=0; i < 6;i++ ) {
			System.out.print(a[i] + ".");
		}
//		System.out.printf("%d %d %d %d %d %d %d %d", num1, num2, num3, num4, num5, num6);
//		int num = (int) (Math.random() * 45) + 1;
//		System.out.println(num);
//		System.out.println(num);
//		System.out.println(num);
	}
}