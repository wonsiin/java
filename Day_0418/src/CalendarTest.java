import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.concurrent.DelayQueue;

public class CalendarTest {

	public static void main(String[] args) throws InterruptedException {
		Calendar c1 = new GregorianCalendar(); //�����ý������κ��� �ð��� �ҷ���
		Calendar c2 = Calendar.getInstance(); //�� ����� ���� ���.
		
		System.out.println(c1);
		System.out.println(c2);
		
		System.out.println(c1.get(Calendar.HOUR)); //c1.get(Calendar.**)�ϰ� �ҷ����Ѵ�.
		System.out.println("���� : " + c1.get(Calendar.YEAR));
		int a = c1.get(Calendar.MONTH);
		a = a + 1;
		System.out.println("�� : " + a);
//		System.out.println("�� : " + c1.get(Calendar.MONTH));
		System.out.println("�� : " + c1.get(Calendar.DATE));
		System.out.println("�� : " + c1.get(Calendar.HOUR));
		System.out.println("�� : " + c1.get(Calendar.MINUTE));
		System.out.println("�� : " + c1.get(Calendar.SECOND));
		System.out.println("�� : " + c1.get(Calendar.MILLISECOND));
		System.out.println("���� : " + c1.get(Calendar.DAY_OF_WEEK)); //����
		
		int yoil = c1.get(Calendar.DAY_OF_WEEK);
		String sYoil = null;
		switch(yoil) {
		case 1: sYoil = "�Ͽ��� ";break;
		case 2: sYoil = "������ ";break;
		case 3: sYoil = "ȭ���� ";break;
		case 4: sYoil = "������ ";break;
		case 5: sYoil = "����� ";break;
		case 6: sYoil = "�ݿ��� ";break;
		case 7: sYoil = "����� ";break;
		}
		System.out.println(sYoil);
		
		String now = null;
		//ó���� �޾ƿ� ��ü�� �������� �ٽ� �� ��ü�� ���ư� �ð��� ���߰Եȴ�.
//		while(true) {
//			Calendar c3 = Calendar.getInstance();
//			now = c3.get(Calendar.HOUR) + " : ";
//			now += c3.get(Calendar.MINUTE) + " : ";
//			now += c3.get(Calendar.SECOND);
//			System.out.println(now);
//			
//			Thread.sleep(1000);//�и�����
//		}
		//2) String Ư¡
		// - immutable �� �������̴�! (������ �Ҽ� ���� ��ü)
		//String str = "���� ���� ������";
		//StringBuffer sb = new StringBuffer("����");
		
		
		
		
		
		
	}
}
