import java.util.Scanner;

public class MenuTest {

	public static void main(String[] args) {
		MainMenu m = new MainMenu();
		String a;
		Scanner scanner = new Scanner(System.in);
		while(true) {
			m.menu();
			a = scanner.next();

				switch (a) {
				case "1" : m.input();break;
				case "2" : m.output();break;
				case "3" : m.selectOne();break;
				case "4" : m.delete();break;
				case "5" : m.update();break;
				case "0" : m.ex();return;
				default : System.out.println("err) 메뉴를 다시 선택해주세요.");
					}
		}
}
}