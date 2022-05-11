import java.util.Scanner;

/*[연습] 상품의 무게(g)를 입력받는다.
 * 상품의 무게에 따라서 판매 할수있는지 없는지 판별 (double)
 * 무게가 5~ 10g 이면 "상품을 포장했습니다."
 * 무게가 5 < a, a > 10 "판매할 수 없는 상품입니다"
 */

public class Example1 {

	public static void main(String[] args) {
		
		System.out.println("상품의 무게를 입력하세요(g) : ");
		Scanner sc = new Scanner(System.in);
		double mm = sc.nextDouble();
		
		if(mm >= 5 && mm <= 10) {
			System.out.printf("%.1fg상품을 포장했습니다.",mm);
		}else {
			System.out.printf("%.1fg은 판매할 수 없는 상품입니다",mm);
		}
//		if(!(mm >= 5 && mm <= 10)) {
//		(mm < 5 || mm > 10)
//			System.out.printf("%.1fg은 판매할 수 없는 상품입니다",mm);
//		}else {
//			System.out.printf("%.1fg상품을 포장했습니다.",mm);
//		}

	}

}
