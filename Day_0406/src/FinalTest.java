class MyClass { //1���� ���Ͽ� 2���� Ŭ������ ����
				//�߰����� class�� �̸��� �޶� �����ϴ�.
				//��� ���� final class MyClass
	int var = 10; 			//�ɹ����� this.var �ε� �Ҹ���
	final double DB = 3.5;
	static int mydata = 5;	//static �� ���� class���� ��� �Ѵ� (Ŭ���� ����) �޸𸮿� ����Ǵ� ��ġ�� �ٸ���.
							//Ŭ��������, �������� �Բ� ���� ����ϱ� ���� ����
							//java�� Ŭ���������� �۾��� �ϱ⶧���� ���� ������ class���ο��� ó���ؾ���
	public static final double DATA = 3.5; //���� �ٲܼ� ���� �������� ����� �Ҽ��ִ�.
	
	public void MyMethod() { //�� �޼ҵ带 ��ӹ��� �ڽ��� �����Ұ�.
		System.out.println(this.var);
		System.out.println(this.DB);
		System.out.println(MyClass.mydata); // Ŭ������.������ �Է��ؾ��Ѵ�.
											//non-static�̶� �̰����� static�� �������� �ҷ��ü��ִ�.
	}
	
}


public class FinalTest {
	//main Ŭ������ ���� Ŭ������ public�̿����Ѵ�.
	public static void main(String[] args) {
		MyClass m1 = new MyClass();
		MyClass m2 = new MyClass();
		System.out.println(m1.var); 
		System.out.println(m1.DB); 
		System.out.println(m2.var); 
		System.out.println(m2.DB); 
		System.out.println(MyClass.mydata);
		//class �� new�� �����Ͽ����� �ϳ��Ǻ����� ������ �޸𸮰� �����̵ȴ�.
		//static�� �ϳ��� ������ �����Ǿ� �������� ����Ѵ�. (static�� new�� �ϱ����� �����̵Ǿ��ִ�)

		
		
		int a = 10;
		a = 22;
		
		final int B; //Final�� �����ϸ� �빮�ڷ�
		B = 55;
//		b = 20; //�����߻�
//�޸� ���� ���� static ���� 1
//���� �޼ҵ� 				 2


	}

}
