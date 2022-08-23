package chapter06.exercise_book;

public class BoardExample2 {
	public static void main(String[] args) {
		Board board = new Board("", "", "", "");
		
		// 잘못된 변경
//		board.setHitCount(-50);
		
//		System.out.println("현재 속도: " + board.getHitCount());
		
		// 올바른 변경
		board.setHitCount(60);
		
		// 멈춤
		if(!board.isStop()) {
			board.setStop(true);
		}
		
		System.out.println("현재 속도: " + board.getHitCount());
	}
}
