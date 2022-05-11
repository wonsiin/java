package mylambda;
//함수형 프로그래밍
// -함수를 데이터로 다룸.
@FunctionalInterface				//써도 되고 안써도 되지만, 사용하면 하나 이상의 메소드를 만들지 못하게 막아준다.
interface Temp{
	public int max(int a,int b); 	//람다형식으로 쓸게 아니라면 추상메소드를 많이 만들수 있다.
									//람다로 쓰려면 오버라이드를 중복할수 없다.
}

public class LambdaTest1 {
	public static void main(String[] args) {
//		Temp t = new Temp() {
//			@Override
//			public int max(int a, int b) {
//				int result = a > b ? a : b;
//							//a가 b보다 큰가? 크면 a 작으면 b
//				return result;
//			}
//		};
		//람다식(람다객체) : 표현은 람다식 이지만 람다 객체다. ==> 익명객체(선언시 이름을 안넣는다고한다)
		//식 : 연산자만 만드는게 식이라고 한다.
		Temp t1 = (a, b) -> a > b ? a : b; //람다식을 정의 (익명객체)를 정의
		System.out.println(t1.max(11, 9)); //실제 사용시에는 이름이 필요
		System.out.println(t1.max(10, 20));
	}

}
