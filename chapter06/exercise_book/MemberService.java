package chapter06.exercise_book;

public class MemberService {
	
	private static MemberService instance = new MemberService();
	
	private MemberService() {
	}
	
	public static MemberService getInstance() {
		return instance;
	}
	
	boolean login(String id, String password) {
		if ( id.equals("hong") && password.equals("12345")) {
			return true;
		}
		return false;
	}
	void logout(String id) {
		System.out.println("로그아웃 되었습니다.");
	}
}