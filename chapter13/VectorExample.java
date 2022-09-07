package chapter13;

import java.util.List;
import java.util.Vector;

public class VectorExample {
	public static void main(String[] args) {
		List<Board> list = new Vector<Board>(); // List로 타입을 정하는 장점! Vector든 ArrayList든 객체를 뭘로 생성하든 상관 없음!
		//Vector와 ArrayList는 동작하는 내용이 완전히 동일함! 내부적인 것은 조금 다른데 쓰레드 관련 부분이라
		//Vector는 모든 쓰레드가 일관성 있는 동기화된 데이터를 읽을 수 있도록 해줌
		//동기화하면 모든 쓰레드에게 내가 했다는 것을 알려주기 때문에 속도가 느려짐
		//그래서 그냥 ArrayList씀 그게 더 빨라서
		list.add(new Board("제목1", "내용1", "글쓴이1"));
		list.add(new Board("제목2", "내용2", "글쓴이2"));
		list.add(new Board("제목3", "내용3", "글쓴이3"));
		list.add(new Board("제목4", "내용4", "글쓴이4"));
		list.add(new Board("제목5", "내용5", "글쓴이5"));
		
		for (int i = 0; i < list.size(); i++) {
			Board board = list.get(i);
			System.out.println(board);
		}
		list.remove(2);
		list.remove(3);
		System.out.println();
		for (Board board : list) {//foreach ctrl+space
			System.out.println(board);
		}
	}
}