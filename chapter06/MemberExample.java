package chapter06;

public class MemberExample {
	public static void main(String[] args) {
		Member member = new Member();
		member.name = "최하얀";
		member.age = 23;
		System.out.println(member.name);
		System.out.println(member.age);
		
		System.out.println();
		
		Member member2 = new Member();
		member2.name = "홍길동";
		member2.age = 76;
		System.out.println(member2.name);
		System.out.println(member2.age);
		
		System.out.println();
		
		Member member3 = new Member("이순신");
		System.out.println(member3.name);
		
		System.out.println();
		
		Member member4 = new Member("류관순", "Ryu");
		System.out.println(member4.name);
		System.out.println(member4.id);
	}
}