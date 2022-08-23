package chapter06.extra;

public class Car {
	//필드
	int gas;
	
	//생성자
	
	//메소드
	void setGas(int gas) { //리턴 값이 없어서 처음에도 에러 없음
		this.gas = gas;
	}
	
	boolean isLeftGas() { //리턴 값이 있댔는데 틀 잡을 땐 없어서 에러
		//return false; 에러 없애기 위해 먼저 초기값(기본 초기값)을 설정해줌
		if(gas == 0) {
			System.out.println("gas가 없습니다.");
			return false; //false를 리턴
		} //return이 없는 경우 밑에 거 실행 안 됨
		//return이 있으면 else if 꼭 안 써도 됨
		//return이 true면 값을 반환해서 메소드가 끝나게 되니까!(?)
		System.out.println("gas가 있습니다.");
		return true; //true를 리턴
	}
	
	void run() {
		while(true) {//while(true) -> 무한반복
			if(this.gas > 0) {
				System.out.println("달립니다.(gas잔량: " + this.gas + ")");
				this.gas--;
			} else {
				System.out.println("멈춥니다.(gas잔량: " + this.gas + ")");
				return; // void에서 메소드 실행 종료에 사용 / break써도 됨. 여기서는 똑같은 효과
			}
		}
		
	}
}