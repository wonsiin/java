package first;

class Polygon {
	private int x;
	private int y;
	
	public Polygon() {
		System.out.println("Ploygon 클래스의 기본 생성자");
	}
	public void printPolygon() {
		System.out.println("x =" + x + ", y = " + y);
	}
	
}

class Rectangle extends Polygon{
	private int width;
	private int height;
	
	public Rectangle() {
		// 부모 클래스 생성자를 호출하는 코드가 만들어짐
		super(); //직접 부모 클래스 생성자 호출 [ 직접 만들지 않아도 자동으로 호출해옴]
					// 직접 만들려고 한다면 최 상단에 존재해야한다.
		System.out.println("Rectangle 클래스의 기본 생성자");
	}
	
	public void printRectangle() {
		this.printPolygon();
		super.printPolygon();
		System.out.println("width = " + width + ", height = " + height);
	}
	//보이지 않지만 public printPolygon()이 상속되었다.
}

public class PolygonTest {

	public static void main(String[] args) {
//		Polygon p1 = new Polygon();
//		p1.printPolygon();
		Rectangle rect1 = new Rectangle();  //
//		rect1.printPolygon();		//상속받은 메소드
//		rect1.printRectangle();		//자신의 메소드

		

	}

}
