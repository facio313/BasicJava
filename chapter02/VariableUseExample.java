package chapter02;

public class VariableUseExample {
	public static void main(String[] args) {
		
		int hour = 3;
		int minute = 5;
		
		System.out.println(hour + "시간" + minute + "분");
		System.out.printf("%d시간 %d분", hour, minute);
		
		
		int totalMinute = (hour * 60) + minute;
		System.out.println("총" + totalMinute + "분");
		System.out.printf("총 %d분", totalMinute);
	}

}
