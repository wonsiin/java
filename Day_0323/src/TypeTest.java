
public class TypeTest {
	public static void main(String[] args) {
		//정수형 변수의 선언과 초기화
		//byte b; //선언
		//b = 10; //초기화
		byte b = 12; //선언과 초기화   byte, short 는 byte가 작아도 값이 들어가진다.(예외)
		short s = 34;
		int i = 45;
		long l = 12L;
		
		int age = 29;//초기화
		age = 34;  //대입(assignment) 프로젝트 할때 변수명 맞추는 회의 필수
		
		//int temp = 12L;   변수(그릇) = 값(그릇보다 크면 안된다)
		long ll = 34;
//		 대입연산자( = )
//		 LV = RV
//		 변수 = 값, 수식, 변수
		int num;
		num = 25;
		num = 25 * 2;
		int val;
		val = num;
		val = num * 4; //결과 200
		val = val / 2; //결과 100
		System.out.println(val);
		//실수형 변수의 선언과 초기화
		//float f = 3.14;   3.14뒤에 아무 표기 안하면  double로 인식하여 오류발생
		float f = 3.14F; // F적어야 float 로 인식
		double d = 3.14;
		//문자형 변수의 선언과 초기화
		char c1 = 'A';
		char c2 = '강';
		char c3 = 97;
		int a = c1;
		int aa = c2;
		int aaa = a + aa;
//		char c4 = -1; // 음수 사용불가
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		//boolean 변수의 선언과 초기화
		boolean bool = true;
		boolean bool2 = false;
		System.out.println(bool);
		System.out.println(bool2);
//		System.out.println(a + "+", aa , "=");
	}
}
