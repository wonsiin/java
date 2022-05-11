import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@FunctionalInterface
interface MyInterface{
	public void test();		//�Լ��ʿ�����  �Ű����� -> �Է� , ���� -> ��� �̶�� ����
}

interface Sample{
	public void sample();
}

public class LambdaTest2 {
	public static void main(String[] args) {
//		MyInterface m1 = () -> System.out.println("���ٽ� ����"); //���� �Է� (�͸�ü)
//		m1.test(); //���� ���
//		Sample m1 = () -> System.out.println("���ٽ� ����"); //���� �Է� (�͸�ü)
//		m1.sample(); //���� ���
//	}
		List<Integer> ilist = new ArrayList<>();
		ilist.add(5);
		ilist.add(51);
		ilist.add(55);
		ilist.add(62);
		ilist.add(52);
		ilist.add(14);
		System.out.println(ilist);
		
		ilist.forEach(x -> System.out.print(x + " "));
//		ilist.removeIf(x -> (x%2 ==0)? true : false);
		ilist.removeIf(x -> (x%2 ==0));
		System.out.println(ilist);
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "�ѱ���");
		map.put(2, "������");
		map.put(3, "�a��");
		map.put(4, "������");
		map.forEach((k,v) -> System.out.println(k + " , " + v));	//k = Ű , v = ��
		System.out.println(map);
		

}
//java.util.function ==> interface �� ���� ==> Functional Interface!!
/*
 * Consumer (�� : T �� : void )
 * Supplier	(�� : () �� : T )
 * Predicate (�� : T �� : boolean )
 * Function (�� : T,R �� : R )		
 * Runnable (�� : () �� : void )
 * 
 * BiConsumer (�� : T, U �� : void)
 * BiPredicate(�� : T, U �� : boolean)
 * BiFunction(�� : T, U, R �� : R)
 * 
 */
}