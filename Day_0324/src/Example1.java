import java.util.*;

public class Example1 {

	public static void main(String[] args) {
//		int temp;
//		String a;
//		a = text
		System.out.println("���� �Է��ϼ��� : ");
		Scanner s = new Scanner(System.in);
		int temp = s.nextInt();
		int temp1 = temp;

		String temp2 = (temp1 % 2 == 1) ? temp1 + "���� Ȧ�� �Դϴ�.": temp1 + "���� ¦�� �Դϴ�.";
		System.out.println(temp2);
	}

}
