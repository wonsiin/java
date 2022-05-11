import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortTest1 {

	public static void main(String[] args) {
		List<Integer> ilist = Arrays.asList(72,37,5,1,10,2,55,82,61);
		Collections.sort(ilist);
		System.out.println(ilist); //��������
		
		List<String> slist = Arrays.asList("����","ĥ��","����","����","�����!!");
		Collections.sort(slist, (a,b) -> a.compareTo(b));
		System.out.println(slist);
		
//		Scanner sc = new Scanner(System.in);
//		List<Score> so = new ArrayList<>();
		List<Score> so = Arrays.asList(
				new Score("5","���ڹ�",270),
				new Score("9","ȣ��",220),
				new Score("8","�̹�",300),
				new Score("2","�ޱ�",210),
				new Score("1","�ѿ�",250)
				);
		for(Score s : so) {
			System.out.println(s);
		}
		System.out.println();
		//so������ sortŸ���� �����ϴµ� �������� �ʴ�.
		//Comparable �������̽��� �����ؾ� sort�� �� �� �ִ�.
		Collections.sort(so);
		for(Score s : so) {
			System.out.println(s);
		}
		System.out.println();
		Collections.sort(so, (a,b) -> b.getTotal() - a.getTotal());
		for(Score s : so) {
			System.out.println(s);
		}
		

	}

}
