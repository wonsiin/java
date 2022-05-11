import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest1 {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		
		System.out.println(set.isEmpty());
		System.out.println(set.size());
		System.out.println(set);
		
		set.add("서울");
		set.add("부산");
		set.add("제주");
		set.add("인천");
		set.add("광주");
		set.add("수원");							//중복불가기때문에 추가되지 않는다.
		
		//전체 순회
		Iterator<String> iter = set.iterator();
		while(iter.hasNext())					//전체 data 순회돌리기
			System.out.println(iter.next());
		set.iterator();
		
		System.out.println(set.isEmpty()); 
		System.out.println(set.size());
		System.out.println(set);

	}

}
