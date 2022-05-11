import java.awt.Choice;
import java.awt.print.Printable;
import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

public class MyTest {
	public static void main(String[] args) {
		MyCircle c1 = new MyCircle();
		double[] su = new double[5];
		Scanner sc = new Scanner(System.in);
		String aa;
		
		MyPoint[] p = new MyPoint[3];
		int count = 0,x,y,aaa;
		double radius, width, height;
		
		
		while(true) {
			pintt();
			System.out.println("어느값을 원하나요 : ");
			aa = sc.next();
			if(count >= p.length && (aa.equals("1") || (aa.equals("2")))) {
				System.out.println("더이상 입력할수 없습니다.");
				continue;
			}
				
			switch(aa){
				case"1" :
				{
			
				System.out.println("x : "); x = sc.nextInt();
				System.out.println("y : "); y = sc.nextInt();
				System.out.println("radius : "); radius = sc.nextInt();
				
				MyCircle c = new MyCircle(radius);
				c.setX(x);c.setY(y);
				break;
				}
				case"2" :
				{
					System.out.println("x : "); x = sc.nextInt();
					System.out.println("y : "); y = sc.nextInt();
					System.out.println("width : "); width = sc.nextInt();
					System.out.println("height : "); height = sc.nextInt();
					
					MyTriangle t = new MyTriangle(width,height);
					t.setX(x);t.setY(y);
					p[count++] = t;
					break;
				}
				case "3" :
				{
					for(int i=0; i< count; ++i) {
						p[i].output();
						break;
					}
				}
				case "4" :
				{
					return;
				}
			}
		}

		
	}
	private static void pintt() {
		System.out.println("*********************************************");
		System.out.println("******1. 원 , 2. 삼각형, 3. 전체출력 , 4. 종료******");
		System.out.println("**********************************************");
	}
	
}

