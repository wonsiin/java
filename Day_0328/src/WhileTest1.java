
public class WhileTest1 {

	public static void main(String[] args) {
		int i = 0; //while�� ���� ����
		
		while(true) {
			System.out.println("$ =" + i);
			++i;
			if (i>= 10) {
				break; //�ݺ����� �Ѱ� ���������� ��ɹ�(switch case , while�� ��������)
			}
		}
		
//		while(i < 10) {
//			System.out.println("$ =" + i);
//			++i;
//			System.out.println(i);
//		}
		
		System.out.println("End!");
//		while(i < 10) { ���ѷ���
//			System.out.println("$ =" + i);
//		}
//		while(true) { 
//		System.out.println("$ =" + i);
//	}
//		System.out.println("End!"); (Dead Cord : (�����Ҽ� ���� �ڵ�))
		

	}

}
