package chapter04.exercise;

public class Exercise_Extra10 {
	public static void main(String[] args) {
		int number = 12321;
		int tmp = number;
		
		int result = 0; // 변수 number를 거꾸로 변환해서 담을 변수
		
		
		while(tmp != 0) {
			result = result*10 + tmp%10;
			tmp /= 10;		
			
		}
		if(number == result) {
			System.out.println(number + "는 회문수입니다.");
		} else {
			System.out.println(number + "는 회문수가 아닙니다.");
		}
		
	}
}

//		int result1 = tmp%10/1; // 1
//		int result2 = (tmp%100)/10; // 2
//		int result3 = (tmp%1000)/100; // 3
//		int result4 = (tmp%10000)/1000; // 2
//		int result5 = (tmp%100000)/10000; // 1

//		int number = 12321;
//		String ch = Integer.toString(number);
//		
//			if (ch.charAt(0) == ch.charAt(4)) {
//				if (ch.charAt(1) == ch.charAt(3)) {
//					System.out.println( number + "는 회문수 입니다.");			
//				}			
//			} else {
//					System.out.println( number + "는 회문수가 아닙니다.");			
//			}
//	} // main
//}