package memo;

import java.util.List;

public class MemoService {
	MemoDAO dao = new MemoDAO(); //객체를 새로 만들어주면 낭비! 필드로 선언 
	public List<MemoVO> getMemos() throws Exception{
//		MemoDAO dao = new MemoDAO();
		return dao.getMemos();
	}
	
	public int insertMemo(MemoVO vo) throws Exception {
//		MemoDAO dao = new MemoDAO();
		return dao.insertMemo(vo);
	}
	
	public int updateMemo(MemoVO vo) throws Exception {
		return dao.updateMemo(vo);
	}
	
	public int deleteMemo(int no) throws Exception {
		return dao.deleteMemo(no);
	}
}