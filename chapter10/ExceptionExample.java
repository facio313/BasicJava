package chapter10;

import chapter08.Student;

public class ExceptionExample {
	public static void main(String[] args) {
		//일반예외
		try {
			Class.forName("java.Iang.String"); 
		
		} catch () {
			System.out.println("입력하신 클래스가 존재하지 않습니다.");
		}
		
		//실행예외 
		try{
			Student student = new Student("홍길동", 10);
			student.compareTo(new Student("홍길동", 10));
			int[] numbers = {1,2,3};
			System.out.println(numbers[5]);
		} catch(NullPointerException e) {
			System.out.println("Null 참조 에러 발생");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스 에러");
		} catch (Exception e) {
			e.printStackTrace();
//		System.out.println("알 수 없는 예외가 발생했습니다.");	
		} finally {
		}
	}
}