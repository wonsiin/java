
public class StaticTest {

	public static void main(String[] args) {
		int radius = 6;
		double area;
		
		System.out.println(Math.PI);
		System.out.println(Math.E);
		
//		Math m1 = new Mata(); �����Ҽ� ���� �޼ҵ�(������ public�̶� ��밡��) ���� �����ؼ� ������� �ʴ´�.
		area = radius * radius * Math.PI;
		System.out.println("���� ���� : " + area);

	}

}
