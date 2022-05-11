
public class PolygonServiceImpl implements PolygonService{
	
	
	
	@Override
	public double calcArea(MyPoint p) {
//		Circle c = (Circle)p; //�ٿ� ĳ���� (Circle)�� ��� Circle�� �ٲ��ش�. [�θ� �ڽ��� ����ġ�°� �� ĳ����?]
//		double radius = c.getRadius(); //ĳ���ð� . �����ڰ� ���� �����ؼ� .���� ������ �� ������ ����.
//		double radius = ((Circle)p).getRadius();
		
//		double area = c.getRadius() * c.getRadius() * Math.PI;		
		double area = -1;

		
		
		
		if (p instanceof Circle) {
			double radius = ((Circle) p).getRadius();
			area = radius * radius * Math.PI;
		} else if (p instanceof Triangle) {
			double height = ((Triangle)p).getHeight();
			double width = ((Triangle)p).getWidth();
			area = height * width / 2;
		} else if (p instanceof MyPoint) { //�θ�Ŭ������ �� �������� �������Ѵ�.
			System.out.println("������ ���Ҽ� ����!");
		}
		return area;
	}
	@Override
	public double test(Object obj) {
			double area = -1;
		
			if (obj instanceof Circle) {
				double radius = ((Circle) obj).getRadius();
				area = radius * radius * Math.PI;
			} else if (obj instanceof Triangle) {
				double height = ((Triangle)obj).getHeight();
				double width = ((Triangle)obj).getWidth();
				area = height * width / 2;
			} else if (obj instanceof MyPoint) { //�θ�Ŭ������ �� �������� �������Ѵ�.
				System.out.println("������ ���Ҽ� ����!");
			}
			return area;
	}
	
}
