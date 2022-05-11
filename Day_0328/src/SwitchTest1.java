import java.util.Scanner;

public class SwitchTest1 {

	public static void main(String[] args) {
		int a,b,c;
		double fu;
		String grade = null;
		
		System.out.println("a점수를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		
		System.out.println("b점수를 입력하세요 : ");
		Scanner sc1 = new Scanner(System.in);
		b = sc1.nextInt();
		
		System.out.println("c점수를 입력하세요 : ");
		Scanner sc2 = new Scanner(System.in);
		c = sc2.nextInt();
		
		fu = (a + b + c) / 3.0;
//		int d = (int)fu;
		System.out.println(fu+","+(int)fu/10);
		switch ((int)fu/10) {
		case 10 :
		case 9 : grade = "A학점";break;
		case 8 : grade = "B학점";break;
		case 7 : grade = "C학점";break;
		case 6 : grade = "D학점";break;
		default : grade = "F학점";
		}
		System.out.printf("평균 %.2f점은 %s학점입니다.",fu,grade);
		
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
//		System.out.printf("%d점수",grade);
//		
//		switch (grade) {
//		case "A" : System.out.printf("%f학점 입니다.",grade); break;
//		case "B" : System.out.printf("%f학점 입니다.",grade); break;
//		case "C" : System.out.printf("%f학점 입니다.",grade); break;
//		case "F" : System.out.printf("%f학점 입니다.",grade); break;
//		}
		
		
		
	}

}
