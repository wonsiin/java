import java.util.Scanner;

public class Exam2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int temp,tt =0,sum = 0;
		String str;
		
		while(true) {
			try {
				System.out.print("숫자를 입력 : ");
				str = sc.next();
				
				temp = Integer.parseInt(str);
				if(tt < 10) {
					sum += temp;
					tt++;
				}
				if(tt == 10) {
					System.out.println("합은 = " + sum);
					break;
				}
				
				
				System.out.println("입력한 숫자 :" + temp);
			}catch(Exception e) {
				System.out.println("**데이터는 숫자로 입력해주세요. 정수만 입력.");
				continue; //프로그램이 종료하지 않고 계속 돈다.
			}
		}

	}

}
