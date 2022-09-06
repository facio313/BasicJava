package chapter11;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class DateExample {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);// 2022-09-06 12:29:40
		SimpleDateFormat format = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 hh시 mm분 ss초");
//		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM/dd  hh:mm-ss초");
		//SimpleDateFormat: 날짜를 원하는 포맷에 맞게 문자열로 변환
		System.out.println(format.format(date));
		
		Calendar calendar = Calendar.getInstance();
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH);
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		System.out.printf("%d년 %d월 %d일 %n", year, month, day);
		
		//책에 안 나오는 부분! date 구할 때마다 new를 구해야 한다고? 넘 비효율 => static으로 만들기
		//현재 지역 시간
		System.out.println(LocalDateTime.now());
		// 내가 원하는 형식으로 나타내고 싶ㅓㅇ!! chaining방식
		String date2 = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 E요일 hh시 mm분 ss초"));
		System.out.println(date2);
	}
}
