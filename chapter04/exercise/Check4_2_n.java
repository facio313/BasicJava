package chapter04.exercise;
import java.util.Random;
import java.util.Scanner;

public class Check4_2_n {
	public static void main(String[] args) {
		// 2		
//		int sum = 0;
//		
//		int i = 0;
//		for (i = 1; i <= 100; i++) {
//			if(i%3 != 0) {				
//				sum += i;
//			}
//		}
//		System.out.println("3의 배수의 총합(1~100) : " + sum);
//	  }
//  } =>3367
	
		// 3
//		Random random = new Random();
//		while(true) {
//			int noon1 = random.nextInt(6) + 1;
//			int noon2 = random.nextInt(6) + 1;
//			System.out.println("(" + noon1 + ", " + noon2 + ")");
//			int sum = noon1 + noon2;
//			if(sum == 5) {
//				break;
//			}
//		}
//	}
//}
		
		// 4
//		for (int x = 1; x<=10; x++) {
//			for (int y = 1; y<=10; y++) {
//				int sum = (4*x) + (5*y);
//				if(sum==60) {
//					System.out.println("(" + x + ", " + y + ")");
//				}		
//			}
//		}		
//	}
//}

		// 5
//		for (int i = 0; i < 4; i++) {
//			if(i == 0) {
//				System.out.println("*");
//			} else if(i == 1) {
//				System.out.println("**");
//			} else if(i == 2) {
//				System.out.println("***");
//			} else if(i == 3) {
//				System.out.println("****");
//			}
//		}
//	}
//}

		// 6
//		for (int i = 0; i < 4; i++) {
//			if(i == 0) {
//				System.out.println("   *");
//			} else if(i == 1) {
//				System.out.println("  **");
//			} else if(i == 2) {
//				System.out.println(" ***");
//			} else if(i == 3) {
//				System.out.println("****");
//			}
//		}
//	}
//}

		// 7
//		boolean run = true; // 반복문 여부
//		int balance = 0; // 잔액
//		Scanner scanner = new Scanner(System.in);
//		
//		while(run) {
//			System.out.println("--------------------------");
//			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
//			System.out.println("-------------------------");
//			System.out.print("선택> ");
//			int choice = scanner.nextInt();
//			
//			if(choice == 1) {
//				System.out.println("예금액>10000"); // 잔액 + 예금
//				continue;
//			} else if(choice == 2) {
//				System.out.println("출금액>2000");
//				continue;
//			} else if(choice == 3) {
//				System.out.println("잔고>8000");
//				continue;
//			} else if(choice == 4) {
//				break;
//			}
//		}
//		System.out.println("프로그램 종료");
//	}
//}
		// 선생님  7
		boolean run = true; // 반복문 여부
		int balance = 0; // 잔액
		Scanner scanner = new Scanner(System.in);

		while(run) {
			System.out.println("--------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-------------------------");
			System.out.print("선택> ");
			int choice = Integer.parseInt(scanner.nextLine()); // 스캐너 버그 있음(숫자<->문자)
			// if, switch문 중에서 선택
			switch (choice) {
			case 1:
				System.out.print("예금액>");
				balance += Integer.parseInt(scanner.nextLine());;
				break;
			case 2:
				System.out.print("출금액>");
				balance -= Integer.parseInt(scanner.nextLine());
				break;
			case 3:
				System.out.println("잔고>" + balance);
				break;
			case 4:
				run = false;
				break;

			default:
				System.out.println("잘못 선택하셨습니다, 고갱님. 잘 좀 선택좀");			
				break;
			}
		}
	}
}