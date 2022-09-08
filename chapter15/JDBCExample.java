package chapter15;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCExample {
	public static void main(String[] args) throws Exception { //throws Exception 없었으면 할 때마다 에러남
		//0. 드라이버 로딩(리플렉션 기법 사용)
		//new OracleDriver()
		Class.forName("oracle.jdbc.driver.OracleDriver");//try-catch는 가독성이 떨어짐(개발할 때는 좋음) -> 가독성 때문에 add Throw, Exception / 아직은 try-catch할 필요 없음. 흐름만 보는 거라
		
		//1. DB 접속(서버 주소, 아이디, 패스워드)
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "in91", "java"); // localhost = 127.0.0.1 // 호스트이름, 포트, SID(Service ID)
		
		//2. 연결된 DB에 요청할 쿼리 작성
		Statement statement = connection.createStatement();
		String sql = ""; // 쿼리 작성하기 전에 sql developer에서 먼저 써보고 되면 옮기기
		sql += " SELECT";
		sql += "     mem_id,";
		sql += "     mem_name,";
		sql += "     mem_hp,";
		sql += "     mem_mail"; 
		sql += " FROM";
		sql += "     member"; // sql문에 세이콜론(;)이 있으면 안 된다!
		//""에서 맨 앞에나 뒤에 한 칸씩 띄워줘야 함, 공백이 없으면 에러!
		//보통 alt shift a해서 맨 앞에 한 칸씩 띄움
		
		//3. 쿼리 실행
		// executeQuery : SELECT => 결과 집합(ResultSet)을 반환
		// executeUpdate : INSERT, UPDATE, DELETE => int 타입실행된 개수 반환
		ResultSet resultSet = statement.executeQuery(sql);
		
		//4. 실행 결과 받기
		while (resultSet.next()) { // next : 그 다음에 행이 있느냐! hasnext와 같음 
			String memId = resultSet.getString(/*컬럼명*/"mem_id"); // 매개변수로 가능하면 인덱스보단 컬럼명 쓰기!
			String memName = resultSet.getString("mem_Name");
			String memHp = resultSet.getString("mem_Hp");
			String memMail = resultSet.getString("mem_Mail");
			// 다 꺼내와서 while에 resultSet.next()를 하고 next로 다음에 또 뭐가 있으면 while 실행문 고고
			System.out.printf("%s \t %s \t %s \t %s\n", memId, memName, memHp, memMail);
		}
		//throws Exception이 없으면 이 부분을 try-catch로 묶어야 하는데 지금은 넘 복잡하니
		
		//5. 접속 종료
		resultSet.close();
		statement.close();
		connection.close();
	}
}