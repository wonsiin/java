import java.util.Scanner;

public class ExceptionTest4 {

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);

		int a, b;
		System.out.print("a값 정수를 입력 : ");
		a = sc.nextInt();
		System.out.print("b값 정수를 입력 : ");
		b = sc.nextInt();
		try {
			int result = methodA(a , b); //Catched Exception
			System.out.println("결과 : " + result);
		}catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace(); //오류를 명확하게 알려줘 이게 더 좋다.
		}
	}
	public static int methodA(int a ,int b) throws Exception{ // 메소드 시그니쳐 로 에러까지 보완해줘야한다.
		if(a <= b) {
			throw new Exception("첫번째 수는 두번째 수보다 커야합니다."); //객체생성
		}
		return a - b;
	}
}
