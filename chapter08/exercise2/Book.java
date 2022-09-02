package chapter08.exercise2;

import java.util.Objects;

public abstract class Book { // Object는 최상위 클래스로 자동으로 상속받
	private int number;
	private String title;
	private String author;
	private static int countOfBooks;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
		this.number = ++countOfBooks;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	public abstract int getLateFee(int lateDays);//바디가 없으면 abstract메소드고 추상 메소드면 추상 클래스가 돼야 함

	@Override
	public int hashCode() {
		return Objects.hash(author, title);
	}

	@Override
	public boolean equals(Object obj) { //객체끼리 비교하여 같은지 확인하기 위해 나온 것이 equals
		Book book = (Book) obj;
		if(title.equals(book.title)&& author.equals(book.author)) {
			return true;
		}
		return false;
	}
	
	public String toString() {
		return String.format("관리번호: %d번, 제목: %s, 작가: %s(일주일 연체료: %,d원)",number, title, author, getLateFee(7));
	}
}