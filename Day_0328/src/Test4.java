import java.util.Scanner;

//���� �Է¹޾� 1�� ���� 9�ܱ��� ����� �Է¹��� ���� �߰����� ������ 9�ܱ����� ������ �ϴ� ����
public class Test4 {

	public static void main(String[] args) {
		int ba = 0, a;
		int da;
		
		
		System.out.println("���� �Է��ϼ��� : ");
		Scanner sc = new Scanner(System.in);
		ba = sc.nextInt();
		da = ba;
		
		
		if (ba <= 9) {
			while (da <= 9) {
				int k = 0;
				System.out.printf("%d���� ������ �Դϴ�.%n",da);
				
				while (k < 9) {
					++k;
					System.out.printf("%d * %d = %d%n",da,k,da * k);
				}
				++da;
			}
			
			
		} else {
			System.out.println("9�� �̻��� ã���Ǽ� �����ϴ�.");
		}
		
	}

	public static void aa(int i) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
	}
	
}
