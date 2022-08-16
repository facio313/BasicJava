package chapter05.exercise;

public class Check05_2_4 {
	public static void main(String[] args) {
		int max = -2147483648; // = Integer.MIN_VALUE; //초기값이 가장 작은 값
		int min = 2147483647; // = Integer.MAX_VALUE; // 초기값이 가장 큰 수
		int[] array = {1, 5, 3, 8, 2};
		
		for(int i : array) {
			if(i > max) {
				max = i;
				
//		for(int i = 0; i < array.length; i++) {
//				if(array[i] > max) {
//					max = array[i];
//				}			
				
			}
			if(i < min) {
				min = i;
			}
		}
		System.out.println("max: " + max);
		System.out.println("min: " + min);
	}
}
//max값과 비교해서 i값이 max값보다 크면 max를 i값으로 바꿔줌, 작으면 안 바꿈.
//그러다 나중에는 최대값이 나옴
//최대값을 구할 때 max 값을 제일 작게 해서 넣는 게 중요함
//최소값을 구할 때 min 값을 아예 크게 해서 넣는 게 중요함
//*min을 0으로 초기값을 놔두면 안 됨*
//최소값도 구해봐!