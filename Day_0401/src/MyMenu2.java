import java.util.Scanner;

public class MyMenu2 {

	public static void main(String[] args) {
		String a;
		
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			menu(); //마우스를올려보면[ 초록점이 생기는데 그것은 public 을 의미 , s는 static을 의미, void 타입을 의미]
			a = scanner.next();
//			scanner.nextLine(); //stdin을 비운다
			
//			if(a) {
				switch (a) {
				case "1" : input();break;
				case "2" : output();break;
				case "3" : selectOne();break;
				case "4" : delete();break;
				case "5" : update();break;
				case "0" : ex();return;
				default : System.out.println("err) 메뉴를 다시 선택해주세요.");
					}
//				scanner.nextLine(); 값을 비우기 위한용도로만 사용하자
//			}else {
//				System.out.println("정확한 숫자를 입력해주세요");
//			}
			

		}

		
		
		
			
			
		}

	

	/**
	 * 화면에 중요한 메뉴를 표시해주는 메소드
	 */
	public static void menu() {
			System.out.println("=====[관리 프로그램]=====");
			System.out.println("     1. 입   력");
			System.out.println("     2. 전체출력");
			System.out.println("     3. 조   회");
			System.out.println("     4. 삭   제");
			System.out.println("     5. 수   정");
			System.out.println("     0. 종   료");
			System.out.println("======================");
			System.out.print("     선택 > ");
	}
	/**
	 * 정보를 키보드로 입력해서 관리하는 메소드
	 */
	public static void input() {
		System.out.println("**입력을 선택했습니다.");
	}
	public static void output() {
		System.out.println("**전체 출력을 선택했습니다.");
	}
	public static void hold(int a) {
		
		}
	public static void selectOne() {
		System.out.println("**조회를 선택했습니다.");
	}
	public static void delete() {
		System.out.println("**삭제를 선택했습니다.");
	}
	public static void update() {
		System.out.println("**수정을 선택했습니다.");
	}
	public static void ex() {
		System.out.println("**프로그램을 종료합니다.");
	}
	
	/**  / //**하고 정보를 입력하면 마우스를 올릴때 정확한 정보를 알수있다.
	 * test 메소드는 a의 거듭제곱을 구하는 메소드
	 * @param a : 밑수
	 * @param b	: 지수
	 * @return 거듭제곱의 결과
	 */
	public static int test(int a, int b) {
		return 0;
	}
}