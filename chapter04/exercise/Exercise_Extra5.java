package chapter04.exercise;

public class Exercise_Extra5 {
	public static void main(String[] args) {
		int i = 0;
		while(i<=10) {
			int j = 0;
			while(j<=i) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
	
	}
}
		
//		int i = 1;
//		while(i<=10) {
//			switch(i) {
//			case 1:
//				System.out.println("*");
//			case 2:
//				System.out.println("**");
//			case 3:
//				System.out.println("***");
//			case 4:
//				System.out.println("****");
//			case 5:
//				System.out.println("*****");
//			case 6:
//				System.out.println("******");
//			case 7:
//				System.out.println("*******");
//			case 8:
//				System.out.println("********");
//			case 9:
//				System.out.println("*********");
//			case 10:
//				System.out.println("**********");
//			case 11:
//				System.out.println("***********");
//			} break;
//		}

//		for(int i = 0; i <= 10; i++) {
//			for(int j = 0; j <= i; j++)
//				System.out.print("*"); //여기서 왜 바로 밑으로 안 내려가고 다시 위로 가는가?
//			System.out.println(); //괄호가 없는데?
//		}
//	}
//}

//위 공식에 따르면(j<=i인 것을 잘 봐봐!)
//i(0부터 시작)가 0이면 j도 0이라 1번만 수행
//i가 1이면 j는 "0(1번째) -> 1(2번째)"로  2번 수행
//i가 2이면 j는 "0(1번째) -> 1(2번째) -> 2(3번째)"로 3번 수행
//그냥 print니까 줄 안 바뀌고 *가 3개 찍히는 것임!!!!!그러고 줄 바꾸기를 위한 println