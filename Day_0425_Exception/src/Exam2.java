import java.util.Scanner;

public class Exam2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int temp,tt =0,sum = 0;
		String str;
		
		while(true) {
			try {
				System.out.print("���ڸ� �Է� : ");
				str = sc.next();
				
				temp = Integer.parseInt(str);
				if(tt < 10) {
					sum += temp;
					tt++;
				}
				if(tt == 10) {
					System.out.println("���� = " + sum);
					break;
				}
				
				
				System.out.println("�Է��� ���� :" + temp);
			}catch(Exception e) {
				System.out.println("**�����ʹ� ���ڷ� �Է����ּ���. ������ �Է�.");
				continue; //���α׷��� �������� �ʰ� ��� ����.
			}
		}

	}

}
