package memo;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class MemoTest {

//	@Test
//	void test() throws Exception {
//		MemoDAO dao = new MemoDAO();
//		List<MemoVO> list = dao.getMemos();
//		assertEquals(0, list.size()); //(예상한 데이터, 실제 데이터)
//		assertNotNull(list);
		// test도 자동화를 선호함
		// 시나리오를 만들어서 되면 배포!
		// 쓰기 어렵고 복잡해서 잘 안 쓰는데, 이런 게 있다고 알아야 함
//	}
//	
//	@Test
//	void serviceTest() throws Exception {
//		MemoService service = new MemoService();
//		List<MemoVO> list = service.getMemos();
//		assertEquals(0, list.size());
//	}
//	
	@Test
	void selectTest() throws Exception {
		MemoDAO dao = new MemoDAO();
		List<MemoVO> list = dao.getMemos();
		assertEquals(1, list.size());
	}
	
	@Test
	void insertTest() throws Exception {
		MemoDAO dao = new MemoDAO();
		dao.insertMemo(new MemoVO(0, "두 번째 메모", "안녕하세요.", "sem", null, null));
		List<MemoVO> list = dao.getMemos();
		assertEquals(2, list.size());
	}
}
