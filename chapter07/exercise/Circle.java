package chapter07.exercise;

public class Circle extends Shape {
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		return radius * 2 * Math.PI;
	}

	public double perimeter() {
		return radius * radius * Math.PI;
	}

	public String toString() {
		return "도형의 종류: 원, 둘레:" + area() + "cm, 넓이: " + perimeter() + "cm²";
	}
}
