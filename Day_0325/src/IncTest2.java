import java.util.*;


public class IncTest2 {

	public static void main(String[] args) {
		int hap;
		
		System.out.println("a������ �Է��ϼ��� : ");
		Scanner ja = new Scanner(System.in);
		int g = ja.nextInt();
		
		System.out.println("b������ �Է��ϼ��� : ");
		Scanner ja1 = new Scanner(System.in);
		int h = ja1.nextInt();
		
		hap = (g + h) / 2;
		
		String h1 = (g >= 40 && h >= 40 && hap >= 60) ? hap + "�� �հ��Դϴ�" : hap + "�� ���հ��Դϴ�.";
		System.out.println(h1);
		
		
		
		
		

	}

}
