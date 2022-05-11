
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
		
		// ===== 조건연산자
		
		int age;
		age = 19;
		String message = (age >= 19) ? age + "세는 선거를 할 수 있습니다." 
									 : age + "세는 선거를 할 수 없습니다.";
		System.out.println(message);
	}

}
