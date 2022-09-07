package chapter13;

import java.util.ArrayList;
import java.util.List;

import chapter11.exercise.Member;

public class GenericExample {
	public static void main(String[] args) {
		//Generic 제네릭
		//클래스를 Object 타입으로 선언하면 값을 자유롭게 넣을 수 있지만 casting을 해야 한다.
		//generic <T>나 <E>를 사용해서 객체의 타입을 선언한다!
		//<T> T는 타입
		List<String> list = new ArrayList<>();
		
//		StringBox stringBox = new StringBox("홍길동");
//		IntegerBox integerBox = new IntegerBox(100);
//		MemberBox memberBox = new MemberBox(new Member("1", "a"));
//		
//		Box box1 = new Box("홍길동");
//		Box box2 = new Box(100);
//		Box box3 = new Box(new Member("1", "a"));
//		if (box1.getValue() instanceof String) {
//			String value1 = (String) box1.getValue(); // 이렇게 casting할 때 타입을 일일이 확인해야 함.. 귀차늠
//		}
//		
//		String value1 = (String) box1.getValue();
//		
//		int value2 = (int) box2.getValue();
//		
//		Member value3 = (Member) box3.getValue();
		
		Box<String> box = new Box<>("홍길동");
		String value = box.getValue();
		
		Box<Member> box2 = new Box<>(new Member("1", "a"));
	}
}