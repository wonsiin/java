import java.util.Scanner;

public class MyMenu {

	public static void main(String[] args) {
		int a;
		
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			menu(); //���콺���÷�����[ �ʷ����� ����µ� �װ��� public �� �ǹ� , s�� static�� �ǹ�, void Ÿ���� �ǹ�]
			a = scanner.nextInt();
			if(a < 6) {
				hold(a);
				break;
			}

		}

		
		
		
			
			
		}

	

	/**
	 * ȭ�鿡 �߿��� �޴��� ǥ�����ִ� �޼ҵ�
	 */
	public static void menu() {
		while(true) {
			System.out.println("=====[���� ���α׷�]=====");
			System.out.println("     1. ��   ��");
			System.out.println("     2. ��ü���");
			System.out.println("     3. ��   ȸ");
			System.out.println("     4. ��   ��");
			System.out.println("     5. ��   ��");
			System.out.println("     0. ��   ��");
			System.out.println("======================");
			System.out.print("     ���� > ");
			
		}

	}
	/**
	 * ������ Ű����� �Է��ؼ� �����ϴ� �޼ҵ�
	 */
	public static void input() {
		System.out.println("**�Է��� �����߽��ϴ�.");
	}
	public static void output() {
		System.out.println("**��ü ����� �����߽��ϴ�.");
	}
	public static void hold(int a) {
		switch (a) {
		case 1 : input();break;
		case 2 : output();break;
		case 3 : selectOne();break;
		case 4 : delete();break;
		case 5 : update();break;
		case 0 : ex();return;
		default : System.out.println("err) �޴��� �ٽ� �������ּ���.");
		}
		}
	public static void selectOne() {
		System.out.println("**��ȸ�� �����߽��ϴ�.");
	}
	public static void delete() {
		System.out.println("**������ �����߽��ϴ�.");
	}
	public static void update() {
		System.out.println("**������ �����߽��ϴ�.");
	}
	public static void ex() {
		System.out.println("**���α׷��� �����մϴ�.");
	}
	
	/**  / //**�ϰ� ������ �Է��ϸ� ���콺�� �ø��� ��Ȯ�� ������ �˼��ִ�.
	 * test �޼ҵ�� a�� �ŵ������� ���ϴ� �޼ҵ�
	 * @param a : �ؼ�
	 * @param b	: ����
	 * @return �ŵ������� ���
	 */
	public static int test(int a, int b) {
		return 0;
	}
}