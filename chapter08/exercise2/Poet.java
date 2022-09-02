package chapter08.exercise2;

public class Poet extends Book{

	public Poet(String title, String author) {
		super(title, author);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getLateFee(int lateDays) {
		// TODO Auto-generated method stub
		return lateDays * 600;
	}

}
