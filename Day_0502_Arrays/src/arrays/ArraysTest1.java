package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysTest1 {

	public static void main(String[] args) {
		List<String> slist = new ArrayList<>(); //Read �� ������ ����.
		slist.add("���ѹα�");
		slist.add("�̱�");
		slist.add("�Ϻ�");
		slist.add("ĳ����");
		
		slist.forEach(x -> System.out.println(x)); //x�� list���� �� ���
		//R�� ����
		List<String> slist2 = Arrays.asList("Korea","Americe","Japan","Canada");//Read �� ����
		slist2.forEach(x -> System.out.println(x));
		
		List<Integer> ilist = Arrays.asList(5,3,6,8,3,1); //Integer ���ڸ� �ǹ� (AutoBoxing�� �Ǳ⶧���� new Integer�� �Ǵ°Ŵ�)
		
		

	}

}
