import java.util.*;

public class Test1 {

	public static void main(String[] args) {
		
		int max,min;
		
		System.out.println("�� 1�� �Է��ϼ��� : ");
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		System.out.println("�� 2�� �Է��ϼ��� : ");
		Scanner sc1 = new Scanner(System.in);
		int y = sc1.nextInt();
		
		if(t > y) {
			max = t;
			min = y;
		} else {
			max = y;
			min = t;
		}
		
		System.out.println("ū���� : " + max + "�������� : " + min);

	}

}
