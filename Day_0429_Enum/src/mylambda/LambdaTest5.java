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
		list.replaceAll(x -> x.toUpperCase()); //toUpperCase() : �빮�ڷ� ��ȯ
		System.out.println(list);
		list.removeIf(x -> x.contains("P"));	//���ڿ� P�� ������ ������Ų��.
		System.out.println(list);
		
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "abc");
		map.put(2, "def");
		map.put(3, "kbs");
		System.out.println(map);
		map.forEach((k,v) -> System.out.println(k + " " + v)); //�������� ���� 2���� �޶�� �ϴ� �ǹ�
	}

}


