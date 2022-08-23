package chapter03;

public class LogicalOperatorExample {
	public static void main(String[] args) {
		int charCode = 'A';
		
		if( (charCode>=65) & (charCode<=90) ) {
			System.out.println("대문자군요");
		}
		
		if( (charCode>=97) && (charCode<=122) ) {
			System.out.println("소문자군요");
		}
		
		if( !(charCode<48) && !(charCode>57) ) {
			System.out.println("0~9 숫자군요");
		}
		
		int value = 6;
		
		if( (value%2==0) | (value%3==0) ) {
			System.out.println("2 또는 3의 배수군요");
		}
		
		if( (value%2==0) || (value%3==0) ) {
			System.out.println("2 또는 3의 배수군요");
		}
		
		char a = '홍';
		char b = '김';
		if ( a < b ) {
			System.out.println("홍이 김보다 작음");
		} else {
			System.out.println("김이 홍보다 작음");			
		}
	}
}