package chapter11.exercise;

public class ByteTosStringExample {
	public static void main(String[] args) {
		byte[] bytes = { 73, 32, 108, 111, 118, 101, 32, 121, 111, 117};
		String str = new String(bytes, 0, 10);
		System.out.println(str);
		
		
//		byte[] bytess = { 73, 32, 119, 97, 110, 116, 32, 115, 101, 120};
//		String strr = new String(bytess, 0, 10);
//		System.out.println(strr);
	}
}

