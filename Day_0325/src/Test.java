import java.util.*;

public class Test {

	public static void main(String[] args) {
		
		double bmi;
		
		System.out.println("Ű���� �Է��ϼ��� : ");
		Scanner k = new Scanner(System.in);
		int kk = k.nextInt();
		double ki = kk *0.01;
		ki = Math.round(ki*100)/100.0;
		
		
		System.out.println("�����谪�� �Է��ϼ��� : ");
		Scanner mo = new Scanner(System.in);
		int mmo = mo.nextInt();
		double kaka = (ki * ki);
		bmi = mmo / kaka;
		bmi = Math.round(bmi*100)/100.0;
		
		if(bmi >= 35) {
			System.out.printf("������ ���� Ű�� %sm ������� %skg �̹Ƿ� %s���̹Ƿ� ���� �Դϴ�.",ki,mmo,bmi);
		} else if(bmi >= 30) {
			System.out.printf("������ ���� Ű�� %sm ������� %skg �̹Ƿ� %s���̹Ƿ� �ߵ��� �Դϴ�.",ki,mmo,bmi);
		} else if(bmi >= 25) {
			System.out.printf("������ ���� Ű�� %sm ������� %skg �̹Ƿ� %s���̹Ƿ� �浵�� �Դϴ�.",ki,mmo,bmi);
		} else if(bmi >= 23) {
			System.out.printf("������ ���� Ű�� %sm ������� %skg �̹Ƿ� %s���̹Ƿ� ��ü�� �Դϴ�.",ki,mmo,bmi);
		} else if(bmi >= 18.5) {
			System.out.printf("������ ���� Ű�� %sm ������� %skg �̹Ƿ� %s���̹Ƿ� ���� �Դϴ�.",ki,mmo,bmi);
		} else {
			System.out.printf("������ ���� Ű�� %sm ������� %skg �̹Ƿ� %s���̹Ƿ� ��ü�� �Դϴ�.",ki,mmo,bmi);
		}
		
		
	}

}
