
public class ModulusTest1 {

	public static void main(String[] args) {
		int a = 5, b = 2;
		double c = 5.2, d = 3;
		
		System.out.println(a / b);
		System.out.println(a % b);
		System.out.println(c / d);
		System.out.println(c % d);
		
		//------------------------
		boolean bool = a > 10;
		System.out.println(bool);
		
		bool = (b <= 2);
		System.out.println(bool);
		
		// ===== ���ǿ�����
		
		int age;
		age = 19;
		String message = (age >= 19) ? age + "���� ���Ÿ� �� �� �ֽ��ϴ�." 
									 : age + "���� ���Ÿ� �� �� �����ϴ�.";
		System.out.println(message);
	}

}
