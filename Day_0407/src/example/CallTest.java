package example;

public class CallTest {

	public static void main(String[] args) {
		int a = 10, b = 20;
		int[] ary = {10,20};
		
		System.out.println("교환하기 전 : a =" + a + " , b = " + b);
		
		exchange(a, b);	//Call by Value 원본에 접근할수 없다.
		System.out.println("교환하기 후 : a =" + a + " , b = " + b);
		
		System.out.println("배열교환하기 전 : ary[0] =" + ary[0] + " , ary[1] = " + ary[1]);
		
		exchange(ary);	// Call by Reference 보내는값이 참조값이여야 "원본에 접근할수 있다".
		System.out.println("배열교환하기 후 : ary[0] =" + ary[0] + " , ary[1] = " + ary[1]);
	}
	public static void exchange(int a, int b) {
		int c;
		c = a;
		a = b;
		b = c;
	}
	public static void exchange(int[] ary) {
		int c;
		c = ary[0];
		ary[0] = ary[1];
		ary[1] = c;
	}


}
