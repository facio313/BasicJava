package bookstore;

import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import oracle.jdbc.pool.OracleDataSource;

public class BookStoreApplication {
	private static BookStoreApplication instance = new BookStoreApplication();

	private BookStoreApplication() {
	}

	public static BookStoreApplication getInstance() {
		return instance;
	}

	// Jdbc : Java Database Connectivity 템플릿
	private static JdbcTemplate template = new JdbcTemplate();

	//프로그램 시작점
	public static void main(String[] args) {
		//new Home() : 객체 생성
//		Home home = new Home();
//		home.initialize();
		new Home().initialize();//싱글톤으로 해도 됨
	}

	// static : 메모리에 올림(로딩)
	// JdbcTemplate : 리턴타입
	public static JdbcTemplate getTemplate() {
		try {
			// 오라클 데이터 소스 설정(라클아 어딨니?)
			// pool : 연결객체(connection객체)를 미리 만들어서 담아놓을 공간. 빌리고, 반납
			OracleDataSource dataSource;
			dataSource = new OracleDataSource();
			// 대전광역시 중구 문화동 132번지
			// thin 드라이버
			dataSource.setURL("jdbc:oracle:thin:@localhost:1521:xe");
			// 누가 들어올 수 있니?
			dataSource.setUser("sems");
			dataSource.setPassword("java");
			template.setDataSource(dataSource);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return template;
	}
}
