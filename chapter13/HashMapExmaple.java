package chapter13;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExmaple {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>(); // 타입은 개발자 마음대로. 주로 문자를 많이 씀
		map.put("신용균", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 90);
		System.out.println(map.size());
		
		Integer hongValue = map.get("홍길동");
		System.out.println(hongValue);
		System.out.println();
		
		//모든 요소 출력 --목적은 항상 Value임
		//1.Entry를 이용
		Iterator<Entry<String, Integer>> entryIterator = map.entrySet().iterator();
		while (entryIterator.hasNext()) {
			Entry<String, Integer> entry = entryIterator.next();
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
		
		System.out.println();
		
		//1-2. for each문 이용
		for (Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
		
		System.out.println();
		
		//2.Key를 이용
		Iterator<String> iterator = map.keySet().iterator();
		while (iterator.hasNext()) {
			String key = iterator.next();
			System.out.println(key + ": " + map.get(key));
		}
		
		System.out.println();
		
		//2-2. for each문 이용
		Set<String> keySet = map.keySet();
		for (String key : keySet) {
			System.out.println(key + ": " + map.get(key));
		}
		
		System.out.println();
		
		//3.Value를 직접 이용
		Collection<Integer> values = map.values();
		for (Integer value : values) {
			System.out.println(value);
		}

		System.out.println();
		
		//반복문 1.for i문 2.for each문 3.foreach 함수 사용
		values.forEach(System.out::println);//consumer interface
	} // 람다 사용하면 쉬움
}