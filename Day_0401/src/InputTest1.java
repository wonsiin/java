import java.util.Scanner;

public class InputTest1 {

	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		
		String name;
		int age;
		
		
		System.out.println("�̸� : ");
		name = keyin.next(); //next()�ϳ��� �ܾ �Է°���
		
		keyin.nextLine();
		
		System.out.println("���� : ");
		age = keyin.nextInt();
		
		System.out.printf("����� �̸��� : %s%n���� : %d",name,age);
		
		
	}

}
/*
	next() : �ϳ��� ���ڿ��ܾ �Է� �޴´�. WS(ȭ��Ʈ�����̽�)(space, tab, enter)
	nextLine() : ������ �Է¹޴´�. ���͸� ģ ��ġ���� �ϳ��� �������� �ν�.
				stdin�� ���� ��Ȱ�� ����.
*/