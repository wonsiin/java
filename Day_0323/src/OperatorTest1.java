
public class OperatorTest1 {
	public static void main(String[] args) {
		//���� ����, �ʱ�ȭ
		//181.5Ű, 72.9 ������
		double height = 181.5;
		double weight = 72.9;
		//double bmi;
		//���
		System.out.println(height/100 + "m");
		System.out.println(weight + "kg");
		System.out.println("���� Ű�� "+height+"m �̰�, ������� "+weight+"kg �Դϴ�.");
		//cm = m��
		//���� 1���� m�� ȯ�� data�� �̿��ؼ� ü���� ������ ���� ����Ͻÿ�. bmi = ������(kg)�� Ű(m)�� �������� ������
		// height = height * 0.01;
		// bmi = weight / (height * height)
		double a = height / 100;
		double b = a * a;
		double c = weight / b;
		System.out.println("Ű�� �������� "+b +" bmi���� " + c+" �Դϴ�.");
		
		
		

		
	}
}
