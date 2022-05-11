
public class StaticTest {

	public static void main(String[] args) {
		int radius = 6;
		double area;
		
		System.out.println(Math.PI);
		System.out.println(Math.E);
		
//		Math m1 = new Mata(); 접근할수 없는 메소드(하지만 public이라 사용가능) 따라서 생성해서 사용하지 않는다.
		area = radius * radius * Math.PI;
		System.out.println("원의 면적 : " + area);

	}

}
