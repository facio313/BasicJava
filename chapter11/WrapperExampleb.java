package chapter11;

public class WrapperExampleb {
	public static void main(String[] args) {
		int a = 10;
		Integer b = 100; //기본 타입의 값을 참조 타입에 넣는 것은 원래 안 됨
		Integer c = new Integer(100); // 원래는 이게 맞음
		String d = new String("홍길동"); // 원래는 이게 맞음
		String e = "홍길동"; // but Byte, Integer, String 등은 Wrapper 클래스의 auto-boxing으로 인해 리터럴을 넣을 수 있음!
		
		int f = b; // 기본형에 참조 타입을 넣는 건 원래 안 되지만 auto-unboxing으로 인해 넣을 수 있게 됨! promotion이랄까? 자바가 알아서 함
		
		// 1부터 100까지의 합을 구하는 프로그램
		long startTime = System.nanoTime();
		Integer sum = 0;
//		int sum = 0;
		for (int i = 0; i <= 100; i++) { // Integer 시 unboxing -> boxing -> unboxing -> boxing의 반복!
			sum = sum + i;
		}
		System.out.println("합계: " + sum);
		long endTime = System.nanoTime();
		System.out.println("걸린 시간: " + (endTime - startTime));
	}// Integer와 int의 차이는? 속도 차이가 많이 남  - 1)'unboxing -> boxing'을 계속함. 2)Integer는 주소를 참조하는 것이고 int는 바로 변수에 저장돼서 갖고 오는 것!
}