import java.util.Scanner;

public class BMIExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double he , we , bmi ; //8���� �����ڷ����� 0 false, ' '
		String re = null;				// �����ڷ��� : �ƹ��͵� �����ϰ� ���� ���� (String re = null;)
		
		// Ű����� �����͸� �Է¹���.
		System.out.println("Ű�� �Է��ϼ���(cm) : ");
		he = scanner.nextDouble();
		
		System.out.println("�����踦 �Է��ϼ���(kg) : ");
		we = scanner.nextDouble();
		
		//Ű�� m�� ȯ��
		he = he * 0.01; // he = he / 100;
		bmi = we / (he * he);
		
		
		/* if(bmi >= 35){
				result = "����";
			} else if(bmi >= 30) {
				result = "�ߵ���";
			} else if(bmi >= 25) {
				result = "�浵��";
			} else if(bmi >= 23) {
				result = "����";
			} else if(bmi >= 18.5) {
				result = "��ü��";
			} */
								
		
		if(bmi >= 35) {
//			System.out.printf("������ ���� Ű�� " + we+ "m ������� " + we + "kg �̹Ƿ� bmi�� " + bmi + " ���� �Դϴ�.");
			re = "���� �Դϴ�.";
		} else if(bmi >= 30) {
//			System.out.printf("������ ���� Ű�� " + we+ "m ������� " + we + "kg �̹Ƿ� bmi�� " + bmi + " �ߵ��� �Դϴ�.");
			re = "�ߵ��� �Դϴ�.";
		} else if(bmi >= 25) {
//			System.out.printf("������ ���� Ű�� " + we+ "m ������� " + we + "kg �̹Ƿ� bmi�� " + bmi + " �浵�� �Դϴ�.");
			re = "�浵�� �Դϴ�.";
		} else if(bmi >= 23) {
//			System.out.printf("������ ���� Ű�� " + we+ "m ������� " + we + "kg �̹Ƿ� bmi�� " + bmi + " ��ü�� �Դϴ�.");
			re = "��ü�� �Դϴ�.";
		} else if(bmi >= 18.5) {
//			System.out.printf("������ ���� Ű�� " + we+ "m ������� " + we + "kg �̹Ƿ� bmi�� " + bmi + " ���� �Դϴ�.");
			re = "���� �Դϴ�.";
		} else if (bmi < 18.5){
//			System.out.printf("������ ���� Ű�� " + we+ "m ������� " + we + "kg �̹Ƿ� bmi�� " + bmi + " ��ü�� �Դϴ�.");
			re = "��ü�� �Դϴ�.";
		}
//		else {
//			System.out.printf("������ ���� Ű�� " + we+ "m ������� " + we + "kg �̹Ƿ� bmi�� " + bmi + " ��ü�� �Դϴ�.");
//			re = "��ü�� �Դϴ�.";
//		} ���ʿ��� ���� ó���ϱ⺸�� else�� Ȱ������.
		System.out.println(he + ", " + we + ", " + bmi + ", " + re); 
//		System.out.println(he + ", " + we + ", " + bmi + ", " + re); 
		System.out.printf("Ű : %.2fm%n������ : %.0fKg%nBMI : %.2f%n��� : %s",he,we,bmi,re); 
		//% �� , ���� ���� �����Ͷ� f : ������ �����͸� �÷������� �޾Ƽ� �����´�. %.2f : �Ҽ���2�ڸ��� �÷������� ���
		//%s = ���ڿ��� �����ö� ���.
	}
		// 1) result�� �ʱ�ȭ
		// 2) if���� ����
}
