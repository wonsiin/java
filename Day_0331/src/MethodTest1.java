

public class MethodTest1 {

	public static void main(String[] args) {
		int result;
		System.out.println("main() 시작");
		add1();
		
		result = add2();
		
		int a =5,b =9;
		add3(a,b);				// 아규먼트(argument) 호출 하는쪽
		System.out.println(add3(2,5));
		
		System.out.println("result = " + result);
		System.out.println("result = " + add2());
		System.out.println("main() 끝");
	}
	
	public static void add1() {
		int num1 = 10; //지역변수
		int num2 = 20;
		
		int result = num1 + num2;
		System.out.println("결과는 = " + result);
		
		return;
		
	}
	public static int add2() {
		int num1 = 11;
		int num2 = 21;
		
		int result = num1 + num2;
		
		return result;
		
	}
	public static int add3(int num1, int num2) {  //매개변수(parameter) 정의하는변수 (전달 임자)
		
		int result = num1+ num2;

		return result;
		
	}

}
