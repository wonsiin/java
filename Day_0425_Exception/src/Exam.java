import java.util.Scanner;

public class Exam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int temp,i =0,sum = 0;
		
		while(true) {
			try {
				System.out.print((i+1) + " 회 : ");
				temp = sc.nextInt();						//버퍼의 데이터가 남아있어서 무한루프 돈다.
				sum += temp;
				System.out.println("현재까지 합은 = " + sum);
				++i;
				if(i >= 10) break;
			
			}catch(Exception e) {
				System.out.println("**데이터는 숫자로 입력해주세요. 정수만 입력.");
				sc.nextLine();
				continue; //프로그램이 종료하지 않고 계속 돈다.
			}
		}

	}

}
