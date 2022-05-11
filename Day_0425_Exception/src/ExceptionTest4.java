import java.util.Scanner;

public class ExceptionTest4 {

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);

		int a, b;
		System.out.print("a�� ������ �Է� : ");
		a = sc.nextInt();
		System.out.print("b�� ������ �Է� : ");
		b = sc.nextInt();
		try {
			int result = methodA(a , b); //Catched Exception
			System.out.println("��� : " + result);
		}catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace(); //������ ��Ȯ�ϰ� �˷��� �̰� �� ����.
		}
	}
	public static int methodA(int a ,int b) throws Exception{ // �޼ҵ� �ñ״��� �� �������� ����������Ѵ�.
		if(a <= b) {
			throw new Exception("ù��° ���� �ι�° ������ Ŀ���մϴ�."); //��ü����
		}
		return a - b;
	}
}
