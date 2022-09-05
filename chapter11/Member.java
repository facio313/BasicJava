package chapter11;

import java.util.Objects;

// VO(Value Object) : 데이터를을 저장하는 객체
// DTO(Date Transfer Object) : 데이터를 전달하는 객체
// Bean => 자바 커피 원두(bean) => 데이터를 저장하는 객체를 표현
// Item(항목), Model(데이터) 등과 같은 접미사를 붙이기도 함
// Lombok을 굉장히 많이 씀
// @Data 이거 쓰면 필드 관련 나머지 다 만들어줌
// @Constructor
// @Getter
// @Setter
// @ToString
// Kotlin 언어 : jetBrain IDE 개발 회사(intellij를 만든 회사)
public class Member {
	@Override
	public String toString() {
		// apache 재단 => 라이브러리 commons 접두어가 붙은 라이브러리
//		return "Member [id=" + id + ", name=" + name + "]";
		return String.format("Member [id=%d, name=%s]", id, name);
	}
	private int id;
	private String name;
	
	// Source - Generate hashcode() and equals()  ==> 아래 체크박스 세 개 체크!
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}
	public Member(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) { // 주소값 비교
			return true;
		}
		if (!(obj instanceof Member)) { // 강제변환 되느냐?! 안 되면 false
			return false;
		}
		Member other = (Member) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
	
	
}
