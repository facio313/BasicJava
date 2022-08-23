package chapter06;

public class Calculator {

	static double pi = 3.14159; // static을 붙이는 순간 메모리에 만들어짐! 굳이 생성할 필요가 없어짐 --> CalculatorExample 참고
	int result = 0;
	
	static int plus(int x, int y) {
//		result = 20; // 에러가 뜸!!! --> static이 붙어 있으면 각각의 개인이 갖는 멤버에 접근이 불가능함
//		this.result = 20; // 정적 메소드 안에 this, 인스턴스 필드 사용 불가 /  static에서는 static이 안 붙어있는 것을 쓸 수가 없음
//		여기서 result를 쓰려면 새로 만들어야 함!!
//		Calculator calculator = new Calculator();
//		calculator.result();
//		이 방법을 안 쓰려면 위의 "int result = 0"에 static을 붙여줘야 함..
//		근데 이건 좀 위험함 => 왜? : 개인의 영역에 누구나 접근이 가능해짐
//		ex) 나의 통장에 접근하기 힘들다고 비밀번호를 없애버려서 공용의 용도로 만들게 함.
//		프라이버시 침범 문제;;
//		즉! 필드(통장 계좌번호, 비밀번호)에다가 static을 붙이는 것이 매우 위험함
//		공용으로 쓰이는 필드 말고는 아예 그냥 static을 안 붙이는 것이 좋다.
//		대신에 메소드에 static을 붙이는 것은 매우 좋음!!
//		매번 Calculator 동작을 사용 는 상황일 때, 계속 new를 한다는 것 = 의미 없는 객체를 만드는 것과 똑같음 != 필드
//		하나만 객체가 만들어지기 때문에 효율적이게 됨!
//		너무 중구난방식으로 만드는 것은 안 좋지만 필요하면 메소드에 static을 붙이는 것을 오히려 권장함!
		
		return x + y;
	}
	
	static int minus(int x, int y) { // static을 공공영역이라고 생각하면 됨, 공공영역에서는 개인영역(개인메모리에 new해서 heap에 만든느 것)
		return x - y;				//을 침범할 수 없음
	}
	
	int multiply(int x, int y) {
//		result = 100; // plus 메소드에 비교하면 애는 됨! 왜냐하면 정적 멤버가 아니기 때문에!
		double r = 2 *10 * pi;
		return x * y;
	}
	
//	//메소드
//	void powerOn() {
//		System.out.println("전원을 켭니다.");
//	}
//	
//	int plus(int x, int y) {
//		int result = x + y;
//		return result;
//	}
//	
//	double divide(int x, int y) {
//		double result = (double)x / (double)y;
//		return result;
//	}
//	
//	void powerOff() {
//		System.out.println("전원을 끕니다.");
//	}
}
