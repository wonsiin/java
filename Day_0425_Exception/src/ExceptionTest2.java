import java.util.Scanner;

public class ExceptionTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int temp;
		String str;
		
		while(true) {
			try {
				System.out.print("���ڸ� �Է� : ");
				str = sc.next();
				
				temp = Integer.parseInt(str);
				System.out.println("�Է��� ���� :" + temp);
			}catch(Exception e) {
				System.out.println("**�����ʹ� ���ڷ� �Է����ּ���. ������ �Է�.");
				continue; //���α׷��� �������� �ʰ� ��� ����.
			}
		}

	}

}
