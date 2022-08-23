package chapter04.exercise;

public class Exercise_Extra7 {
	public static void main(String[] args) {
		String str = "12345";
		int sum = 0;
		
		for (int i = 0; i < str.length(); i++) {
			sum += str.charAt(i) - '0';
			// char타입에서 '0'은 48, '1'은 49
		}
		System.out.println("sum="+sum);
	}
}