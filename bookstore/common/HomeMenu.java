package bookstore.common;
//8.로그인\t2.회원가입\t0.프로그램 종료\n메뉴선택
//enum : 상수를 모아놓은 열거 타입
public enum HomeMenu {
	//8.로그인\t2.회원가입\t0.프로그램 종료\n메뉴선택
	//Home(menu, menuString)
	//Home(메뉴번호, 메뉴내용)
	// \t : 탭
	// \n : 개행(다음 줄로 이동)
	HOME(-1, "8.로그인\t2.회원가입\t0.프로그램 종료\n메뉴선택"),
	QUIT(0, "프로그램을 종료합니다.\n감사합니다."),
	LOGIN(8, "아이디와 비번 입력");

	//멤버변수
	private final int menu;
	private final String menuString;

	//생성자
	//int menu, String menuString : 매개변수
	HomeMenu(int menu, String menuString){
		//멤버변수 = 매개변수
		this.menu = menu;
		this.menuString = menuString;
	}
	
	//final이기 때문에 set은 없고 값만 가져옴
	public int getMenu() {
		return menu;
	}

	public String getMenuString() {
		return menuString;
	}

	//menu를 파라미터로 받으면 해당 menuString을 리턴
	public static HomeMenu findMenu(int menu) {
		//1) values() :
		//HOME(-1, "8.로그인\t2.회원가입\t0.프로그램 종료\n메뉴선택")
		//QUIT(0, "프로그램을 종료합니다.\n감사합니다.")
		//LOGIN(8, "아이디와 비번 입력")
		//2) HomeMenu hm : 
		//HOME(-1, "8.로그인\t2.회원가입\t0.프로그램 종료\n메뉴선택")
		for(HomeMenu hm : values()) {
			//hm.getMenu() : -1, 8, 0
			if(hm.getMenu() == menu) {
				//객체를 리턴 : HOME(-1, "8.로그인\t2.회원가입\t0.프로그램 종료\n메뉴선택"),
				return hm;
			}
		}
		return null;
	}
}
