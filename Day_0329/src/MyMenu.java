import java.util.Scanner;

public class MyMenu {

	public static void main(String[] args) {
		int a;

		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("=====[관리 프로그램]=====");
			System.out.println("     1. 입   력");
			System.out.println("     2. 전체출력");
			System.out.println("     3. 조   회");
			System.out.println("     4. 삭   제");
			System.out.println("     5. 수   정");
			System.out.println("     0. 종   료");
			System.out.println("======================");
			System.out.println("     선택 > ");
			
			a = scanner.nextInt(); //Exception 처리를 하지 않았음.
			
			switch (a) {
			case 1 : System.out.println("**입력을 선택했습니다.");break;
			case 2 : System.out.println("**전체 출력을 선택했습니다.");break;
			case 3 : System.out.println("**조회를 선택했습니다.");break;
			case 4 : System.out.println("**삭제를 선택했습니다.");break;
			case 5 : System.out.println("**수정을 선택했습니다.");break;
			case 0 : System.out.println("**프로그램을 종료합니다.");return;
			default : System.out.println("err) 메뉴를 다시 선택해주세요.");
			}
		}

	
//		if(a <= 6) {
//			
//			while (a <= 6) {
//				
//				switch (a = 6) {
//				case 1 : System.out.printf("=====[관리 프로그램]=====%n	1. 입  력%n	2. 전체 출력"
//						+ "%n	3. 조  회%n	4. 삭  제%n	5. 수  정%n	6. 종  료%n");
//						System.out.printf("%d번을 선택하셧습니다.",a);
//				case 2 : System.out.printf("=====[관리 프로그램]=====%n	1. 입 력%n	2. 전체 출력"
//						+ "%n	3. 조  회%n	4. 삭  제%n	5. 수  정%n	6. 종  료%n");
//						System.out.printf("%d번을 선택하셧습니다.",a);
//				case 3 : System.out.printf("=====[관리 프로그램]=====%n	1. 입 력%n	2. 전체 출력"
//						+ "%n	3. 조  회%n	4. 삭  제%n	5. 수  정%n	6. 종  료%n");
//						System.out.printf("%d번을 선택하셧습니다.",a);
//				case 4 : System.out.printf("=====[관리 프로그램]=====%n	1. 입 력%n	2. 전체 출력"
//						+ "%n	3. 조  회%n	4. 삭  제%n	5. 수  정%n	6. 종  료%n");
//						System.out.printf("%d번을 선택하셧습니다.",a);
//				case 5 : System.out.printf("=====[관리 프로그램]=====%n	1. 입 력%n	2. 전체 출력"
//						+ "%n	3. 조  회%n	4. 삭  제%n	5. 수  정%n	6. 종  료%n");
//						System.out.printf("%d번을 선택하셧습니다.",a);
//				case 6 : System.out.printf("=====[관리 프로그램]=====%n	1. 입 력%n	2. 전체 출력"
//						+ "%n	3. 조  회%n	4. 삭  제%n	5. 수  정%n	6. 종  료%n");
//						System.out.printf("%d번을 선택하셧습니다.",a);
//				}
//			}
//			System.out.printf("%d번을 선택하셧습니다.",a);
			
		
		
		
	}

}

/*
	[관리 프로그램]
	1.입 력
	2.전체 출력
	3.조 회
	4.삭 제
	5.수 정
	0.종 료
*/