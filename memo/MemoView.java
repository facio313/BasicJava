package memo;

import java.util.List;
import java.util.Scanner;

public class MemoView {
	public void init() {
		System.out.println("1.목록|2.메모|3.등록|4.수정|5.삭제|0.종료");
		System.out.print("메뉴를 입력하세요: ");
	}
	
	//목록 보기 메모
	public void viewMemos(MemoController controller) throws Exception { //컨트롤러가 서비스와 뷰를 연결해줌
		List<MemoVO> list = controller.getMemos(); //객체를 생성하기 보다는(밑에 거) 이렇게 써라
//		MemoController controller = new MemoController();
		for (MemoVO vo : list) {
			System.out.println(vo);
		}
	}
	
	public void viewDetailMemo(MemoController controller, Scanner scanner) throws Exception {
		System.out.print("보고 싶은 메모 번호 입력: ");
		int searchNo = Integer.parseInt(scanner.nextLine());
		MemoVO vo = controller.getMemo(searchNo);
		System.out.println(vo);
	}
	
	//등록
	public void insertMemo(MemoController controller, Scanner scanner) throws Exception { //??????
		System.out.print("제목: ");
		String title = scanner.nextLine();
		System.out.print("내용: ");
		String content = scanner.nextLine();
		System.out.print("작성자: ");
		String writer = scanner.nextLine();
		
		int insertMemo = controller.insertMemo(new MemoVO(title, content, writer));//새로 만들어야 하니까 계속 객체를 만듬
		if (insertMemo > 0) {
			System.out.println("메모가 등록되었습니다.");
		} else {
			System.out.println("메모 등록 실패!");
		}
	}
	
	// 수정
	public void updateMemo(MemoController controller, Scanner scanner) throws Exception {
		System.out.print("수정할 메모 번호: ");
		int no = Integer.parseInt(scanner.nextLine());
		System.out.print("제목: ");
		String title = scanner.nextLine();
		System.out.print("내용: ");
		String content = scanner.nextLine();
		System.out.print("작성자: ");
		String writer = scanner.nextLine();
		
		int updateMemo = controller.updateMemo(new MemoVO(no, title, content, writer));
		if (updateMemo > 0) {
			System.out.println("메모가 수정되었습니다.");
		} else {
			System.out.println("메모 수정 실패!");
		}
	}
	
	// 삭제
	public void deleteMemo(Scanner scanner) throws Exception {
		System.out.print("삭제할 메모 번호: ");
		int no = Integer.parseInt(scanner.nextLine());
		
		MemoController controller = new MemoController();
		int deleteMemo = controller.deleteMemo(no);
		if (deleteMemo > 0) {
			System.out.println("메모가 삭제되었습니다.");
		} else {
			System.out.println("삭제할 메모가 없습니다.");
		}
	}
}
