class MyClass { //1개의 파일에 2개의 클래스가 생성
				//추가적인 class는 이름이 달라도 가능하다.
				//상속 안함 final class MyClass
	int var = 10; 			//맴버변수 this.var 로도 불린다
	final double DB = 3.5;
	static int mydata = 5;	//static 이 들어가면 class변수 라고 한다 (클래스 변수) 메모리에 저장되는 위치가 다르다.
							//클래스변수, 공용으로 함께 같이 사용하기 위해 만듬
							//java는 클래스단위로 작업을 하기때문에 무든 문법은 class내부에서 처리해야함
	public static final double DATA = 3.5; //값을 바꿀수 없고 공용으로 사용은 할수있다.
	
	public void MyMethod() { //이 메소드를 상속받은 자식은 수정불가.
		System.out.println(this.var);
		System.out.println(this.DB);
		System.out.println(MyClass.mydata); // 클래스명.변수를 입력해야한다.
											//non-static이라서 이곳에서 static을 언제든지 불러올수있다.
	}
	
}


public class FinalTest {
	//main 클래스를 가진 클래스만 public이여야한다.
	public static void main(String[] args) {
		MyClass m1 = new MyClass();
		MyClass m2 = new MyClass();
		System.out.println(m1.var); 
		System.out.println(m1.DB); 
		System.out.println(m2.var); 
		System.out.println(m2.DB); 
		System.out.println(MyClass.mydata);
		//class 는 new를 진행하였을때 하나의변수에 각각의 메모리가 생성이된다.
		//static은 하나의 공간만 생성되어 공용으로 사용한다. (static은 new를 하기전에 생성이되어있다)

		
		
		int a = 10;
		a = 22;
		
		final int B; //Final은 가능하면 대문자로
		B = 55;
//		b = 20; //오류발생
//메모리 구동 순서 static 변수 1
//메인 메소드 				 2


	}

}
