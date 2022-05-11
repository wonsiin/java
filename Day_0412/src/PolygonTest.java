
public class PolygonTest {

	public static void main(String[] args) {
		MyPoint p;
		p = new MyPoint(1,1);				//다형성
		output(p);
		MyPoint p1 = new Circle(5.5);
											//부모 클래스가 자식클래스를 참조해서 사용할수있다.
		p = new Circle(5.5);
		output(p);
		p = new Triangle(6,7);
		output(p);
	}
	
	public static void output(MyPoint p) { //MyPoint 타입으로 선정할수있다. ( 자식 클래스값도 다 받을수있다)
		System.out.println(p);
	}
}
		
		
//		MyPoint p1 = new MyPoint(5,5);
//		System.out.println(p1);
//		
//		Circle c1 = new Circle(4.5);
//		c1.setX(1);
//		c1.setY(1);
//		System.out.println(c1);
//		
//		Triangle t1 = new Triangle(7,8);
//		t1.setX(10);
//		t1.setY(10);
//		System.out.println(t1);
//		
//		//========================
//		System.out.println(p1 instanceof MyPoint);   //p1이 MyPoint의 오브젝트냐? 라고 문듣다.
//		System.out.println(p1 instanceof Object);
//		System.out.println(c1 instanceof Circle);   
//		System.out.println(c1 instanceof MyPoint);
//		System.out.println(p1 instanceof Triangle);   // 부모 클래스가 자식과 비교할때는 false
		//자신과 동급이나 부모 클래스면 true , 자신보다 아래거나 부모가 자식클래스에게 물을때는 false
//		System.out.println(c1 instanceof Triangle);  //부모는 같지만 비교를 할수 없다. 서로 아무 관계가 아니기때문에
		
// instanceof : 이항 연산자