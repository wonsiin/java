import java.util.*;


public class IncTest1 {

	public static void main(String[] args) {
		int fee = 35000;
		int discount;
		int d;
		// 1증가 시키기 --------------------------
//		int a = 1;
//		int b = 3;
//			a = a + 1;  // ++a;
//			a += 1;     // += 에서 +가 무조건 앞으로
//		a += b;
//		System.out.println(a);
		//--------------------------------------
		System.out.println("나이를 입력하세요 : ");
		Scanner s = new Scanner(System.in);
		int nai = s.nextInt();
		int c = nai;
		
		d = (c < 7 || c >= 65) ? (int)(fee * 0.9) : fee;
		
		
		System.out.println(d);
		
		

	}

}
