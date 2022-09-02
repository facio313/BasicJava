package chapter08;

public class RemoteControlExample {
	public static void main(String[] args) {
//		new RemoteControl() // 추상 메소드들은 생성이 안 됨
		RemoteControl control = new Television();
		control.turnOn();
		control.setVolume(5);
		
		control = new Audio();
		control.turnOn();
		control.setVolume(5); // 다형성!
		//RemoteControl이란 걸 많이 만들어낸 것!
		
//		Searchable tv = new Television();
		Television tv = new Television();
		RemoteControl control2 = tv;
		Searchable searchable = tv; // 이게 모야 갑자기 ㅜㅜ????
		control2.turnOn();
		control2.setVolume(7);
		tv.search("홍길동");
	}
}