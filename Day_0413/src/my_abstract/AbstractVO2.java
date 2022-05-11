package my_abstract;

public abstract class AbstractVO2 {
	public void print() {
		System.out.println("일반 메소드 입니다.");
	}
	public abstract void calcSomething(); //강제로 abstract 를 넣어야한다.
}
