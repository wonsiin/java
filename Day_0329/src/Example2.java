import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		int end,sta,i = 0;
		
		System.out.print("���۰��� �Է��� �ּ��� : ");
		Scanner sc1 = new Scanner(System.in);
		sta = sc1.nextInt();
		
		System.out.print("�������� �Է��� �ּ��� : ");
		Scanner sc = new Scanner(System.in);
		end = sc.nextInt();
		
		if (sta <= end) {
			while (i < end) {
				i = sta;
				System.out.printf("%d ",i);
				++sta;
			}
		}else {
			System.out.println("���۰��� �������� �۰ų� ������ �Է����ּ���.");
			return; //��ȯ �� �����ϴ�.(���α׷� ���� ������ ����)
		}
		System.out.printf("%n");
		
	}

}
/*
<����> ������ �Է� : 5
1 2 3 4 5

*/