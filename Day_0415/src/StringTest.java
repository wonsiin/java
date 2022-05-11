
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
				if(!isNumeric(temp[i])) { //전체 리턴값이 true가 아니라면? 이라는 뜻
					flag = false;
					break;
				}
			}
			
			if(flag) {
				System.out.print("올바른 전화번호 입니다.");
			} else {
				System.out.println("잘못된 전화번호 입니다.");
			}
			
			
//			System.out.print(phone.charAt(i));
		}
		
		
			
		
		
//		String str1 = "12345";
//		String str2 = "123a5";
//		
//		if(isNumeric(str2) == true) {
//			System.out.println("슷자로만 이루어져 있습니다.");
//		}else {
//			System.out.println("문자가 포함되어 있습니다.");
//		}
		
		
		
		
		
//		String str = "1"; 	// 변환해서 사용해야함 		(parse)작업이 필요
//		char ch = '1';		// 산술연산 시 코드로 변환되어 연산시행
//		int i = 1;
//		
//		System.out.println(i + 1);			//2
//		System.out.println(ch-'0' + 1);			//'1' = 49 , '0' = 48
//		System.out.println(str + 1);		
	}
	
	//전달받은 문자열안에 문자가 포함되어 있으면 false, 숫자로만 이루어져 있으면 true
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
//				System.out.println("문자가 있습니다.");
//				return false;
//			}else if(a == true) {
//				System.out.println("숫자만 있습니다.");
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
