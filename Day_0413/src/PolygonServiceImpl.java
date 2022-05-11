
public class PolygonServiceImpl implements PolygonService{
	
	
	
	@Override
	public double calcArea(MyPoint p) {
//		Circle c = (Circle)p; //다운 캐스팅 (Circle)로 잠시 Circle로 바꿔준다. [부모가 자식을 가르치는건 업 캐스팅?]
//		double radius = c.getRadius(); //캐스팅과 . 연산자가 같이 동작해서 .부터 연산이 들어가 오류가 난다.
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
		} else if (p instanceof MyPoint) { //부모클래스는 맨 마지막에 잡아줘야한다.
			System.out.println("면적을 구할수 없다!");
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
			} else if (obj instanceof MyPoint) { //부모클래스는 맨 마지막에 잡아줘야한다.
				System.out.println("면적을 구할수 없다!");
			}
			return area;
	}
	
}
