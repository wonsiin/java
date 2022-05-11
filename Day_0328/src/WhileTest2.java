//반복문 이용하여 구구단 출력
public class WhileTest2 {

	public static void main(String[] args) {
		int a = 5,x = 1;
		
		while(x < 10) {
//			System.out.println("5 * " + x + " = " + a * x);
			System.out.printf("%d * %d = %d%n",a,x,(a*x));
			++x;
		}
		
	}

}
