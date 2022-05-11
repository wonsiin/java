package second;

class Polygon {
	private int x;
	private int y;
	
	public Polygon() {}
	
	public Polygon(int x, int y) {
		this.x = x;
		this.y = y;
		
	}
	public void print() { //상속은 하되 붙이지 말아라.
		System.out.println("x =" + x + ", y = " + y);
	}
	
	@Override
	public String toString() {
		return "x =" + x + ", y = " + y;
	}
	
}

class Rectangle extends Polygon{
	private int width;
	private int height;
	
	public Rectangle() {}
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	public Rectangle(int x, int y, int width, int height) {
		super(x,y);//부모의 x,y값을 호출하는 코드 (오버로딩된 생성자를 호출)
		this.width = width;
		this.height = height;
	}
	
	@Override
	public void print() {
		super.print(); //부모 print의 값을 가져오고 싶은 경우 이렇게 사용.
		System.out.println("width = " + width + ", height = " + height);
	}
	//보이지 않지만 public printPolygon()이 상속되었다.
	
	@Override
	public String toString() {
		return "width = " + width + ", height = " + height;
	}

}

public class PolygonTest {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		r1.print();				//r1을 이용해서 Polgon의 print()를 호출할수 없다.
		System.out.println();
		
		Rectangle r2 = new Rectangle(10,5);
		r2.print();
		System.out.println();
		
		Rectangle r3 = new Rectangle(3,3,15,25);
		r3.print();
		System.out.println("===========================================");
		
		
		
		Polygon p1 = new Polygon();
		p1.print();				//overrode되어 자식값이 출력
		
		r3.toString();
		
		System.out.println(r3); //주소값이 출력 레퍼런스 객체라서 주소값이 나옴  <hash주소라고함>
		System.out.println(r3.toString()); //hash주소로 리턴해줌
		
		
		
		
		
		
	}

}
