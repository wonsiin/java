
public class MathTest {

	public static void main(String[] args) {
		int val;
		for(int i = 0; i < 10; ++i) {
//			val = (int)(Math.random() * 100); // 0 ~ 1, 0 ~ 100, -50 ~ 50  "100"�� ������ �����̴�.
//			val = (int)(Math.random() * 100 - 50); // 100 : 100���� ���� , -50 : ���۰�
			val = (int)(Math.random() * 100 + 1); // 1 ~ 100����
			System.out.println(val);
		}

	}

}
