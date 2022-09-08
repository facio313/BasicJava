package chapter13.exercise;

import java.util.ArrayList;
import java.util.List;

//Data Access Object 데이터베이스에 가서 데이터를 갖고 와서 처리하는 것
public class BoardDao {
	public List<Board> getBoardList(){
		List<Board> list = new ArrayList<Board>();
		list.add(new Board("제목1", "내용1"));
		list.add(new Board("제목2", "내용2"));
		list.add(new Board("제목3", "내용3"));
		return list;		
	}
}