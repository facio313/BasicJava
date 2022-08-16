package chapter02;

public class LongExample {
	public static void main(String[] args) {
		long var1 = 10;
		long var2 = 20L;
		
		// underscore underbar _는 숫자에 들어가도 아무 의미 없음
		//long var3 = 1000000000000;
		//--> 자바는 4byte 기준으로 해서 에러가 뜸
		//==> 그래서 롱타입의 데이터라고 알려줘야 함(끝에 L 붙이기)
		//*int의 허용 범위 안의 long이라면 l,L 붙여도 되고 안 붙여도 됨
		//헷갈릴 것 같아서 보통 대문자 L을 씀
		long var4 = 1_000_000_000_000L;
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var4);
		
		
	}

}
