package chapter06;

public class Member {
	
	//필드
	String name;
	String id;
	String password;
	int age;
	
	//생성자 --> 원래 하나만 있어야 구분 가능한데, 여러 개 만들 수 있도록 만든 것(()안을 구분) ==> 오버로딩
 	Member() {
 		this(null, null); // heap 영역에 Member라는 클래스를 생성하고 그 주소값을 반환
 		//생성자 호출하는 것이 먼저 와야 그 다음에 필드를 넣을 수 있음
	}
	Member(String name) { //이러면 n이 뭔지 모름 --> 그래서 위에 거랑 똑같에 해줌
		this(name, null); //p.241
		
		//		this.name = name; // 필드 = 외부데이터
			// this.필드 --> this는 객체 자신을 참조, 가리키는 거
			// this가 없으면 생략돼있는 것으로 취급
			// 실행 시 중복되면 컴퓨터가 뭐가 뭐의 name인지 모름
			// 그때 우선순위가 지역변수에 있음
			// 헷갈리니까 this를 써줌
	}
	Member(String n, String i) {
		this.name = name; // p.237
		this.id = id;
	}
}