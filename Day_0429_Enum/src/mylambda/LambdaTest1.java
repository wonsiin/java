package mylambda;
//�Լ��� ���α׷���
// -�Լ��� �����ͷ� �ٷ�.
@FunctionalInterface				//�ᵵ �ǰ� �Ƚᵵ ������, ����ϸ� �ϳ� �̻��� �޼ҵ带 ������ ���ϰ� �����ش�.
interface Temp{
	public int max(int a,int b); 	//������������ ���� �ƴ϶�� �߻�޼ҵ带 ���� ����� �ִ�.
									//���ٷ� ������ �������̵带 �ߺ��Ҽ� ����.
}

public class LambdaTest1 {
	public static void main(String[] args) {
//		Temp t = new Temp() {
//			@Override
//			public int max(int a, int b) {
//				int result = a > b ? a : b;
//							//a�� b���� ū��? ũ�� a ������ b
//				return result;
//			}
//		};
		//���ٽ�(���ٰ�ü) : ǥ���� ���ٽ� ������ ���� ��ü��. ==> �͸�ü(����� �̸��� �ȳִ´ٰ��Ѵ�)
		//�� : �����ڸ� ����°� ���̶�� �Ѵ�.
		Temp t1 = (a, b) -> a > b ? a : b; //���ٽ��� ���� (�͸�ü)�� ����
		System.out.println(t1.max(11, 9)); //���� ���ÿ��� �̸��� �ʿ�
		System.out.println(t1.max(10, 20));
	}

}
