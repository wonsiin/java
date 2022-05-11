package mylambda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LambdaTest5 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("korea");
		list.add("china");
		list.add("japan");
		list.add("canada");
		System.out.println(list);
		list.forEach(x -> System.out.println(x));
		list.replaceAll(x -> x.toUpperCase()); //toUpperCase() : 대문자로 변환
		System.out.println(list);
		list.removeIf(x -> x.contains("P"));	//글자에 P가 있으면 삭제시킨다.
		System.out.println(list);
		
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "abc");
		map.put(2, "def");
		map.put(3, "kbs");
		System.out.println(map);
		map.forEach((k,v) -> System.out.println(k + " " + v)); //전달인자 값을 2개로 달라고 하는 의미
	}

}


