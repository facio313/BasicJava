package chapter06.extra;

public class CarExample {
	public static void main(String[] args) {
		Car car = new Car(); // 자동차 만들기
		car.setGas(5); // 가스 주입하기
		// 운행 가능
		boolean gasState = car.isLeftGas();
		if (gasState) {
			System.out.println("출발합니다.");
			car.run();
		}
		
		if (car.isLeftGas()) {
			System.out.println("gas를 주입할 필요가 없습니다.");
		} else {
			System.out.println("gas를 주입하세요.");
		}
	}
}