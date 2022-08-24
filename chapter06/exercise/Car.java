package chapter06.exercise;

public class Car {
	private double speed = 0; // 현재 속도
	private String color; // 자동차 색상
	// TODO 뭔가 자동으로 만들 때, 나중에 해야 할 것 windonw-show view-task
	private static double MAX_SPEED = 200; // 차의 엔진이 허용하는 최대 속력(상수)

	Car() {
	}

	Car(String color) {
		this.color = color;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean speedUp(double speed) {
		double newSpeed = this.speed + speed;
		if (newSpeed < 0 || newSpeed > MAX_SPEED) {
			return false;
		}
		this.speed = newSpeed;
		return true;
	}

	public static double getMaxSpeed() {
		return MAX_SPEED;
	}
}
