
public class StringTest {
	public static void main(String[] args) {
		String phone = "010-2323-4545";
		boolean flag = false; //flag > true
		
		if(phone.length() != 13) {
			flag =false;
		}else {
			flag = true;
		}
		if(phone.charAt(3) != '-' || phone.charAt(8) != '-') {
			flag = false;
		}else {
			flag = true;
		}
		
		for(int i = 0; i < phone.length(); ++i) {
			
			String[] temp = phone.split("-");
			phone.charAt(i);
			
			for(int j = 0; j < temp.length; ++j) {
				if(!isNumeric(temp[i])) { //��ü ���ϰ��� true�� �ƴ϶��? �̶�� ��
					flag = false;
					break;
				}
			}
			
			if(flag) {
				System.out.print("�ùٸ� ��ȭ��ȣ �Դϴ�.");
			} else {
				System.out.println("�߸��� ��ȭ��ȣ �Դϴ�.");
			}
			
			
//			System.out.print(phone.charAt(i));
		}
		
		
			
		
		
//		String str1 = "12345";
//		String str2 = "123a5";
//		
//		if(isNumeric(str2) == true) {
//			System.out.println("���ڷθ� �̷���� �ֽ��ϴ�.");
//		}else {
//			System.out.println("���ڰ� ���ԵǾ� �ֽ��ϴ�.");
//		}
		
		
		
		
		
//		String str = "1"; 	// ��ȯ�ؼ� ����ؾ��� 		(parse)�۾��� �ʿ�
//		char ch = '1';		// ������� �� �ڵ�� ��ȯ�Ǿ� �������
//		int i = 1;
//		
//		System.out.println(i + 1);			//2
//		System.out.println(ch-'0' + 1);			//'1' = 49 , '0' = 48
//		System.out.println(str + 1);		
	}
	
	//���޹��� ���ڿ��ȿ� ���ڰ� ���ԵǾ� ������ false, ���ڷθ� �̷���� ������ true
//	public static boolean isNumeric(String s) {
////		s.charAt(0); //'0' ~ '9'
////		boolean a = false;
//		
//		for(int i =0; i < s.length(); ++i) {
//			if(!(s.charAt(i) >= '0' && s.charAt(i) <= '9')){
//				return false;
//			}
//		}return true;
		
		
//		for(int i =0; i < s.length(); ++i) {
//			s.charAt(i);
//			System.out.println(s.charAt(i));
//			if(s.charAt(i) > '0' && s.charAt(i) < '9') {
//				a = true;
//				System.out.println(a);
//			}else if(s.charAt(i) != 0 && s.charAt(i) != 9) {
//				a = false;
//				System.out.println(a);
//			}
//			
//			if(a == false) {
//				System.out.println("���ڰ� �ֽ��ϴ�.");
//				return false;
//			}else if(a == true) {
//				System.out.println("���ڸ� �ֽ��ϴ�.");
//			}
//		}
//		return a;
	public static boolean isNumeric(String temp) {
		for(int i =0; i < temp.length(); ++i) {
			if(!(temp.charAt(i) >= '0' && temp.charAt(i) <= '9')) return false;
			}
		return true;
	}
}
