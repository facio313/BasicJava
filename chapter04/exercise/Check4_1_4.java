package chapter04.exercise;

public class Check4_1_4 {
	public static void main(String[] args) {
		System.out.println("어떤 혜택을 원하세요?");
		char grade = 'C';
		switch(grade) {
		case 'A' : System.out.println("VVIP");
		case 'B' : System.out.println("VIP"); break;
		case 'C' : System.out.println("우수");
		case 'D' : System.out.println("일반"); break;
		default : System.out.println("없음");
		}
		System.out.println("감사합니다");
	}
}