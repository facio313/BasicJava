package chapter06;

public class PersonnExample {
	public static void main(String[] args) {
		Personn person1 = new Personn("바보");
		System.out.println(person1.name);
		System.out.println(person1.age); //이건 고정된 것? 그렇다면 바꾸고자 할 때, Person 클래스에서만 바꿔야 하나?
	}
}