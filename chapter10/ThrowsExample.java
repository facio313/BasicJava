package chapter10;

public class ThrowsExample {
	public static void main(String[] args) { //throws ClassNotFoundException { : 메소드를 호출한 놈한테 예외를 던지겠다 --여기선 JVM
//		Class.forName("java.lang.String"); // 에러가 찍히면 제일 마지막에 써져잇는 거 타고타고~
		try {
			method1();
		} catch (Exception e) {
			e.printStackTrace();
		}
	} //try catch문
	
	public static void method1() throws Exception {
		Class.forName("java.lang.String");
	}
} // try catch문이랑 throws 다 장단점 있음!