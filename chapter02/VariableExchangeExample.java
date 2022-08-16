package chapter02;

public class VariableExchangeExample {
	public static void main(String[] args) {
		int x = 3;//x컵 3은 커피
		int y = 5;//y컵 5는 물
		System.out.println("x:" + x + ",y:" + y);
		//3(커피)이랑 5(물) 맞바꾸기
		int temp = x;//다른 컵(temp) 필요함 ->3(커피)을 다른 컵에 옮김
		x = y;// 3(커피)아 있던 x컵에 5(물)를 넣음
		y = temp;// 5(물)가 있던 y컵에 3(커피)을 넣음
		System.out.println("x:" + x + ",y:" + y);
	}//x컵에 5(물)가 있고 y컵에 3(커피)이 있게 됨

}
