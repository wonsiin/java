import java.util.*;

public class Test1 {

	public static void main(String[] args) {
		
		int max,min;
		
		System.out.println("값 1을 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		System.out.println("값 2를 입력하세요 : ");
		Scanner sc1 = new Scanner(System.in);
		int y = sc1.nextInt();
		
		if(t > y) {
			max = t;
			min = y;
		} else {
			max = y;
			min = t;
		}
		
		System.out.println("큰값은 : " + max + "작은값은 : " + min);

	}

}
