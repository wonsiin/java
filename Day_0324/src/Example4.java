import java.util.*;

public class Example4 {

	public static void main(String[] args) {
		int si = 9500;
		int x;

		Scanner se = new Scanner(System.in);
		System.out.println("일한 시간 : ");
		String nd = se.nextLine();
		x = Integer.parseInt(nd);
		
		int total = x * si;
		int sn = total - (int)(total * 0.033);
		
		System.out.println("* 총 금액 : " + total);
		System.out.println("* 세금은 : " + (int)(total * 0.033));
		System.out.println("* 실수령액 : " + sn);
		
		System.out.println("Data" + 10 * 20);
		System.out.println("Data" + (10 - 20));   //sysout Ctrl + 스페이스바
		System.out.println();


	}

}
