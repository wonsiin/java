
public class MethodTest5 {

	public static void main(String[] args) {
		myMethod();
		//yourMethod // static main������ non-static�� yourMethod() ���� �Ұ��ϴ�.

	}
	public static void myMethod() {
		System.out.println("myMethod�� static �Դϴ�.");
	}
	public void yourMethod() {
		System.out.println("myMethod�� non-static �Դϴ�.");
	}

}
/*static �޼ҵ�� non-static�� ȣ���Ҽ� ����.
	(static�� ���� ������ �ʴ´�. -> �޸� ���� ������)
	Ŭ������ ������ �Ŀ� Ȱ�밡��.
	
	public : �ٸ� Ŭ���� ������ �� �żҵ带 ����Ҽ� �ִ�.
	(default) : ���� �����ڰ� ���� ����. ���� Ŭ�������� ���� ����
*/