
public class OverloadingTest {

	public static void main(String[] args) {
		int a = 10, b = 20;
		double d1 = 22.5, d2 = 36.7;
		String s1 = "Hello", s2 = "World";
		
		add(a,b);  //int값이 없으면 double 형을 거치므로 소수점이 출력됨
		add(d1,d2); //double형이 없으면 담을 곳이 없어 오류발생
		add(s1,s2);
		add();
		
		
		

	}
	//메소드 오버로딩(Method Overloading)
	//매개변수의 타입이 다르거나, 개수가 다르면 메소드의 이름이 같아도 다른 메소드로 취급
	public static void add(int a, int b) {
		System.out.println(a + b);
	}
	public static void add(double d1,double d2) { //double a = 10;
		System.out.println(d1 + d2);
	}
	public static void add(String s1,String s2) {
		System.out.println(s1 + s2);
	}
	public static void add() {
		System.out.println("add()메소드 입니다.");
	}


}
