import java.util.Scanner;

public class WhileTest3 {

	public static void main(String[] args) {
		int j, i = 0; //i = while ���� ����, j �� ���� �Է�
		int result = 1;
		
		System.out.println("������ �Է�(1 ~ 10) : ");
		Scanner sc = new Scanner(System.in);
		j = sc.nextInt();  //3
		
//		
//		if (j > 10) {
//			System.out.println("10���� Ů�ϴ�.");
//		}
		//�����Է� 1)

		while (i < j) { //0 < 3 , 1 < 3 , 2 < 3
			result = result * 2; // 1* 2 * 2 * 2
			++i;
			
		}
		//������
		System.out.printf("2�� %d���� ���� : %d",j,result);

	}

}
