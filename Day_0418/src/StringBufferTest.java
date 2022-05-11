
public class StringBufferTest {

	public static void main(String[] args) {
		StringBuffer buf1 = new StringBuffer();			//기본 16칸 여유공간이 부족하면 자동으로 늘려줌
		StringBuffer buf2 = new StringBuffer(50);		//칸을 몇칸 생산할것인지
		StringBuffer buf3 = new StringBuffer("동해물과"); //시작부터 문자 넣어서 가능
		System.out.println(buf1.capacity());
		System.out.println(buf2.capacity());
		System.out.println(buf3.capacity());
		
		buf3.append(" 백두산이").append("마르고 닳도록").append(" 가을 하늘")
		.append(true).append(42.195).append(12);
		System.out.println(buf3);
		System.out.println(buf3.capacity());
		System.out.println(buf3.length());//전체 데이터 중에서 실제 데이터의 길이
		buf3.trimToSize(); //잘라내는것(여유공간을 잘라내자) 마지막에 주로 사용하기도 한다.
		System.out.println(buf3.capacity());
		
		String str = buf3.toString();	//수정 할거 다 하고 마지막에 사용할 data를 옴길때 사용
		
		System.out.println(str.getClass());//str의 Class가 뭔지 물어본다
		//상수 & 값이 바뀌지 않는 객체들 이뮤터블
		
		
	}

}
