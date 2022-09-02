package chapter08;

public interface RemoteControl {
	public int MAX_VOLUME = 10; // 인터페이스는 상수만 선언 가능!
	public int MIN_VOLUME = 0; // 필드는 안 됨!
	//굳이 상수라고 표현 안 해도 됨. 어차피 상수만 오니까
	// 안 쓰면 public static final이라 

	public void turnOn(); // 추상메소드만 선언 가능!
	public void turnOff(); // 메소드는 선언만.
	public void setVolume(int volume);
}
