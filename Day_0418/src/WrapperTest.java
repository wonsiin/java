
public class WrapperTest {

	public static void main(String[] args) {
		
		String score = "ȫ�浿 100 98.5 78.8";
		String[] s = score.split(" "); //"ȫ�浿""100""98.5""78.8"
		System.out.println(s[0]);
		double kor = Double.parseDouble(s[1]);
		double eng = Double.parseDouble(s[2]);
		double mat = Double.parseDouble(s[3]);
		double total = kor + eng + mat;
		double avg = total / 3.0;
		System.out.println(total + " " + avg);
		
		
		
//		String score = "ȫ�浿 100 98.5 78.8";
//		String[] s = score.split(" "); //"ȫ�浿""100""98.5""78.8"
//		System.out.println(s[0]);
//		int kor = Integer.parseInt(s[1]);
//		int eng = Integer.parseInt(s[2]);
//		int mat = Integer.parseInt(s[3]);
//		int total = kor + eng + mat;
//		double avg = total / 3.0;
//		System.out.println(total + " " + avg);
		//Calendar			��¥ ���� 3����
		//GredorianCalendar
		//Date
		//abstract �߻�Ŭ���� �̹Ƿ� �� ���� �����͵��� ��ü�����̺Ұ��ϴ�
		
		
		
//		System.out.println(Integer.BYTES);
//		System.out.println(Integer.SIZE);
//		System.out.println(Integer.MIN_VALUE);
//		System.out.println(Integer.MAX_VALUE);
//		
//		Integer i1 = new Integer(10);
//		Integer i2 = new Integer("12"); //�̷������� ������� ���ƶ�
//		Integer i3 = 24;	//�̷��� ���
//		Integer i4 = 34;
//		
//		System.out.println(i3 + i4);
//		
//		String str = "12345"; //������ �ٲٷ���? �����м��� ���ؼ� ����
//		//(Integer)str �� �θ��ڽ� ���迡���� ����� �����ϴ�.
//		Integer ivalue =  Integer.parseInt(str);	// String�� ������ ���� ���� �޴´�.
		
		
		//Wrapper Ŭ����
		// ���� �ڷ���
//		byte short int long
//		char
//		float double
//		
//		boolean
//		Byte Short Integer Long
//		Character
//		Float Double
//		Boolean
//		- ���
//		autu boxing : primitive Ÿ���� �����Ͱ� �ڵ����� ��üȭ
//		auto unboxing : ��üȭ�� �����Ͱ� ���� �� �ڵ����� primitive�� ��ȯ
		
		
		
		
	}

}
