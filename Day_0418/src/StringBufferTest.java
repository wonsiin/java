
public class StringBufferTest {

	public static void main(String[] args) {
		StringBuffer buf1 = new StringBuffer();			//�⺻ 16ĭ ���������� �����ϸ� �ڵ����� �÷���
		StringBuffer buf2 = new StringBuffer(50);		//ĭ�� ��ĭ �����Ұ�����
		StringBuffer buf3 = new StringBuffer("���ع���"); //���ۺ��� ���� �־ ����
		System.out.println(buf1.capacity());
		System.out.println(buf2.capacity());
		System.out.println(buf3.capacity());
		
		buf3.append(" ��λ���").append("������ �⵵��").append(" ���� �ϴ�")
		.append(true).append(42.195).append(12);
		System.out.println(buf3);
		System.out.println(buf3.capacity());
		System.out.println(buf3.length());//��ü ������ �߿��� ���� �������� ����
		buf3.trimToSize(); //�߶󳻴°�(���������� �߶���) �������� �ַ� ����ϱ⵵ �Ѵ�.
		System.out.println(buf3.capacity());
		
		String str = buf3.toString();	//���� �Ұ� �� �ϰ� �������� ����� data�� �ȱ涧 ���
		
		System.out.println(str.getClass());//str�� Class�� ���� �����
		//��� & ���� �ٲ��� �ʴ� ��ü�� �̹��ͺ�
		
		
	}

}
