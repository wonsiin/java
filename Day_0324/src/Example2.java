import java.util.*; //�Է°� �����

import org.w3c.dom.Text;

public class Example2 {

	public static void main(String[] args) {
		int second = 12345;
		int second3 = second / 60 / 60;
		int second1 = second / 60 % 60;
		int second2 = second % 60;
		System.out.println("���ڸ� �Է��� �ּ���");
		Scanner se = new Scanner(System.in); 	//�Է°�������
		String nd = se.nextLine();				//
		second = Integer.parseInt(nd);			//����
		
		System.out.println(second + "�ʴ� " + second3 + "�� " + second1 + "�� " + second2 + "�� �Դϴ�.");
		System.out.println(second3 + "�ð� " +second1 + "�� " + second2 + "�ʴ� �� " + second + "�� �Դϴ�.");
		

	}

}
