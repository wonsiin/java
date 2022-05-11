package enumtest;
//values() : 열거타입 내에 정의된 모든 데이터의 목록을 배열로 변환
//ordinal() : 데이터가 열거된 목록 안에서 몇번째 위치인지 반환한다
//name() : 열거 데이터를 문자열로 반환

public class EnumTest4 {
	public static void main(String[] args) {
		MyColor[] coler = MyColor.values();
		for(MyColor c : coler) {
			System.out.println(c);
		}
		
		MyColor c1 = MyColor.남색;
		System.out.println(c1.ordinal()); //Index를 가져온다(해당값의 순서를 가져옴)
		
		MyColor c2 = MyColor.남색;	//static 이라서 equal
//		MyColor c2 = MyColor.뻘겅;
		String temp = c2.name();				//String으로 넣기때문에
		System.out.println(c2);				
		System.out.println(temp);
		System.out.println(temp.getClass());	//String타입
		System.out.println(c2.getClass());		//MyColor타입
		
		System.out.println(c1 == c2);			//주소 (static final 이기 때문에 주소가 같다)
		System.out.println(c1.equals(c2));
	}
}
