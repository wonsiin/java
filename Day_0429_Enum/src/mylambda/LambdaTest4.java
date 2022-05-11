package mylambda;

@FunctionalInterface
interface MyTemp {
	public void output();
}

@FunctionalInterface //����ü�� ���� ����Ÿ���� ����ϸ� MyTest2�� ����ص� �������.
interface MyTemp2 {
	public void test();
}

public class LambdaTest4 {
	public static void main(String[] args) {
		MyTemp t = () -> System.out.println("���");
		t.output(); //���ٽ����� �������̵�
		MyTemp m = methodA();
		m.output();
		methodB(() -> System.out.println("methodB~"));
		//�������ڰ� ���ٽ����� �����̵�. ���������δ� ��ü Ÿ���� �����̵�.
	}
//	public static MyTemp methodA() {
//		return () -> System.out.println("methodA~");
//	}
	public static Runnable methodA() {
		return () -> System.out.println("methodA~");
	}
	public static void methodB(MyTemp t) {
		t.output();
	}
}


