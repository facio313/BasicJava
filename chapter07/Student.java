package chapter07;

public class Student extends People {
	public int studentNo;
	
	public Student(String name, String ssn, int studentNo) {
//		super();
		super(name, ssn);
		this.studentNo = studentNo;
	}
}