package chapter06;

public class CalculatorExample {
	public static void main(String[] args) { // 여기서 static을 빼도 되지만 그러면 메인 메소드가 아니게 됨!
		// 원의 넓이 구하기
		// 반지름 10										밑에 내용 매우 중요, 제대로 이해하기 "정적 멤버(필드, 메소드) 사용하기"
		double result1 = 10 * 10 * Calculator.pi; // Calculator 클래스에서 static을 붙여서 메모리에 이미 만들어져 있는데 객체를
		int result2 = Calculator.plus(10,5); //  생성해서 인스턴스를 만드는 것이 잘못된 것은 아님. 실패한 것은 아니지만 메모리 낭비임
		int result3 = Calculator.minus(10,5);// new Calculator 생성자를 없애고, c를 대문자로 바꿔주면 static 멤버를 사용하게 됨
		Calculator calculator = new Calculator();
		int result4 = calculator.multiply(10, 5); // Calculator 클래스의 multiply에 static이 안 붙어 있기 때문에 정적 멤버X
												//그렇기 때문에 새로 인스턴스(객체라고 해야 하나?)를 생성해내서 사용해야 함
		
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		
//		Calculator myCalc = new Calculator();
//		myCalc.powerOn();
//			
//			int result1 = myCalc.plus(5,  6);
//			System.out.println("result1: " + result1);
//			
//			byte x = 10;
//			byte y = 4;
//			double result2 = myCalc.divide(x, y);
//			System.out.println("result2: " + result2);
//			
//			myCalc.powerOff();
	}
}