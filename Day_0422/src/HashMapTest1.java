import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest1 {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		
		map.put(3, "사과"); 	//3 = Integer타입
							//auto boxing
		map.put(1, "배");
		map.put(6, "바나나");
		map.put(7, "딸기");
		map.put(9, "포도");
		
		//데이터 개수
		
//		String v = map.put(1, "오랜지");	//기존 값이 사라지고 Update 된다.
//										//Key가 같으면 replace된다.(월레 있던게 튕겨나온다[박힌돌이 팅겨나온다])
//		System.out.println(v);
		
//		System.out.println(map.isEmpty());
//		System.out.println(map.size());
//		System.out.println(map.get(6));
//		System.out.println(map);
//		map.remove(9);
//		System.out.println(map.size());
		
		Set<Integer> key = map.keySet(); 			//map data를 ter로 전달
		Iterator<Integer> iter = key.iterator();
		
		while(iter.hasNext()) {
			Integer k = iter.next();
			System.out.println("Key = " + k + ", Velue = " + map.get(k));
		}

//		for(Integer t : key) {						//ter data를 Integer t로 전달
//			System.out.println(map.get(t));			//t의 순서대로 출력
//		}
		
		
		
	
	}

}
