package memo;

import java.util.List;

public class MemoController {// 화면과 서비스를 연결해주는 역할/원래 컨트롤러가 훨씬 복잡함
	MemoService service = new MemoService();
	public List<MemoVO> getMemos() throws Exception {
		return service.getMemos();
	}
	
	public MemoVO getMemo(int searchNo) throws Exception {
		return service.insertMemo(vo);
	
	public int insertMemo(MemoVO vo) throws Exception {
		return service.insertMemo(vo);
	}
	
	public int updateMemo(MemoVO vo) throws Exception {
		return service.updateMemo(vo);
	}
	
	public int deleteMemo(int no) throws Exception {
		return service.deleteMemo(no);
	}
}
