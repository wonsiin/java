import java.util.*;


public class IncTest2 {

	public static void main(String[] args) {
		int hap;
		
		System.out.println("a점수를 입력하세요 : ");
		Scanner ja = new Scanner(System.in);
		int g = ja.nextInt();
		
		System.out.println("b점수를 입력하세요 : ");
		Scanner ja1 = new Scanner(System.in);
		int h = ja1.nextInt();
		
		hap = (g + h) / 2;
		
		String h1 = (g >= 40 && h >= 40 && hap >= 60) ? hap + "점 합격입니다" : hap + "점 불합격입니다.";
		System.out.println(h1);
		
		
		
		
		

	}

}
