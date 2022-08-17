package chapter05.exercise;

public class Exercise51 {

	public static void main(String[] args) {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int[] array = {38, 94, 16, 3, 76, 94, 82, 47, 59, 8};
		
		
		for(int i : array) {
			if(i > max) {
				max = i;
			}
			if(i < min) {
				min = i;
			}
		}
		System.out.println("최대값: " + max);
		System.out.println("최소값: " + min);
	}
}