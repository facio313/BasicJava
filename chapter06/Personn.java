package chapter06;

class Personn {
	 String name;
	 int age;
	 String sex;
		
	 public Personn(String name){
	 this(name, 12);  //자동으로 해당 파라미터에 적합한 자신의 생성자를 호출한다.
	 }
		
	 public Personn(String name, int age){
	 this(name, age, "Man");  //자동으로 해당 파라미터에 적합한 자신의 생성자를 호출한다.
	 }
		
	 public Personn(String name, int age, String sex){
	 this.name = name;
	 this.age = age;
	 this.sex = sex;
	 }
	}