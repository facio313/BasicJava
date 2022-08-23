package chapter06;

public class StudentExmaple {
	public static void main(String[] args) {
		Student student1 = new Student();//밑에 것과 다른 student 클래스임
		Student student2 = new Student();//주소값이 다르기 때문에!!
		System.out.println(student1 == student2);
		new Student();
		new Student();
		new Student();
		new Student();
		new Student();
		new Student();
		new Student();
		new Student();
	}
}