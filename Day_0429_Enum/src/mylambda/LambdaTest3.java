package mylambda;
//FunctionalInterface내에 구현체를 가지고 있는 메소드는
// default 키워드를 반드시!!! 넣어줘야한다.
interface Sample {
	public int max(int a , int b);
	public int min(int a , int b);
}

public class LambdaTest3 {
	public static void main(String[] args) {
		Sample s = new Sample() {
			//1회용 코드
			@Override
			public int min(int a, int b) {
				return (a > b)? b : a;
			}
			@Override
			public int max(int a, int b) {
				//복잡한 코드가 있다면? 중괄호를 사용
//				Temp t1 = (a,b) -> {/*복잡한 코드; */ return a > b? a : b ;} ; //람다식을 정의
//				Temp t1 = (a,b) -> /*복잡한 코드; */ return a > b? a : b ; //람다식을 정의
				return (a > b)? a : b;
			}

		};
		System.out.println(s.max(11, 21));
		System.out.println(s.min(11, 21));
	}

}
