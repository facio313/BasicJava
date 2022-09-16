package memo;

import java.util.Scanner;

public class MemoApplication {
	public static void main(String[] args) throws Exception {
		MemoView view = new MemoView();
		Scanner scanner = new Scanner(System.in);
		MemoController memoController = new MemoController();

		menu: while (true) {
			System.out.println("---------------------------");
			view.init();
			// 첫 번째, 메뉴 보여줌
			int menu = Integer.parseInt(scanner.nextLine());
			switch (menu) {
			case 1: // 전체 목록
				view.viewMemos(memoController);
				break;
			case 2: // 메모 한 개
				view.viewDetailMemo(memoController, scanner);
				break;
			case 3: // 등록
				view.insertMemo(memoController, scanner);
				break;
			case 4: // 수정
				view.updateMemo(memoController, scanner);
				break;
			case 5: // 삭제
				view.deleteMemo(scanner);
				break;
			case 0: // 종료
				System.out.println("프로그램을 종료합니다. ");
				// System.exit(0);
				// return;
				break menu; // 셋 다 똑같음
			}
		}
	}
}