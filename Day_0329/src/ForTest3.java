import java.util.Scanner;

public class ForTest3 {

	public static void main(String[] args) {
		int a,b,c=2, i = 2;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수값을 입력하세요 : ");
		b = scanner.nextInt();
		
		for(i = 2; i < b; ++i) {
			if(b % i == 0) { //소수가 아님을 의미
				System.out.println(b + "는 소수가 아닙니다.");
				return;
			}
		}
		
		System.out.println(b + "는 소수입니다.");

//			if(i % b == 0) {
//				System.out.printf("%d ",i);
//			}else if(i % b != 0) {
//				for(i=2;i < b;++i) {
//					System.out.printf("%d ",i);
//				}
//			}
// [연습] 정수를 입력받고 소수인지를 판별하세요.			

	}

}
