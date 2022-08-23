package chapter04.exercise;

public class Exercise_Extra4 {
	public static void main(String[] args) {
		boolean run = true;
		int odd = 0;
		int even = 0;
		int i = 1;
		
		while(run) {
			if(i%2 == 0) {
				even -= i;
			} else {
				odd += i;
			} 
			if(odd + even>=100) {
				break;
			} 
			i++;
		} 
		System.out.println(i);
	}
}