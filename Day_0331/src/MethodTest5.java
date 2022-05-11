
public class MethodTest5 {

	public static void main(String[] args) {
		myMethod();
		//yourMethod // static main에서는 non-static인 yourMethod() 접근 불가하다.

	}
	public static void myMethod() {
		System.out.println("myMethod는 static 입니다.");
	}
	public void yourMethod() {
		System.out.println("myMethod는 non-static 입니다.");
	}

}
/*static 메소드는 non-static을 호출할수 없다.
	(static은 많이 만들지 않는다. -> 메모리 문제 때문에)
	클래스를 생정한 후에 활용가능.
	
	public : 다른 클레스 에서도 이 매소드를 사용할수 있다.
	(default) : 접근 지정자가 없는 상태. 현재 클래스에서 접근 가능
*/