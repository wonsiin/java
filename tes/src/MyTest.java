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
			System.out.println("������� ���ϳ��� : ");
			aaa = sc.nextInt();
			if(aaa == 1) {
				for(int i = 0; i < su.length; ++i) {
					System.out.println("Radius ���� �����ּ��� : ");
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
				System.out.println("���� �Ͻðٽ��ϱ�? : ");
				aa = sc.next();
				if(aa == "y") {
					return;
				}else {
					System.out.println("����Ͽ����ϴ�.");
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
		System.out.println("******1. �� , 2. �ﰢ��, 3. ��ü��� , 4. ����******");
		System.out.println("**********************************************");
	}
	
}

