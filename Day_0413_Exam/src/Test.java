import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String choice;
		
		MyPoint[] p = new MyPoint[3];
		int count = 0, x, y;
		double radius, width, height;
		
		while(true) {
			System.out.print("1) 원 2) 삼각형 3) 전체출력 4) 종료 : ");
			choice = scanner.next();
			
			if(count >= p.length && (choice.equals("1") || choice.equals("2"))) {
				System.out.println("*** 데이터를 더 이상 입력할 수 없습니다.\n");
				continue;
			}
			
			switch(choice) {
			case "1" : 
			{

				System.out.print("x:"); x=scanner.nextInt();
				System.out.print("y:"); y=scanner.nextInt();
				System.out.print("radius:"); radius=scanner.nextDouble();

				MyCircle c = new MyCircle(radius);
				c.setX(x); c.setY(y);
				
				p[count++] = c;
				
				break;
			}
			case "2" :
			{
				System.out.print("x:"); x=scanner.nextInt();
				System.out.print("y:"); y=scanner.nextInt();
				System.out.print("width:"); width=scanner.nextDouble();
				System.out.print("height:"); height=scanner.nextDouble();

				MyTriangle t = new MyTriangle(width, height);
				t.setX(x); t.setY(y);
				
				p[count++] = t;
				
				break;
			}
			case "3" : 
				for(int i=0; i<count; ++i)
					p[i].output();
				System.out.println();
				break;
			case "4" : 
				System.out.println("*** 프로그램을 종료합니다.");
				return;
			
			}
		}
		

	}

}
