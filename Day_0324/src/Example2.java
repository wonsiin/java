import java.util.*; //입력값 적용시

import org.w3c.dom.Text;

public class Example2 {

	public static void main(String[] args) {
		int second = 12345;
		int second3 = second / 60 / 60;
		int second1 = second / 60 % 60;
		int second2 = second % 60;
		System.out.println("숫자를 입력해 주세요");
		Scanner se = new Scanner(System.in); 	//입력가능조건
		String nd = se.nextLine();				//
		second = Integer.parseInt(nd);			//대입
		
		System.out.println(second + "초는 " + second3 + "시 " + second1 + "분 " + second2 + "초 입니다.");
		System.out.println(second3 + "시간 " +second1 + "분 " + second2 + "초는 총 " + second + "초 입니다.");
		

	}

}
