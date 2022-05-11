
public class ExceptionTest1 {

	public static void main(String[] args) {
		try {
			String[] str = {"1","5","5a","0"};
			String temp = null;

//			temp.charAt(3);
			String a = str[0];	//�����߻� --> JVM���� ���� --> ��ü�� ���� --> ���α׷������� ����
			String b = str[2]; // 5a�� �����ö� ���ڿ� �޾ƿö� ������ �ȳ����� ������ ����Ϸ��ϸ� ������ ������.

			System.out.println(a + " , " + b);

			int ia = Integer.parseInt(a);
			int ib = Integer.parseInt(b); //NumberFormatException
			System.out.println("����� : " + (ia / ib));
		}catch(ArrayIndexOutOfBoundsException e) {		//��� �ε��� �迭�� �߸� ����
//			System.out.println("�迭�� �ε����� �߸������");	//1��°���
//			System.out.println(e.getMessage());			//getter �� ������ �޴´� 2��°���
			e.printStackTrace();						//3��° ��� (����ã�¹��)
		}catch (NumberFormatException e) {				//��ȣ ���� ����
//			System.out.println("������ �Ľ̺Ұ�");
//			System.out.println(e.getMessage());
			e.printStackTrace();
		}catch (ArithmeticException e) {				//��� ����
//			System.out.println("0���� ���� �� ����");
//			System.out.println(e.getMessage());
			e.printStackTrace();
		}catch(Exception e) {
//			System.out.println("��� �ͼ����� ���� ó����");	//�� �ܿ� ��� ������ ���⼭ ó����
//			System.out.println(e.getMessage());
			e.printStackTrace();
		}finally {
			System.out.println("Finally~~"); 			//������ ����
														//���ҽ� �������� ���� �ʿ���!
														// finally ������ �������� ���� ���ҽ��� ó���� �� ���ȴ�.
		}

	}

}
