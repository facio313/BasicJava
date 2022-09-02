package chapter08.exercise2;

public class Rectangle extends Shape {
	private double width;
	private double height;

	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	public double area() {
		return (width + height) * 2;
	}

	public double perimeter() {
		return width * height;
	}

	public String toString() {
		return "도형의 종류: 사각형, 둘레:" + area() + "cm, 넓이: " + perimeter() + "cm²";
		//String.format("도형: 사각형, 둘레: %.2fc,,넓이: %2fc", area, perimeter);
	}
}