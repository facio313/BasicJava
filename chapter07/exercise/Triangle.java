package chapter07.exercise;

public class Triangle extends Shape {
	private double side;

	public Triangle(double side) {
		this.side = side;
	}

	@Override
	public double area() {
		return side * 3;
	}

	public double perimeter() {
		return Math.sqrt(3) / 4 * side * side;
	}

	public String toString() {
		return "도형의 종류: 삼각형, 둘레:" + area() + "cm, 넓이: " + perimeter() + "cm²";
	}
}