import java.util.Scanner;

public class Exam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int temp,i =0,sum = 0;
		
		while(true) {
			try {
				System.out.print((i+1) + " ȸ : ");
				temp = sc.nextInt();						//������ �����Ͱ� �����־ ���ѷ��� ����.
				sum += temp;
				System.out.println("������� ���� = " + sum);
				++i;
				if(i >= 10) break;
			
			}catch(Exception e) {
				System.out.println("**�����ʹ� ���ڷ� �Է����ּ���. ������ �Է�.");
				sc.nextLine();
				continue; //���α׷��� �������� �ʰ� ��� ����.
			}
		}

	}

}
