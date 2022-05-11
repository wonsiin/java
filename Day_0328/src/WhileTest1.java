
public class WhileTest1 {

	public static void main(String[] args) {
		int i = 0; //while문 제어 변수
		
		while(true) {
			System.out.println("$ =" + i);
			++i;
			if (i>= 10) {
				break; //반복문을 한겹 빠져나가는 명령문(switch case , while을 빠져나감)
			}
		}
		
//		while(i < 10) {
//			System.out.println("$ =" + i);
//			++i;
//			System.out.println(i);
//		}
		
		System.out.println("End!");
//		while(i < 10) { 무한루프
//			System.out.println("$ =" + i);
//		}
//		while(true) { 
//		System.out.println("$ =" + i);
//	}
//		System.out.println("End!"); (Dead Cord : (도달할수 없는 코드))
		

	}

}
