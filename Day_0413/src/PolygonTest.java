import java.security.Provider.Service;

public class PolygonTest {

	public static void main(String[] args) {
		PolygonService service = new PolygonServiceImpl();//폴리곤 서비스라는 타입을 service 에 impl을 선언
			
//			service.calcArea(new MyPoint(1,1));
			service.calcArea(new Circle(5.5));
			service.calcArea(new Triangle(3,4));
			System.out.println(service.calcArea(new Circle(5.5)));
			
			System.out.println(service.calcArea(new Triangle(3,4)));
			
	}

}