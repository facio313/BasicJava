package chapter11.exercise;

import java.util.HashMap;

public class StudentExample {
	public static void main(String[] args) {
		// Student 키로 총점을 저장하는 HashMap 객체 생성
		HashMap<Student, String> map = new HashMap<Student, String>();
		//		  key값, value값
		
		// new Student("1")의 점수 95를 저장
		map.put(new Student("1"), "95"); // 0x1234
		
		// new Student("1")의 점수를 읽어옴
		String score = map.get(new Student("1")); // 0x1235
		System.out.println("1번 학생의 총점: " + score);
	}
}
