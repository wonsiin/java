import java.util.Scanner;

public class MethodTest3 {

	public static void main(String[] args) {
		int a;

		System.out.print("���� ���� �Է��ϼ��� : ");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		isPrimeNumber(a);
		
//		boolean result = isPrimeNumber(a);
//		if(result) System.out.println(a + "�� �Ҽ��Դϴ�.");
//		else System.out.println(a + "�� �Ҽ��� �ƴմϴ�.");
//		
	}
	
	public static boolean isPrimeNumber(int a) { //�Ҽ��� true, �ƴϸ� false
		
		for(int i = 2; i <= a; ++i) {
			if(a % i == 0) { //�Ҽ��� �ƴ��� �ǹ�
				System.out.println(a + "��(��) �Ҽ��� �ƴմϴ�.");
				return false;
			}else {
				System.out.println(a + "��(��) �Ҽ��Դϴ�.");
				return true;
			}
		}
//		for(int i = 2; i < a; ++i) {
//			if(a % i == 0) return false; //������ �Ҽ��� �ƴ�
//		}
//		
		return true;
	}

}
