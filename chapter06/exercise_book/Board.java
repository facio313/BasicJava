package chapter06.exercise_book;

public class Board {
	private String title;
	private String content;
	private String writer;
	private String date;
	private int hitCount;
	private boolean stop;
	
	Board(String title, String content) {
		this(title, content, "로그인한 회원 아이디", "현재 컴퓨터 날짜", 0);
//		this.title = title;
//		this.content = content;
//		this.writer = "로그인한 회원아이디";
//		this.date = "현재 컴퓨터 날짜";
//		this.hitCount = 0;
	}
	Board(String title, String content, String writer) {
		this(title, content, writer, "현재 컴퓨터 날짜", 0);
//		this.title = title;
//		this.content = content;
//		this.writer = writer;
//		this.date = "현재 컴퓨터 날짜";
//		this.hitCount = 0;
	}
	Board(String title, String content, String writer, String date) {
		this(title, content, writer, date, 0);
//		this.title = title;
//		this.content = content;
//		this.writer = writer;
//		this.date = date;
//		this.hitCount = 0;
	}
	Board(String title, String content, String writer, String date, int hitCount) {
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.date = date;
		this.hitCount = 0;
	}
	
	public String getTitle() {
		return title; // getter
	}
	
	public void setTitle(String title) {
		this.title = title; // ==> setter
	}
	
	public String getContent() {
		return content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	public String getWriter() {
		return writer;
	}
	
	public void setWriter(String writer) {
		this.writer = writer;
	}
	
	public String getDate() {
		return date;
	}
	
	public void setDate(String date) {
		this.date = date;
	}
	
	public int getHitCount() {
		return hitCount;
	}
	
	public void setHitCount(int hitCount) {
		if( hitCount < 0) {
			this.hitCount = 0;
			return;
		} else {
			this.hitCount = hitCount;
		}
	}
	
	public boolean isStop() {
		return stop;
	}
	
	public void setStop(boolean stop) {
		this.stop = stop;
		this.hitCount = 0;
	}
	
//	public void setHitCount(int hitCount) {
//		if ( hitCount > 10 ) {
//			this.hitCount = hitCount;
//			System.out.println(this.hitCount);
//			System.out.println("그러고도 잠 와?");
//		} else {
//			System.out.println("더 던지고 와!");
//		}
//	}
}