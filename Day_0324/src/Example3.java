import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		int x = 0;
		int fee = 35000;
		int total = x; //���ο���
		int amount;  // �� ���
		int child;
		int ch = 35000 / 10;
		ch = fee - ch;
		
		Scanner se = new Scanner(System.in);
		System.out.println("�� ����ΰ���? ");
		String nd = se.nextLine();
		x = Integer.parseInt(nd);
		
		
		
		System.out.println("��̴� ��� �ΰ���? ");
		String nn = se.nextLine();
		child = Integer.parseInt(nn);
		
		amount = (x - child) * fee + (child * ch);
//		System.out.println(x);
//		System.out.println(child);
//		System.out.println(ch);
		
		String toto = (child >= x) ? "��̴� ���� ����Դϴ�.": "�������.";
		System.out.println("���ο��� " + x + "��̴� ���� " + child + "���Դϴ�.");
		System.out.println(toto + "���ε� �� �ݾ��� " + amount + "�Դϴ�.");

	}

}
