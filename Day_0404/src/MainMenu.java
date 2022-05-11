
public class MainMenu {

	public void menu() {
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

public void input() {
	System.out.println("**입력을 선택했습니다.");
}
public void output() {
	System.out.println("**전체 출력을 선택했습니다.");
}
public void selectOne() {
	System.out.println("**조회를 선택했습니다.");
}
public void delete() {
	System.out.println("**삭제를 선택했습니다.");
}
public void update() {
	System.out.println("**수정을 선택했습니다.");
}
public void ex() {
	System.out.println("**프로그램을 종료합니다.");
}

}
