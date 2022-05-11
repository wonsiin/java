import java.util.Scanner;

public class MethodTest4 {

	public static void main(String[] args) {
		int a, cnt = 0;
		boolean result;

		System.out.print("정수 값을 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		
		if(a < 10) {
			System.out.println("10보다 적은 값입니다.");
			return;
		}
		for(int i = 2; i <= a; ++i)	{
			result = isPrimeNumber(i);
			if(result) {
				System.out.print(i + " ");
				++cnt;
				if(cnt % 5 == 0) System.out.println();
			}
		}
		
		System.out.println("\n2 ~" + a + "까지 소수의 개수 : " + cnt);
		
	}

	
	public static boolean isPrimeNumber(int a) { //소수면 true, 아니면 false
			
				for(int i = 2; i <= a; ++i) {
						if(a % i == 0 ) { //소수가 아님을 의미
							return false;
						}else {
							return true;
							}
				}
				return true;
	}
}