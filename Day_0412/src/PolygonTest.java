
public class PolygonTest {

	public static void main(String[] args) {
		MyPoint p;
		p = new MyPoint(1,1);				//������
		output(p);
		MyPoint p1 = new Circle(5.5);
											//�θ� Ŭ������ �ڽ�Ŭ������ �����ؼ� ����Ҽ��ִ�.
		p = new Circle(5.5);
		output(p);
		p = new Triangle(6,7);
		output(p);
	}
	
	public static void output(MyPoint p) { //MyPoint Ÿ������ �����Ҽ��ִ�. ( �ڽ� Ŭ�������� �� �������ִ�)
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
//		System.out.println(p1 instanceof MyPoint);   //p1�� MyPoint�� ������Ʈ��? ��� �����.
//		System.out.println(p1 instanceof Object);
//		System.out.println(c1 instanceof Circle);   
//		System.out.println(c1 instanceof MyPoint);
//		System.out.println(p1 instanceof Triangle);   // �θ� Ŭ������ �ڽİ� ���Ҷ��� false
		//�ڽŰ� �����̳� �θ� Ŭ������ true , �ڽź��� �Ʒ��ų� �θ� �ڽ�Ŭ�������� �������� false
//		System.out.println(c1 instanceof Triangle);  //�θ�� ������ �񱳸� �Ҽ� ����. ���� �ƹ� ���谡 �ƴϱ⶧����
		
// instanceof : ���� ������