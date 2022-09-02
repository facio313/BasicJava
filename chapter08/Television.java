package chapter08;

public class Television implements RemoteControl, Searchable {
	//필드
	private int volume;
	
	//turnOn() 추상 메소드의 실체 메소드
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}
	
	//turnOff() 추상 메소드의 실체 메소드
	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}
	//setVolume() 추상 메소드의 실체 메소드
	@Override
	public void setVolume(int volume) {
//		if(volume > RemoteControl.MAX_VOLUME);{ 
		if(volume > MAX_VOLUME) { // 외부에서 쓸 때는 생략 안 됨. 여기는 가
			this.volume = MAX_VOLUME;
		} else if(volume < MIN_VOLUME) {
			this.volume = MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨: " + this.volume);		
	}

	@Override
	public void search(String word) {
		System.out.println(word + "을(를) 검색한 결과입니다.");
	}
} 