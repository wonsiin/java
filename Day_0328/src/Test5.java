import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		int a =0 , b = 0, c =1;
		
		System.out.println("���� �Է��� �ּ��� : ");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		
		if(a <= 10) {
			while (b < a) {
				c = c * 2;
				b++;
			}
			System.out.printf("%d�� �������� %d�Դϴ�",a,c);
		}else {
			System.out.println("10���� Ů�ϴ�.");
		}
		
	}

}
