import java.util.*;

public class Example1 {

	public static void main(String[] args) {
//		int temp;
//		String a;
//		a = text
		System.out.println("값을 입력하세요 : ");
		Scanner s = new Scanner(System.in);
		int temp = s.nextInt();
		int temp1 = temp;

		String temp2 = (temp1 % 2 == 1) ? temp1 + "값은 홀수 입니다.": temp1 + "값은 짝수 입니다.";
		System.out.println(temp2);
	}

}
