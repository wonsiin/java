import java.util.*;

public class Example4 {

	public static void main(String[] args) {
		int si = 9500;
		int x;

		Scanner se = new Scanner(System.in);
		System.out.println("���� �ð� : ");
		String nd = se.nextLine();
		x = Integer.parseInt(nd);
		
		int total = x * si;
		int sn = total - (int)(total * 0.033);
		
		System.out.println("* �� �ݾ� : " + total);
		System.out.println("* ������ : " + (int)(total * 0.033));
		System.out.println("* �Ǽ��ɾ� : " + sn);
		
		System.out.println("Data" + 10 * 20);
		System.out.println("Data" + (10 - 20));   //sysout Ctrl + �����̽���
		System.out.println();


	}

}
