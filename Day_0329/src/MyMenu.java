import java.util.Scanner;

public class MyMenu {

	public static void main(String[] args) {
		int a;

		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("=====[���� ���α׷�]=====");
			System.out.println("     1. ��   ��");
			System.out.println("     2. ��ü���");
			System.out.println("     3. ��   ȸ");
			System.out.println("     4. ��   ��");
			System.out.println("     5. ��   ��");
			System.out.println("     0. ��   ��");
			System.out.println("======================");
			System.out.println("     ���� > ");
			
			a = scanner.nextInt(); //Exception ó���� ���� �ʾ���.
			
			switch (a) {
			case 1 : System.out.println("**�Է��� �����߽��ϴ�.");break;
			case 2 : System.out.println("**��ü ����� �����߽��ϴ�.");break;
			case 3 : System.out.println("**��ȸ�� �����߽��ϴ�.");break;
			case 4 : System.out.println("**������ �����߽��ϴ�.");break;
			case 5 : System.out.println("**������ �����߽��ϴ�.");break;
			case 0 : System.out.println("**���α׷��� �����մϴ�.");return;
			default : System.out.println("err) �޴��� �ٽ� �������ּ���.");
			}
		}

	
//		if(a <= 6) {
//			
//			while (a <= 6) {
//				
//				switch (a = 6) {
//				case 1 : System.out.printf("=====[���� ���α׷�]=====%n	1. ��  ��%n	2. ��ü ���"
//						+ "%n	3. ��  ȸ%n	4. ��  ��%n	5. ��  ��%n	6. ��  ��%n");
//						System.out.printf("%d���� �����ϼ˽��ϴ�.",a);
//				case 2 : System.out.printf("=====[���� ���α׷�]=====%n	1. �� ��%n	2. ��ü ���"
//						+ "%n	3. ��  ȸ%n	4. ��  ��%n	5. ��  ��%n	6. ��  ��%n");
//						System.out.printf("%d���� �����ϼ˽��ϴ�.",a);
//				case 3 : System.out.printf("=====[���� ���α׷�]=====%n	1. �� ��%n	2. ��ü ���"
//						+ "%n	3. ��  ȸ%n	4. ��  ��%n	5. ��  ��%n	6. ��  ��%n");
//						System.out.printf("%d���� �����ϼ˽��ϴ�.",a);
//				case 4 : System.out.printf("=====[���� ���α׷�]=====%n	1. �� ��%n	2. ��ü ���"
//						+ "%n	3. ��  ȸ%n	4. ��  ��%n	5. ��  ��%n	6. ��  ��%n");
//						System.out.printf("%d���� �����ϼ˽��ϴ�.",a);
//				case 5 : System.out.printf("=====[���� ���α׷�]=====%n	1. �� ��%n	2. ��ü ���"
//						+ "%n	3. ��  ȸ%n	4. ��  ��%n	5. ��  ��%n	6. ��  ��%n");
//						System.out.printf("%d���� �����ϼ˽��ϴ�.",a);
//				case 6 : System.out.printf("=====[���� ���α׷�]=====%n	1. �� ��%n	2. ��ü ���"
//						+ "%n	3. ��  ȸ%n	4. ��  ��%n	5. ��  ��%n	6. ��  ��%n");
//						System.out.printf("%d���� �����ϼ˽��ϴ�.",a);
//				}
//			}
//			System.out.printf("%d���� �����ϼ˽��ϴ�.",a);
			
		
		
		
	}

}

/*
	[���� ���α׷�]
	1.�� ��
	2.��ü ���
	3.�� ȸ
	4.�� ��
	5.�� ��
	0.�� ��
*/