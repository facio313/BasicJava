package chapter06;

public class CarExample_org {
	public static void main(String[] args) {
		Carr car1 = new Carr();
		System.out.println(car1.company);
		System.out.println(car1.model);
		System.out.println(car1.color);
		System.out.println(car1.maxSpeed);
		car1.speed = 90;
		System.out.println(car1.speed);
// Car.java에서 speed는 초기화가 안 되어 있음.
// 원래는 못 쓰는데 쓸 수 있는 이유 : 자바에서는 객체 생성 시 자동으로 default 초기값을 세팅을 해놓음.
// int는 0 String은 null
		
		
		System.out.println();
	// car1과 car2는 완전히 다른 자동차!
		
		
		Carr car2 = new Carr();
		System.out.println(car2.company);
		System.out.println(car2.model);
		car2.color = "파랑";
		System.out.println(car2.color);
		System.out.println(car2.maxSpeed);
		System.out.println(car2.speed);
	}
}

// 객체마다 필드를 지정할 수 있음!!