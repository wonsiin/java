import java.awt.print.Printable;
import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

public class MyTest {
	public static void main(String[] args) {
		MyPoint mp = new MyPoint();
		MyCircle c1 = new MyCircle();
		double[] su = new double[5];
		Scanner sc = new Scanner(System.in);
		int aaa;
		String aa;
		int count =0;
		
		
		
		while(true) {
			pintt();
			System.out.println("어느값을 원하나요 : ");
			aaa = sc.nextInt();
			if(aaa == 1) {
				for(int i = 0; i < su.length; ++i) {
					System.out.println("Radius 값을 적어주세요 : ");
					double radius = sc.nextDouble();
					c1.setRadius(radius);
					c1.output(c1);
					for(int j = 0; j < su.length; ++j) {
						su[i] = radius;
						count++;
						break;
					}
					System.out.println(count);
				}
				
			}else if(aaa == 2) {
				
			}else if(aaa == 3) {
				
			}else if(aaa == 4) {
				System.out.println("종료 하시겟습니까? : ");
				aa = sc.next();
				if(aa == "y") {
					return;
				}else {
					System.out.println("취소하였습니다.");
				}
			}
		}
		
//		else if(mp instanceof MyTriangle) {
//			
//		}else if(mp instanceof MyPoint) {
//			
//		}
		
//		System.out.println();
		
	}
	private static void pintt() {
		System.out.println("*********************************************");
		System.out.println("******1. 원 , 2. 삼각형, 3. 전체출력 , 4. 종료******");
		System.out.println("**********************************************");
	}
	
}

