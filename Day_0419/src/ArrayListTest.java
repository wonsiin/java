import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		 List<String> slist = new ArrayList<String>();
		 System.out.println(slist.size());
		System.out.println(slist);
		
		slist.add("�ٳ���");
		slist.add("���");
		slist.add("������");
		slist.add("Ű��");
		slist.add("���ξ���");
		slist.add("����");
		
		System.out.println(slist.get(0)); //���� ��ġ�� �˶����
//		1)Data ������ ��� 1��°
		for(int i = 0; i < slist.size(); ++i) { 
			System.out.print(slist.get(i) + " ");
		}
		System.out.println();
//		2)for ~ each ���� �̿��� ��ȸ (�迭���� ���) ������ ��� 2��°
		for(String temp : slist)
			System.out.print(temp + " ");
		System.out.println();
//		3)Iterator ��ü�� �̿��� ��ȸ
		Iterator<String> iter = slist.iterator(); // ��ȸ�� ���������� �Ѵ�.  (java.util)
		
		while(iter.hasNext()) { //���� �Һ��Ұ� �ִ��� �����
			System.out.print(iter.next() + " ");		//�Һ��Ұ� �ִٸ� �Һ� �ض�.
		}
		System.out.println();
		
//		System.out.println(slist.size());				//���� Ȯ��
//		System.out.println(slist);//��ü �ҷ�����
//		System.out.println(slist.size());
//		System.out.println(slist);
//		
//		System.out.println(slist.isEmpty());			//
//		System.out.println(slist.contains("���"));		//����ִ��� Ȯ��
//		System.out.println(slist.contains("�Ƹ޸�ī��")); 	//����ִ��� Ȯ��
//		
//		slist.add("�ٳ���");
//		System.out.println(slist);
//		String temp = slist.remove(2);
//		System.out.println(temp);
//		System.out.println(slist);
//		
//		String temp1 = slist.remove(slist.size()-1); // �� ���� �����Ҷ� ���
//		System.out.println(temp1);
//		System.out.println(slist);
////		slist.remove(10);
//		
//		boolean result = slist.remove("������"); //�ش� ���� ã�Ƽ� �����Ѵ�.
//		System.out.println("������� : " + result);
//		
//		slist.clear(); //��ü ���� �����Ҷ� ���
//		System.out.println(slist);
		
		
		
		//���ڿ�
//		List<String> slist = new ArrayList<String>();
		//Double��
//		List<Double> dlist = new ArrayList<Double>();
//		List<Number> ni = new ArrayList<Number>(); // ������ �� ����ȣ���� �ƹ����� �������ȴ�.
		
		
//		int [] iary = new int[10];
//		FitnessVO[] fart = new FitnessVO[10]; //�̰��� 10���� ������������
		
//		List<FitnessVO> list1 = new ArrayList<FitnessVO>(); // �̰����� ���Ҷ� ������ �ִ´�.
//		List<Integer> list2 = new ArrayList<>(); // <>�� �־ �ǰ� �ȳ־ �ȴ�.
//		List<Integer> list3 = new Vector<>();
//		List<Integer> list3 = new ArrayList<>();
		
		
	}

}
