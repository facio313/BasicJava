package chapter07;

public class Computer extends Calculator {
	@Override
	public double areaCircle(double radius) {
//		System.out.println(super.name);
//		super.areaCircle(radius);
		System.out.println("Computer 객체의 areaCirlce() 실행");
		return Math.PI * radius * radius;
	}

}
