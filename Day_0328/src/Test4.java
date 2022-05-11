import java.util.Scanner;

//단을 입력받아 1단 부터 9단까지 계산중 입력받은 값중 중간값을 받을시 9단까지는 나오게 하는 문제
public class Test4 {

	public static void main(String[] args) {
		int ba = 0, a;
		int da;
		
		
		System.out.println("단을 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		ba = sc.nextInt();
		da = ba;
		
		
		if (ba <= 9) {
			while (da <= 9) {
				int k = 0;
				System.out.printf("%d단의 구구단 입니다.%n",da);
				
				while (k < 9) {
					++k;
					System.out.printf("%d * %d = %d%n",da,k,da * k);
				}
				++da;
			}
			
			
		} else {
			System.out.println("9단 이상은 찾으실수 없습니다.");
		}
		
	}

	public static void aa(int i) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
	}
	
}
