package example;

public class CallTest {

	public static void main(String[] args) {
		int a = 10, b = 20;
		int[] ary = {10,20};
		
		System.out.println("��ȯ�ϱ� �� : a =" + a + " , b = " + b);
		
		exchange(a, b);	//Call by Value ������ �����Ҽ� ����.
		System.out.println("��ȯ�ϱ� �� : a =" + a + " , b = " + b);
		
		System.out.println("�迭��ȯ�ϱ� �� : ary[0] =" + ary[0] + " , ary[1] = " + ary[1]);
		
		exchange(ary);	// Call by Reference �����°��� �������̿��� "������ �����Ҽ� �ִ�".
		System.out.println("�迭��ȯ�ϱ� �� : ary[0] =" + ary[0] + " , ary[1] = " + ary[1]);
	}
	public static void exchange(int a, int b) {
		int c;
		c = a;
		a = b;
		b = c;
	}
	public static void exchange(int[] ary) {
		int c;
		c = ary[0];
		ary[0] = ary[1];
		ary[1] = c;
	}


}
