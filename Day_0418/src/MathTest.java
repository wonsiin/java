
public class MathTest {

	public static void main(String[] args) {
		int val;
		for(int i = 0; i < 10; ++i) {
//			val = (int)(Math.random() * 100); // 0 ~ 1, 0 ~ 100, -50 ~ 50  "100"이 정수의 범위이다.
//			val = (int)(Math.random() * 100 - 50); // 100 : 100개의 범위 , -50 : 시작값
			val = (int)(Math.random() * 100 + 1); // 1 ~ 100까지
			System.out.println(val);
		}

	}

}
