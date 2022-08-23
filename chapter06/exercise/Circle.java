package chapter06.exercise;

public class Circle {
	private double radius;
	private double x;
	private double y;

	public double getArea() {
		double getArea = Math.PI * (radius * radius);
		return getArea;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		if (radius > 0) {
			this.radius = radius;
		} else {
			radius = 0;
		}
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
}