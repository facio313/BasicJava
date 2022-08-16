package chapter03.exercise;

import java.util.Scanner;

public class Check3_2_n {
	public static void main(String[] args) {

		//4
//		int pencils = 534;
//		int students = 30;
//		
//		int pencilsPerStudent = (pencils / students);
//		System.out.println(pencilsPerStudent);
//		
//		int pencilsLeft = (pencils%students);
//		System.out.println(pencilsLeft);
		
		//6
//		int value = 356;
//		System.out.println(value/100*100);
		
		//8
//		int lengthTop = 5;
//		int lengthBottom = 10;
//		int height = 7;
//		double area = ((double)(lengthTop+lengthBottom) * height / 2);
//		System.out.println(area);
		
		//9
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("첫 번째 수: ");
//		double first = scanner.nextDouble();
//		System.out.print("두 번째 수: ");
//		double second = scanner.nextDouble();
//		
//		double sum = first / second;
//		System.out.println(!(second == 0 || second == 0.0) ? "결과:" + sum : "결과:무한대");
		//String result = (second == 0 || second == 0.0) ? "무한대" : first / second + "???
		//System.out.println("결과: " + result);
		
		
		
		//10
//		int var1 = 10;
//		int var2 = 3;
//		int var3 = 14;
//		String var5 = var2 + "." + var3;
//		double var4 = var1 * var1 * Double.parseDouble(var5);
//		System.out.println("원의 넓이:" + var4);
		
		//11
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("아이디:");
		String name = scanner.nextLine();
		
		System.out.print("패스워드:");
		String strPassword = scanner.nextLine();
		int password = Integer.parseInt(strPassword);
		/* 곱하기 연산
		 * 3 * 4
		 * 
		 * "3" * "4" 안 됨
		 * "3".multiply("4"); 됨
		 */

		if(name.equals("java")) { 
	//name 데이터가 존재해야 함, 존재하지 않은 값과 비교하려면 에러가 났음
	//방지하기 위해서 "java'.equals(name)으로 썼었음
			if(password == 12345) {
				System.out.println("로그인 성공");
			} else {
				System.out.println("로그인 실패:패스워드가 틀림");
			}
		} else {
			System.out.println("로그인 실패:아이디가 존재하지 않음");
			}
		}
	}
