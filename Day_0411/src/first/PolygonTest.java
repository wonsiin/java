package first;

class Polygon {
	private int x;
	private int y;
	
	public Polygon() {
		System.out.println("Ploygon Ŭ������ �⺻ ������");
	}
	public void printPolygon() {
		System.out.println("x =" + x + ", y = " + y);
	}
	
}

class Rectangle extends Polygon{
	private int width;
	private int height;
	
	public Rectangle() {
		// �θ� Ŭ���� �����ڸ� ȣ���ϴ� �ڵ尡 �������
		super(); //���� �θ� Ŭ���� ������ ȣ�� [ ���� ������ �ʾƵ� �ڵ����� ȣ���ؿ�]
					// ���� ������� �Ѵٸ� �� ��ܿ� �����ؾ��Ѵ�.
		System.out.println("Rectangle Ŭ������ �⺻ ������");
	}
	
	public void printRectangle() {
		this.printPolygon();
		super.printPolygon();
		System.out.println("width = " + width + ", height = " + height);
	}
	//������ ������ public printPolygon()�� ��ӵǾ���.
}

public class PolygonTest {

	public static void main(String[] args) {
//		Polygon p1 = new Polygon();
//		p1.printPolygon();
		Rectangle rect1 = new Rectangle();  //
//		rect1.printPolygon();		//��ӹ��� �޼ҵ�
//		rect1.printRectangle();		//�ڽ��� �޼ҵ�

		

	}

}
