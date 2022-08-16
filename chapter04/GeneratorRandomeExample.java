package chapter04;

import java.util.Random;

public class GeneratorRandomeExample {
	public static void main(String[] args) {
		/*
		 * 랜덤(Random) => 난수
		 * 컴퓨터 랜덤 : 가짜 랜덤(pseudo random)
		 * 난수표는 요즘 사용 잘 안 함
		 * Math.random(); => 0.0부터 1.0 미만의 double 타입의 실수를 반환
		 * Random 클래스(객체)를 사용
		 */
		//공식 (int)(Math.random() * 9) + 0;
		Random random = new Random(10);
		int num1 = random.nextInt(6);
		int num2 = random.nextInt(6);
		int num3 = random.nextInt(6);
		int num4 = random.nextInt(6);
		int num5 = random.nextInt(6);
		int num6 = random.nextInt(6);
		int num7 = random.nextInt(6);
		int num8 = random.nextInt(6);
		// 위 Random은 시간에 따라 변하는 것임
		// 즉 시간만 알면 해킹이 가능함
		// 보안 강화 랜덤 SecureRandom
		// 랜덤을 암호화 시켜서 해킹이 불가능하게끔 만듬
		
		System.out.printf("%d %d %d %d %d %d %d %d", num1, num2, num3, num4, num5, num6, num7, num8);
		//randome(seed) -> 시드 값 같을 시, 같은 랜덤 값 출력
		
		
	}
}