
public class ExceptionTest1 {

	public static void main(String[] args) {
		try {
			String[] str = {"1","5","5a","0"};
			String temp = null;

//			temp.charAt(3);
			String a = str[0];	//오류발생 --> JVM으로 전달 --> 객체로 전달 --> 프로그램쪽으로 전달
			String b = str[2]; // 5a값 가져올때 문자열 받아올땐 오류가 안나지만 정수로 계산하려하면 오류가 터진다.

			System.out.println(a + " , " + b);

			int ia = Integer.parseInt(a);
			int ib = Integer.parseInt(b); //NumberFormatException
			System.out.println("결과는 : " + (ia / ib));
		}catch(ArrayIndexOutOfBoundsException e) {		//어레인 인덱스 배열을 잘못 사용시
//			System.out.println("배열의 인덱스를 잘못사용함");	//1번째방법
//			System.out.println(e.getMessage());			//getter 의 값으로 받는다 2번째방법
			e.printStackTrace();						//3번째 방법 (오류찾는방법)
		}catch (NumberFormatException e) {				//번호 형식 예외
//			System.out.println("정수로 파싱불가");
//			System.out.println(e.getMessage());
			e.printStackTrace();
		}catch (ArithmeticException e) {				//산술 예외
//			System.out.println("0으로 나눌 수 없음");
//			System.out.println(e.getMessage());
			e.printStackTrace();
		}catch(Exception e) {
//			System.out.println("모든 익셉션을 전부 처리함");	//그 외에 모든 오류를 여기서 처리함
//			System.out.println(e.getMessage());
			e.printStackTrace();
		}finally {
			System.out.println("Finally~~"); 			//무조건 실행
														//리소스 뒷정리를 위해 필요함!
														// finally 구문은 정리하지 못한 리소스를 처리할 때 사용된다.
		}

	}

}
