import java.util.Scanner;

public class ForTest3 {

	public static void main(String[] args) {
		int a,b,c=2, i = 2;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("�������� �Է��ϼ��� : ");
		b = scanner.nextInt();
		
		for(i = 2; i < b; ++i) {
			if(b % i == 0) { //�Ҽ��� �ƴ��� �ǹ�
				System.out.println(b + "�� �Ҽ��� �ƴմϴ�.");
				return;
			}
		}
		
		System.out.println(b + "�� �Ҽ��Դϴ�.");

//			if(i % b == 0) {
//				System.out.printf("%d ",i);
//			}else if(i % b != 0) {
//				for(i=2;i < b;++i) {
//					System.out.printf("%d ",i);
//				}
//			}
// [����] ������ �Է¹ް� �Ҽ������� �Ǻ��ϼ���.			

	}

}
