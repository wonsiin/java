import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest1 {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		
		System.out.println(set.isEmpty());
		System.out.println(set.size());
		System.out.println(set);
		
		set.add("����");
		set.add("�λ�");
		set.add("����");
		set.add("��õ");
		set.add("����");
		set.add("����");							//�ߺ��Ұ��⶧���� �߰����� �ʴ´�.
		
		//��ü ��ȸ
		Iterator<String> iter = set.iterator();
		while(iter.hasNext())					//��ü data ��ȸ������
			System.out.println(iter.next());
		set.iterator();
		
		System.out.println(set.isEmpty()); 
		System.out.println(set.size());
		System.out.println(set);

	}

}
