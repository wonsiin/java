
public class TypeTest {
	public static void main(String[] args) {
		//������ ������ ����� �ʱ�ȭ
		//byte b; //����
		//b = 10; //�ʱ�ȭ
		byte b = 12; //����� �ʱ�ȭ   byte, short �� byte�� �۾Ƶ� ���� ������.(����)
		short s = 34;
		int i = 45;
		long l = 12L;
		
		int age = 29;//�ʱ�ȭ
		age = 34;  //����(assignment) ������Ʈ �Ҷ� ������ ���ߴ� ȸ�� �ʼ�
		
		//int temp = 12L;   ����(�׸�) = ��(�׸����� ũ�� �ȵȴ�)
		long ll = 34;
//		 ���Կ�����( = )
//		 LV = RV
//		 ���� = ��, ����, ����
		int num;
		num = 25;
		num = 25 * 2;
		int val;
		val = num;
		val = num * 4; //��� 200
		val = val / 2; //��� 100
		System.out.println(val);
		//�Ǽ��� ������ ����� �ʱ�ȭ
		//float f = 3.14;   3.14�ڿ� �ƹ� ǥ�� ���ϸ�  double�� �ν��Ͽ� �����߻�
		float f = 3.14F; // F����� float �� �ν�
		double d = 3.14;
		//������ ������ ����� �ʱ�ȭ
		char c1 = 'A';
		char c2 = '��';
		char c3 = 97;
		int a = c1;
		int aa = c2;
		int aaa = a + aa;
//		char c4 = -1; // ���� ���Ұ�
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		//boolean ������ ����� �ʱ�ȭ
		boolean bool = true;
		boolean bool2 = false;
		System.out.println(bool);
		System.out.println(bool2);
//		System.out.println(a + "+", aa , "=");
	}
}
