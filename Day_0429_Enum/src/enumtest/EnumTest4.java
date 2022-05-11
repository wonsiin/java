package enumtest;
//values() : ����Ÿ�� ���� ���ǵ� ��� �������� ����� �迭�� ��ȯ
//ordinal() : �����Ͱ� ���ŵ� ��� �ȿ��� ���° ��ġ���� ��ȯ�Ѵ�
//name() : ���� �����͸� ���ڿ��� ��ȯ

public class EnumTest4 {
	public static void main(String[] args) {
		MyColor[] coler = MyColor.values();
		for(MyColor c : coler) {
			System.out.println(c);
		}
		
		MyColor c1 = MyColor.����;
		System.out.println(c1.ordinal()); //Index�� �����´�(�ش簪�� ������ ������)
		
		MyColor c2 = MyColor.����;	//static �̶� equal
//		MyColor c2 = MyColor.����;
		String temp = c2.name();				//String���� �ֱ⶧����
		System.out.println(c2);				
		System.out.println(temp);
		System.out.println(temp.getClass());	//StringŸ��
		System.out.println(c2.getClass());		//MyColorŸ��
		
		System.out.println(c1 == c2);			//�ּ� (static final �̱� ������ �ּҰ� ����)
		System.out.println(c1.equals(c2));
	}
}
