package chapter06;

public class Carrr {
	String model;
	String color;
	String maker;
	String buyer;
	String bringer;
	int maxSpeed;
	
	Carrr(){
		
	}
	
	Carrr(String model){
		this.model = model;
	}
	
	Carrr(String model, String color){
		this.model = model;
		this.color = color;
	}
	
//	Car(String model, String color, String maker){//Duplicate method Car(String, String, String) in type Car
//		this.model = model;
//		this.color = color;
//		this.maker = maker;
//	}
//	
//	Car(String maker, String buyer, String bringer){//Duplicate method Car(String, String, String) in type Car
//		this.maker = maker;
//		this.buyer = buyer;
//		this.bringer = bringer;
//	}
}