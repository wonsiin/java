import java.util.Scanner;

public class WhileTest3 {

	public static void main(String[] args) {
		int j, i = 0; //i = while 제어 변수, j 는 지수 입력
		int result = 1;
		
		System.out.println("지수를 입력(1 ~ 10) : ");
		Scanner sc = new Scanner(System.in);
		j = sc.nextInt();  //3
		
//		
//		if (j > 10) {
//			System.out.println("10보다 큽니다.");
//		}
		//지수입력 1)

		while (i < j) { //0 < 3 , 1 < 3 , 2 < 3
			result = result * 2; // 1* 2 * 2 * 2
			++i;
			
		}
		//결과출력
		System.out.printf("2의 %d제곱 값은 : %d",j,result);

	}

}
