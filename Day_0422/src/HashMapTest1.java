import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest1 {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		
		map.put(3, "���"); 	//3 = IntegerŸ��
							//auto boxing
		map.put(1, "��");
		map.put(6, "�ٳ���");
		map.put(7, "����");
		map.put(9, "����");
		
		//������ ����
		
//		String v = map.put(1, "������");	//���� ���� ������� Update �ȴ�.
//										//Key�� ������ replace�ȴ�.(���� �ִ��� ƨ�ܳ��´�[�������� �ðܳ��´�])
//		System.out.println(v);
		
//		System.out.println(map.isEmpty());
//		System.out.println(map.size());
//		System.out.println(map.get(6));
//		System.out.println(map);
//		map.remove(9);
//		System.out.println(map.size());
		
		Set<Integer> key = map.keySet(); 			//map data�� ter�� ����
		Iterator<Integer> iter = key.iterator();
		
		while(iter.hasNext()) {
			Integer k = iter.next();
			System.out.println("Key = " + k + ", Velue = " + map.get(k));
		}

//		for(Integer t : key) {						//ter data�� Integer t�� ����
//			System.out.println(map.get(t));			//t�� ������� ���
//		}
		
		
		
	
	}

}
