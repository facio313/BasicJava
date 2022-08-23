package chapter06;

public class Singleton {
	
	private static Singleton instance = new Singleton(); // 하나만 저장하기 위해 static을 붙임
	// 외부에서 접근하지 못하지만 외부에서 접근할 수 있는 메소드는 사용 가능
	private Singleton() { //SingletonExample에서 new 여러 번 못 쓰게 하려고 / 내부에서는 한 번 만들 수 있음
	}

	//타입1
//	public static Singleton getInstance() {
//		if (instance == null) {
//			instance 
//	}
//} 
	//타입2
	
	public static Singleton getInstance() {
		return instance; //이 메소드를 호출하려면 객체를 생성해야 함. 근데 private라 외부에서 객체를 생성할 수 없음
		// static을 붙여주면 메모리에 저장돼서 외부에서 호출할 수 있음 
	}
}	//이게 더 나음