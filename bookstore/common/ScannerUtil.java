package bookstore.common;

import java.util.Scanner;

//공통모듈(common module) 어디서든 접근하여 사용 가능
public class ScannerUtil {
	//static : 메모리에 미리 업로드
	private static Scanner scanner = new Scanner(System.in);

	//접근제한자 public : 어디서든 접근하여 사용 가능
	//ScannerUtil.scanner();
	public static Scanner scanner() {
		return scanner;
	}
}
