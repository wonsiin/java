import java.util.Scanner;

public class MethodTest2 {
	public static void main(String args) {
		int a,s;
		int v,b,n;
		double m;
		
		System.out.println("1번째 입력값 : ");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		
		System.out.println("2번째 입력값 : ");
		Scanner sc1 = new Scanner(System.in);
		s = sc1.nextInt();
		
		v = add(a,s);
		b = substract(a,s);
		n = cmultiply(a,s);
		m = divide(a,s);
		
		
		System.out.println(v + "%n " + b + "%n " + n + "%n " + m + "%n ");
		
	}
	
	public static int add(int a, int b) {
			int re = a + b;
			System.out.println(a + b);
			return re;
		}
	
	public static int substract(int a, int b) {
		int re = a - b;
		System.out.println(a - b);
		return re;
	}
	
	public static int cmultiply(int a, int b) {
		int re = a * b;
		System.out.println(a * b);
		return re;
	}
	
	public static double divide(int a, int b) {
		int re = a / b;
		System.out.println(a / b);
		return re;
	}
}
/*
	4종류 메소드
	
*/