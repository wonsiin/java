import java.util.*;

public class CastingTest {

	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		
		Scanner s = new Scanner(System.in);
		
		double result = (double)b / a; //b 혹은 a 앞에 원하는 타입 적으면가능 잠시 변환되어 계산이됨
//		double result = (double)(b / a); x
		System.out.println(result);

	}

}
