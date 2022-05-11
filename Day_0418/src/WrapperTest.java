
public class WrapperTest {

	public static void main(String[] args) {
		
		String score = "홍길동 100 98.5 78.8";
		String[] s = score.split(" "); //"홍길동""100""98.5""78.8"
		System.out.println(s[0]);
		double kor = Double.parseDouble(s[1]);
		double eng = Double.parseDouble(s[2]);
		double mat = Double.parseDouble(s[3]);
		double total = kor + eng + mat;
		double avg = total / 3.0;
		System.out.println(total + " " + avg);
		
		
		
//		String score = "홍길동 100 98.5 78.8";
//		String[] s = score.split(" "); //"홍길동""100""98.5""78.8"
//		System.out.println(s[0]);
//		int kor = Integer.parseInt(s[1]);
//		int eng = Integer.parseInt(s[2]);
//		int mat = Integer.parseInt(s[3]);
//		int total = kor + eng + mat;
//		double avg = total / 3.0;
//		System.out.println(total + " " + avg);
		//Calendar			날짜 계산용 3대장
		//GredorianCalendar
		//Date
		//abstract 추상클래스 이므로 이 글이 붙은것들은 개체생성이불가하다
		
		
		
//		System.out.println(Integer.BYTES);
//		System.out.println(Integer.SIZE);
//		System.out.println(Integer.MIN_VALUE);
//		System.out.println(Integer.MAX_VALUE);
//		
//		Integer i1 = new Integer(10);
//		Integer i2 = new Integer("12"); //이런식으로 사용하지 말아라
//		Integer i3 = 24;	//이렇게 사용
//		Integer i4 = 34;
//		
//		System.out.println(i3 + i4);
//		
//		String str = "12345"; //정수로 바꾸려면? 구문분석을 통해서 꺼냄
//		//(Integer)str 은 부모자식 관계에서만 사용이 가능하다.
//		Integer ivalue =  Integer.parseInt(str);	// String의 꺼내진 값을 꺼내 받는다.
		
		
		//Wrapper 클래스
		// 기초 자료형
//		byte short int long
//		char
//		float double
//		
//		boolean
//		Byte Short Integer Long
//		Character
//		Float Double
//		Boolean
//		- 용어
//		autu boxing : primitive 타입의 데이터가 자동으로 객체화
//		auto unboxing : 객체화된 데이터가 연산 시 자동으로 primitive로 변환
		
		
		
		
	}

}
