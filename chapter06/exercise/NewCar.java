package chapter06.exercise;

public class NewCar {
	private double speed = 0; // 현재 속도
	private String color; // 자동차 색상
	private static final double MAX_SPEED = kiloToMile(200); // 차의 엔진이 허용하는 최대 속력(상수)

	NewCar() {
	}

	NewCar(String color) {
		this.color = color;
	}

	public double getSpeed() {
		return mileToKilo(speed);
	}

	public void setSpeed(double speed) {
		this.speed = kiloToMile(speed);
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean speedUp(double speed) {
		double newSpeed = this.speed + mileToKilo(speed);
		if (newSpeed < 0 || newSpeed > MAX_SPEED) {
			return false;
		}
		this.speed = newSpeed;
		return true;
	}

	public static double getMaxSpeed() {
		return mileToKilo(MAX_SPEED);
	}

	private static double kiloToMile(double distance) {
		return distance / 1.6;

	}

	private static double mileToKilo(double distance) {
		return distance * 1.6;

	}
}
