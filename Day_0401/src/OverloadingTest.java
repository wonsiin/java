
public class OverloadingTest {

	public static void main(String[] args) {
		int a = 10, b = 20;
		double d1 = 22.5, d2 = 36.7;
		String s1 = "Hello", s2 = "World";
		
		add(a,b);  //int���� ������ double ���� ��ġ�Ƿ� �Ҽ����� ��µ�
		add(d1,d2); //double���� ������ ���� ���� ���� �����߻�
		add(s1,s2);
		add();
		
		
		

	}
	//�޼ҵ� �����ε�(Method Overloading)
	//�Ű������� Ÿ���� �ٸ��ų�, ������ �ٸ��� �޼ҵ��� �̸��� ���Ƶ� �ٸ� �޼ҵ�� ���
	public static void add(int a, int b) {
		System.out.println(a + b);
	}
	public static void add(double d1,double d2) { //double a = 10;
		System.out.println(d1 + d2);
	}
	public static void add(String s1,String s2) {
		System.out.println(s1 + s2);
	}
	public static void add() {
		System.out.println("add()�޼ҵ� �Դϴ�.");
	}


}
