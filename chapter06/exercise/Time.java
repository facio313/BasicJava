package chapter06.exercise;

public class Time {
	private int hour;
	private int minute;
	private int second;

	public Time() {
//		this.hour = 0;
//		this.minute = 0;
//		this.second = 0; //안 써도 됨!
	}

	public Time(int hour, int minute, int second) {
		if (hour < 0 || hour > 23) {
			hour = 0;
		}
		if (minute < 0 || minute > 59) {
			minute = 0;
		}
		if (second < 0 || second > 59) {
			second = 0;
		}
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public String toString() { // 공통으로 사용하는 메소드! 모든 클래스가 다 갖고 있음
		return String.format("%02d:%02d:%02d", hour, minute, second);
	}
}