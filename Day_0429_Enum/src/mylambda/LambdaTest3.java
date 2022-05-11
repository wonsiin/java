package mylambda;
//FunctionalInterface���� ����ü�� ������ �ִ� �޼ҵ��
// default Ű���带 �ݵ��!!! �־�����Ѵ�.
interface Sample {
	public int max(int a , int b);
	public int min(int a , int b);
}

public class LambdaTest3 {
	public static void main(String[] args) {
		Sample s = new Sample() {
			//1ȸ�� �ڵ�
			@Override
			public int min(int a, int b) {
				return (a > b)? b : a;
			}
			@Override
			public int max(int a, int b) {
				//������ �ڵ尡 �ִٸ�? �߰�ȣ�� ���
//				Temp t1 = (a,b) -> {/*������ �ڵ�; */ return a > b? a : b ;} ; //���ٽ��� ����
//				Temp t1 = (a,b) -> /*������ �ڵ�; */ return a > b? a : b ; //���ٽ��� ����
				return (a > b)? a : b;
			}

		};
		System.out.println(s.max(11, 21));
		System.out.println(s.min(11, 21));
	}

}
