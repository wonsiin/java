import java.util.Scanner;

/*[����] ��ǰ�� ����(g)�� �Է¹޴´�.
 * ��ǰ�� ���Կ� ���� �Ǹ� �Ҽ��ִ��� ������ �Ǻ� (double)
 * ���԰� 5~ 10g �̸� "��ǰ�� �����߽��ϴ�."
 * ���԰� 5 < a, a > 10 "�Ǹ��� �� ���� ��ǰ�Դϴ�"
 */

public class Example1 {

	public static void main(String[] args) {
		
		System.out.println("��ǰ�� ���Ը� �Է��ϼ���(g) : ");
		Scanner sc = new Scanner(System.in);
		double mm = sc.nextDouble();
		
		if(mm >= 5 && mm <= 10) {
			System.out.printf("%.1fg��ǰ�� �����߽��ϴ�.",mm);
		}else {
			System.out.printf("%.1fg�� �Ǹ��� �� ���� ��ǰ�Դϴ�",mm);
		}
//		if(!(mm >= 5 && mm <= 10)) {
//		(mm < 5 || mm > 10)
//			System.out.printf("%.1fg�� �Ǹ��� �� ���� ��ǰ�Դϴ�",mm);
//		}else {
//			System.out.printf("%.1fg��ǰ�� �����߽��ϴ�.",mm);
//		}

	}

}
