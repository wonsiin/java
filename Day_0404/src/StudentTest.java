import java.util.Scanner;

public class StudentTest {
	public static void main(String[] args) {
		StudentVO s1 = new StudentVO(); //<�����ڸ� �̿��ؼ�> ��ü�� �޸𸮿� �ε��ϴ� ���(�������)
		// s1 = ��������       <������> : Constructor
		// �����ڰ� �����ڸ� �������� ������ --> JVM�� �����ڸ� ������ش�.
		
		s1.setId("123");
		s1.setName("ȫ�浿");
		s1.setJavaLang(89);
		s1.setCLang(88);
		
//		s1.id = "123";		//��������
//		s1.name = "ȫ�浿";
//		s1.javaLang = 89;
//		s1.cLang = 88;
		s1.output();
		StudentVO s2 = new StudentVO();
		s2.output();
		
		StudentVO s3 = new StudentVO("456","�տ���",77.5,86.7);
		s3.output();
//		s2.id = "234";
//		s2.name = "���Ȱ�";
//		s2.javaLang = 99;
//		s2.cLang = 80;
		//���� �����ڰ� ���� �Ȱ��� �Ķ��� ����
//		System.out.println(s1); // ���������� �״�� �ҷ����� �� �ּҰ��� �ҷ���
//		Scanner sc = new Scanner(System.in);
//		sc.next();
//		
		System.out.println(s1.getId() + " : " + s1.getName() + " , " + s1.getJavaLang() + " , " + s1.getCLang());
//		System.out.println(s2.id + " : " + s2.name + " , " + s2.javaLang + " , " + s2.cLang);
		System.out.println(s3.getId() + " : " + s3.getName() + " , " + s3.getJavaLang() + " , " + s3.getCLang());
		
	}
}
