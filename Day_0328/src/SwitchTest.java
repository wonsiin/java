import java.util.Scanner;

public class SwitchTest {

	public static void main(String[] args) {
		// Ctrl + D : ���ٻ���
		// 1) �ֻ����� ������ ������ ��쿡 ���� ����� �ϴ� ���α׷�
//		System.out.println("�ֻ����� ���ڴ�? : ");
		System.out.println("������ �Է��ϼ��� : ");
		Scanner sc = new Scanner(System.in);
//		int aa = sc.nextInt();
//
//		
//		switch (aa) {
//		case 1: System.out.println("1�� ����"); break;
//		case 2: System.out.println("2�� ����"); break;
//		case 3: System.out.println("3�� ����"); break;
//		case 4: System.out.println("4�� ����"); break;
//		case 5: System.out.println("5�� ����"); break;
//		case 6: System.out.println("6�� ����"); break;
//		}
//		System.out.println("End!");
		
		// 2) �Է¹��� ���ڿ��� ���� �ٸ� ���� ����Ѵٰ� ����

		String fa = sc.nextLine();
		
		switch(fa) {
		case "m" :
		case "ma" : System.out.println("����"); break;
		case "f" :
		case "fa" : System.out.println("�Ĵ�"); break;
		case "s":
		case "si" : System.out.println("����"); break;
		case "me" : System.out.println("��"); break;
		case "y" :
		case "you" : System.out.println("��"); break;
		default : System.out.println("����?");
		}
		
		System.out.println("End!");

	}

}
