import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.concurrent.DelayQueue;

public class CalendarTest {

	public static void main(String[] args) throws InterruptedException {
		Calendar c1 = new GregorianCalendar(); //서버시스템으로부터 시간을 불러옴
		Calendar c2 = Calendar.getInstance(); //이 방법을 많이 사용.
		
		System.out.println(c1);
		System.out.println(c2);
		
		System.out.println(c1.get(Calendar.HOUR)); //c1.get(Calendar.**)하고 불러야한다.
		System.out.println("연도 : " + c1.get(Calendar.YEAR));
		int a = c1.get(Calendar.MONTH);
		a = a + 1;
		System.out.println("월 : " + a);
//		System.out.println("월 : " + c1.get(Calendar.MONTH));
		System.out.println("일 : " + c1.get(Calendar.DATE));
		System.out.println("시 : " + c1.get(Calendar.HOUR));
		System.out.println("분 : " + c1.get(Calendar.MINUTE));
		System.out.println("초 : " + c1.get(Calendar.SECOND));
		System.out.println("초 : " + c1.get(Calendar.MILLISECOND));
		System.out.println("요일 : " + c1.get(Calendar.DAY_OF_WEEK)); //요일
		
		int yoil = c1.get(Calendar.DAY_OF_WEEK);
		String sYoil = null;
		switch(yoil) {
		case 1: sYoil = "일요일 ";break;
		case 2: sYoil = "월요일 ";break;
		case 3: sYoil = "화요일 ";break;
		case 4: sYoil = "수요일 ";break;
		case 5: sYoil = "목요일 ";break;
		case 6: sYoil = "금요일 ";break;
		case 7: sYoil = "토요일 ";break;
		}
		System.out.println(sYoil);
		
		String now = null;
		//처음에 받아온 객체를 가져오면 다시 그 객체로 돌아가 시간이 멈추게된다.
//		while(true) {
//			Calendar c3 = Calendar.getInstance();
//			now = c3.get(Calendar.HOUR) + " : ";
//			now += c3.get(Calendar.MINUTE) + " : ";
//			now += c3.get(Calendar.SECOND);
//			System.out.println(now);
//			
//			Thread.sleep(1000);//밀리세컨
//		}
		//2) String 특징
		// - immutable 한 데이터이다! (변경을 할수 없는 객체)
		//String str = "나리 나리 개나리";
		//StringBuffer sb = new StringBuffer("나리");
		
		
		
		
		
		
	}
}
