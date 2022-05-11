import java.util.Scanner;

public class MethodTest3 {

	public static void main(String[] args) {
		int a;

		System.out.print("정수 값을 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		isPrimeNumber(a);
		
//		boolean result = isPrimeNumber(a);
//		if(result) System.out.println(a + "는 소수입니다.");
//		else System.out.println(a + "는 소수가 아닙니다.");
//		
	}
	
	public static boolean isPrimeNumber(int a) { //소수면 true, 아니면 false
		
		for(int i = 2; i <= a; ++i) {
			if(a % i == 0) { //소수가 아님을 의미
				System.out.println(a + "은(는) 소수가 아닙니다.");
				return false;
			}else {
				System.out.println(a + "은(는) 소수입니다.");
				return true;
			}
		}
//		for(int i = 2; i < a; ++i) {
//			if(a % i == 0) return false; //나눌때 소수가 아님
//		}
//		
		return true;
	}

}
