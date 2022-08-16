package chapter05;

public class ArrayCreateByValueListExmpale {
	public static void main(String[] args) {
		int[] scores = {83, 90, 87};
//		int[] scores
//		scores = new int[] {83, 97, 87}; // 그냥 scores = {} 하면 에러남 --> 설명하려면..		
		int sum = 0;
//		for (int i = 0; i < scores.length; i++) {
//			sum += scores[i];
//		}
		for (int score : scores) { //foreach : 향상된 for
			sum += score;
		}
		System.out.println("총합: " + sum);
		
		int sum2 = add(new int[] {83, 90, 87});
		System.out.println("총합: " + sum2);
	}
	
	
	//위 아래 둘 다 같음
	
	
	public static int add(int[] scores) { //add 다 더해주는 메소드
		int sum = 0;
		for(int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		return sum; //sum을 반환시켜줌
	}
}