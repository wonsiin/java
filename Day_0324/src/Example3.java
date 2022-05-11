import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		int x = 0;
		int fee = 35000;
		int total = x; //총인원수
		int amount;  // 총 요금
		int child;
		int ch = 35000 / 10;
		ch = fee - ch;
		
		Scanner se = new Scanner(System.in);
		System.out.println("총 몇명인가요? ");
		String nd = se.nextLine();
		x = Integer.parseInt(nd);
		
		
		
		System.out.println("어린이는 몇명 인가요? ");
		String nn = se.nextLine();
		child = Integer.parseInt(nn);
		
		amount = (x - child) * fee + (child * ch);
//		System.out.println(x);
//		System.out.println(child);
//		System.out.println(ch);
		
		String toto = (child >= x) ? "어린이는 할인 대상입니다.": "어서오세요.";
		System.out.println("총인원은 " + x + "어린이는 수는 " + child + "명입니다.");
		System.out.println(toto + "할인된 총 금액은 " + amount + "입니다.");

	}

}
