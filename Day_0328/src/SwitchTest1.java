import java.util.Scanner;

public class SwitchTest1 {

	public static void main(String[] args) {
		int a,b,c;
		double fu;
		String grade = null;
		
		System.out.println("a������ �Է��ϼ��� : ");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		
		System.out.println("b������ �Է��ϼ��� : ");
		Scanner sc1 = new Scanner(System.in);
		b = sc1.nextInt();
		
		System.out.println("c������ �Է��ϼ��� : ");
		Scanner sc2 = new Scanner(System.in);
		c = sc2.nextInt();
		
		fu = (a + b + c) / 3.0;
//		int d = (int)fu;
		System.out.println(fu+","+(int)fu/10);
		switch ((int)fu/10) {
		case 10 :
		case 9 : grade = "A����";break;
		case 8 : grade = "B����";break;
		case 7 : grade = "C����";break;
		case 6 : grade = "D����";break;
		default : grade = "F����";
		}
		System.out.printf("��� %.2f���� %s�����Դϴ�.",fu,grade);
		
//		if (d >= 90) {
//			grade = "A";
//		} else if (d >= 80) {
//			grade = "B";
//		} else if (d >= 70) {
//			grade = "C";
//		} else {
//			grade = "F";
//		}
//		System.out.println(d);
//		System.out.printf("%d����",grade);
//		
//		switch (grade) {
//		case "A" : System.out.printf("%f���� �Դϴ�.",grade); break;
//		case "B" : System.out.printf("%f���� �Դϴ�.",grade); break;
//		case "C" : System.out.printf("%f���� �Դϴ�.",grade); break;
//		case "F" : System.out.printf("%f���� �Դϴ�.",grade); break;
//		}
		
		
		
	}

}
