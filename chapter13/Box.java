package chapter13;

public class Box<T> { // <E,T extends나 super ~~>도 가능함 
//	private Object value;
	private T value;
	
//	public Box(Object value) {
	public Box(T value) {
		this.value = value;
	}
	
//	public Object getValue() {
	public T getValue() {
		return value;
	}
	
//	public void setValue(Object value) {
	public void setValue(T value) {
		this.value = value;
	}
}
