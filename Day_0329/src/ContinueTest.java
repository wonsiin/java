
public class ContinueTest {

	public static void main(String[] args) {
		for(int i=1;i <= 10; ++i) {
			if(i == 5) continue; //if���� �ɸ��°� �ϳ���� �߰� ���� ����(5�� �����Ѵ�) [���ǽİ� ���� contiune�� ����Ѵ�]
			if(i%2 == 0) continue; //if���� �ɸ��°� �ϳ���� �߰� ���� ����(5�� �����Ѵ�) [���ǽİ� ���� contiune�� ����Ѵ�]
			System.out.print(i + " ");
		}
	}

}
