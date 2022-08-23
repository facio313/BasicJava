package chapter06.exercise_book;

public class BoardExample {
	public static void main(String[] args) {
		Board board1 = new Board("", "");
		Board board2 = new Board("", "", "");
		Board board3 = new Board("", "", "", "");
		Board board4 = new Board("", "", "", "");
		Board board5 = new Board("", "", "", "");
		
		Board board = new Board("", "", "", "");
		
		// 잘못된 변경 예
//		board.hitCount(-10);
//		System.out.println("현재 맞춘 횟수: " + board.hitCount);
		
		// 올바른 변경 예
		board.setHitCount(11);		
	}
}