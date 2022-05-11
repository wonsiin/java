package mylambda;

@FunctionalInterface
interface MyTemp {
	public void output();
}

@FunctionalInterface //구현체가 같고 리턴타입이 비슷하면 MyTest2로 사용해도 상관없다.
interface MyTemp2 {
	public void test();
}

public class LambdaTest4 {
	public static void main(String[] args) {
		MyTemp t = () -> System.out.println("출력");
		t.output(); //람다식으로 오버라이딩
		MyTemp m = methodA();
		m.output();
		methodB(() -> System.out.println("methodB~"));
		//전달임자가 람다식으로 전달이됨. 실질적으로는 객체 타입이 전달이됨.
	}
//	public static MyTemp methodA() {
//		return () -> System.out.println("methodA~");
//	}
	public static Runnable methodA() {
		return () -> System.out.println("methodA~");
	}
	public static void methodB(MyTemp t) {
		t.output();
	}
}


