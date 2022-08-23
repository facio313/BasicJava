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
// 선생님꺼 
// 최대값은 최소값으로 시작(0같은)==>Integer.MIN_VALUE;
// 최소값은 최대값으로 시작(1001010101010정도)==>Integer.MAX_VALUE;
// int[] array = {38, 94, 16, 3, 76, 94, 82, 47, 59, 8};
// int max = array[0]; => 내부값끼리 비교 가능
// int min = array[0];
// 최대값
// for(int i = 0; i < array.length; i++) {
//	if(array[i] > max) {
//		max = array[i];
//		}
// 최소값
// 	if(array[i] < min) {
//		min = array[i];
//		}