package bookstore;

import book.BookController;
import bookstore.common.HomeMenu;

//...View와...Controller 사이에 연결해주는 클래스
public class Home {
	//연결대상1 : Controller 주입(inject)
	private BookController bookController = BookController.getInstance();
	
	//연결대상2 : View 주입(inject)
	private BookStoreView view = BookStoreView.getInstance();
	
	//초기화 메소드
	public void initialize() {
		// view의 환영인사 처리 -> 8, 2, 0 중 선택한 숫자를 받아와서
		//여기에서 home 메소드를 재호출
		//home(8) / home(2) / home(0)
		home(view.init());
	}
	
	//home(8) -> number에는 8이 할당
	private void home(int number) {
		System.out.println("number : " + number);
		
		//Login(8, "아이디와 비번 입력")는 HomeMenu menu 객체
		//menu 객체 => menu필드(8)와 menuString 필드("아이디와 비번 입력")
		HomeMenu menu = HomeMenu.findMenu(number);
		System.out.println(menu.getMenuString());
		
		//menu : HomeMenu 클래스의 객체
		switch(menu) {
		case LOGIN:
			
		
		}
	}
}
