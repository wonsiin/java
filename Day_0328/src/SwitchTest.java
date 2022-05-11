import java.util.Scanner;

public class SwitchTest {

	public static void main(String[] args) {
		// Ctrl + D : 한줄삭제
		// 1) 주사위를 굴려서 나오는 경우에 따라 출력을 하는 프로그램
//		System.out.println("주사위의 숫자는? : ");
		System.out.println("가족을 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
//		int aa = sc.nextInt();
//
//		
//		switch (aa) {
//		case 1: System.out.println("1이 나옴"); break;
//		case 2: System.out.println("2가 나옴"); break;
//		case 3: System.out.println("3이 나옴"); break;
//		case 4: System.out.println("4가 나옴"); break;
//		case 5: System.out.println("5가 나옴"); break;
//		case 6: System.out.println("6이 나옴"); break;
//		}
//		System.out.println("End!");
		
		// 2) 입력받은 문자열에 따라 다른 값을 출력한다고 가정

		String fa = sc.nextLine();
		
		switch(fa) {
		case "m" :
		case "ma" : System.out.println("마더"); break;
		case "f" :
		case "fa" : System.out.println("파더"); break;
		case "s":
		case "si" : System.out.println("동생"); break;
		case "me" : System.out.println("나"); break;
		case "y" :
		case "you" : System.out.println("너"); break;
		default : System.out.println("누구?");
		}
		
		System.out.println("End!");

	}

}
