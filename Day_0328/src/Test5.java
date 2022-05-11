import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		int a =0 , b = 0, c =1;
		
		System.out.println("값을 입력해 주세요 : ");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		
		if(a <= 10) {
			while (b < a) {
				c = c * 2;
				b++;
			}
			System.out.printf("%d의 최종값은 %d입니다",a,c);
		}else {
			System.out.println("10보다 큽니다.");
		}
		
	}

}
