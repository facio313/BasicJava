package chapter05;

public enum Week {
	MONDAY(2, "월요일"), 
	TUESDAY(3, "화요일"), 
	WEDNESDAY(4, "수요일"), 
	THURSDAY(5, "목요일"), 
	FRIDAY(6, "금요일"), 
	SATURDAY(7, "ㅌ요일"), 
	SUNDAY(1, "일요일");
	
	Week(int code, String koreanName) {
		this.code = code;
		this.koreanName= koreanName;
	}
	int code;
	String koreanName;
	
	// 커서 끌어서 선택하고 ctrl shift x 대문자 ctrl shift s 소문자
	//;을 붙이고
}

enum Season {
	SPRING, SUMMER, FALL, WINTER
}

enum HttpErrorCode {
	OK, NOT_FOUND // 상수일 때만 _(언더바) 쓸 수 있음
}