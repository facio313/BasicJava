package chapter08.exercise2;

public abstract class Shape implements Comparable<Shape> {
	
	public Shape(int[] shape) {
	}
	
	public abstract double area();
	public abstract double perimeter();
	
	public int compareTo(Shape o) {
		if (this.area() > o.area()) { // 언제 this를 쓰고 언제 this를 안 쓰나...
			return 1;
		} else if (this.area() < o.area()) {
			return -1;
		}
		return 0;
		
		//둘레 기준으로 하려면 perimeter로 하면 
	}
}