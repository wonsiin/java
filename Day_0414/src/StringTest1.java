

public class StringTest1 {

	public static void main(String[] args) {
		String s1 = "Korea1";				//��� pool�� �����
		String s2 = new String("Korea2"); 	//heap �� �����̵�
		char[] ch = {'k','o','r','e','a'};	//
		String s3 = new String(ch);
		String s4 = "Korea4";
		String s5 = "";
		int i1 = 5;
		
//		System.out.println(s1 == s2); // ********************** ������ �ּ� �� 
//		System.out.println(s1 == s4);
		
		//================================
		char c = s1.charAt(3); //�޼ҵ� ȣ�� (�������̶� int�ε� �޾�����)
		int d = s1.charAt(3);
//		System.out.println(c + " " + d);
//		c = s1.codePointAt(3);
		d = s1.codePointAt(3);
//		System.out.println(c + " " + d);
			String s = new String();
			//=============== concat
			String temp = "�����".concat(" ").concat("������");								//String �� ���̰� ����δ�. ������ + �� ����
			System.out.println(temp);														//Ÿ���� ������� �� �����ؼ� ����Ҽ� �ִ�.
			
			//=============== contains
			System.out.println("���ڿ� ���Կ��� : " + temp.contains("����"));						//�ش� ���ڿ��� �ش� ���ڰ� �ִ��� ��ĵ�뵵		
			System.out.println("���ڿ� ���Կ��� : " + temp.contains("����"));						//������ �־ �����ϰ� ����Ҽ� �����Ͱ���.	������ true ������ false
			
			
			//=============== endsWith
			System.out.println("���ڿ� �����´ܾ� : " + temp.endsWith("��"));						//Ư�� ���ڿ��� �������� Ȯ���Ҷ� ��� 		������ true ������ false
			
			//=============== startsWith
			System.out.println("���ڿ� �����ϴ´ܾ� : " + temp.startsWith("��"));					//Ư�� ���ڿ��� ���� �����ϴ��� �˾ƺ��� 		������ true ������ false
			
			//=============== equals , equalsIgnoreCase
			System.out.println("������ �ܾ��? : " + "People".equals("People"));				//������ �ܾ����� Ȯ��
			System.out.println("������ �ܾ��? : " + "People".equalsIgnoreCase("People"));		//��ҹ��� ������� ������ �ܾ����� Ȯ��
			
			//=============== isEmpty
			System.out.println("�� ���ڿ��̾�? : " + "".isEmpty());								//���̰� 0�̴�
			System.out.println("�� ���ڿ��̾�? : " + "hello".isEmpty());						//���̰� 0���� Ȯ�� false
			//=============== length																			
			String song = "�������� ������ �Կ� ���� �����";										
			System.out.println("���ڿ� ���� : " + song.length());								//���ڿ� ����
			
			//=============== replace	
			String rep1 = song.replace("��", "��");											//�� �� ���� �ٲ۴�.
			System.out.println("�ٲ� ������ : " + rep1);										
			System.out.println("Ư�� ���ڸ� ã�Ƽ� ��ȯ(������ �״�� ����) : " + song);				//������ �״�� ������
			
			
			//=============== split
			String money = "����/9000,Ŀ��/4500";
			String[] ary1 = money.split("/");												//���� �ִ°��� �� ���ڿ��� �����ش�.
			for(int i=0; i< ary1.length;++i) {												
				System.out.println(ary1[i]);
			}
			
			String[] ary = song.split(" ");													//������ �־��� ���ڰ��� �־��ִ¿�Ȱ
			for(int i=0; i< ary.length;++i) {												//���� �ִ°��� �� ���ڿ��� �����ش�.
				System.out.println(ary[i]);
			}
			
			
			// ===========   substring
			System.out.println(song.substring(6));											//6 ��°���� �ڿ� �� �ҷ���
			System.out.println(song.substring(6,9));										//6~9��°���� ���� ������
			
			// ===========   indexOf
			System.out.println(song.indexOf('��'));											//Ư�� ������ ��ġ��ã��
			System.out.println(song.indexOf('��'));											//ù��°�� ���� �����´�.
			
			
			
		s.concat(s1);

//		s.equalsIgnoreCase(s1);
//		System.out.println(s.equalsIgnoreCase(s1));						//���� ���� �żҵ�� ���� ���ؼ� ������ true �ΰͰ���.
//		System.out.println(s.equalsIgnoreCase(s5));						//test�Ҷ� ���ڿ��� 1ĭ�̶� ������ false �� ��������� true
//		System.out.println("=========================");
//		s.indexOf(c);													//���ڰ� ��������� -1 ��������� 0
//		System.out.println(s.indexOf(s1));
//		System.out.println(s.indexOf(s2));
//		System.out.println(s.indexOf(s5));
//		System.out.println("=========================");
//		s.isEmpty();													//���ڿ��� ������ ��� ����°Ͱ���.		
//		System.out.println(s.isEmpty());
//		System.out.println("=========================");
//		s.length();
//		System.out.println(s.length());
//		System.out.println("=========================");
//		s.replace(c, c);
//		System.out.println(s.replace(c,c));
//		System.out.println("=========================");
//		s.split(s1);
//		System.out.println(s.split(s1));
//		System.out.println("=========================");
//		s.substring(c);
//		System.out.println(s.substring(c));
//		System.out.println("=========================");
//		s.substring(d, d);
//		System.out.println(s.substring(d,d));
		
		
		
		
		

	}

}
