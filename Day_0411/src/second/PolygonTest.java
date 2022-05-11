package second;

class Polygon {
	private int x;
	private int y;
	
	public Polygon() {}
	
	public Polygon(int x, int y) {
		this.x = x;
		this.y = y;
		
	}
	public void print() { //����� �ϵ� ������ ���ƶ�.
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
		super(x,y);//�θ��� x,y���� ȣ���ϴ� �ڵ� (�����ε��� �����ڸ� ȣ��)
		this.width = width;
		this.height = height;
	}
	
	@Override
	public void print() {
		super.print(); //�θ� print�� ���� �������� ���� ��� �̷��� ���.
		System.out.println("width = " + width + ", height = " + height);
	}
	//������ ������ public printPolygon()�� ��ӵǾ���.
	
	@Override
	public String toString() {
		return "width = " + width + ", height = " + height;
	}

}

public class PolygonTest {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		r1.print();				//r1�� �̿��ؼ� Polgon�� print()�� ȣ���Ҽ� ����.
		System.out.println();
		
		Rectangle r2 = new Rectangle(10,5);
		r2.print();
		System.out.println();
		
		Rectangle r3 = new Rectangle(3,3,15,25);
		r3.print();
		System.out.println("===========================================");
		
		
		
		Polygon p1 = new Polygon();
		p1.print();				//overrode�Ǿ� �ڽİ��� ���
		
		r3.toString();
		
		System.out.println(r3); //�ּҰ��� ��� ���۷��� ��ü�� �ּҰ��� ����  <hash�ּҶ����>
		System.out.println(r3.toString()); //hash�ּҷ� ��������
		
		
		
		
		
		
	}

}
