import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		int end,sta,i = 0;
		
		System.out.print("시작값을 입력해 주세요 : ");
		Scanner sc1 = new Scanner(System.in);
		sta = sc1.nextInt();
		
		System.out.print("최종값을 입력해 주세요 : ");
		Scanner sc = new Scanner(System.in);
		end = sc.nextInt();
		
		if (sta <= end) {
			while (i < end) {
				i = sta;
				System.out.printf("%d ",i);
				++sta;
			}
		}else {
			System.out.println("시작값은 끝값보다 작거나 같도록 입력해주세요.");
			return; //반환 및 복귀하다.(프로그램 진행 전으로 복귀)
		}
		System.out.printf("%n");
		
	}

}
/*
<실행> 끝값을 입력 : 5
1 2 3 4 5

*/