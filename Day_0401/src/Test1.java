import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		int i =0;
		System.out.println("두둥 : ");
		Scanner sc = new Scanner(System.in);
		int b = sc.nextInt();
		
		for(i=2; i <= b;++i) {
			if(divisor(b, i) == -1) continue;
				System.out.print(i + " ");
			
		}
		System.out.println();
		
//		if(i % b == 0) {
//			for(i=2; i <= b;++i) {
//			
//						for(int j =i; j <= i; ++j) {
//							System.out.print(j + " ");
//				
//					}
//					}
//						b = -1;
//					}else {
//				}
//		System.out.print(b);
//		
//		
//
	}
	
	public static int divisor(int b, int i) {
		if(b % i == 0) return i;
		return -1; //else return -1; 로 앞에 else를 붙이면 오류다. 값이 없다고 판단.
	}

}
