
public class OperatorTest2 {
	public static void main(String[] args) {
		//�� �л��� �������� ������ ������ ������ �����ϰ� ���� 80, 85, 90 ������ �ʱ�ȭ �հ�� ����� ���ϴ� ���α׷� �ۼ�
		int gu = 80;
		int eng = 86;
		int su = 90;
		int hap = gu+eng+su;
		double pu = hap / 3; //int/int = int (int/double = double/double= double)
//		double pu = hap / 3.0; //��� double�� �ٲ㼭 ����Ͽ� �Ҽ����� ��µ�
		System.out.println("�հ�� "+ hap +"��, ��հ��� "+ pu +"�� �Դϴ�.");
		
	}
}
