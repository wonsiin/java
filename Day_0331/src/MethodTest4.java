import java.util.Scanner;

public class MethodTest4 {

	public static void main(String[] args) {
		int a, cnt = 0;
		boolean result;

		System.out.print("���� ���� �Է��ϼ��� : ");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		
		if(a < 10) {
			System.out.println("10���� ���� ���Դϴ�.");
			return;
		}
		for(int i = 2; i <= a; ++i)	{
			result = isPrimeNumber(i);
			if(result) {
				System.out.print(i + " ");
				++cnt;
				if(cnt % 5 == 0) System.out.println();
			}
		}
		
		System.out.println("\n2 ~" + a + "���� �Ҽ��� ���� : " + cnt);
		
	}

	
	public static boolean isPrimeNumber(int a) { //�Ҽ��� true, �ƴϸ� false
			
				for(int i = 2; i <= a; ++i) {
						if(a % i == 0 ) { //�Ҽ��� �ƴ��� �ǹ�
							return false;
						}else {
							return true;
							}
				}
				return true;
	}
}