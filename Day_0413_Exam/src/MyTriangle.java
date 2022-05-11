
public class MyTriangle extends MyPoint {
	private double width;
	private double height;
	private double area;
	
	public MyTriangle() {
		super();
	}

	public MyTriangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
		calc();
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	@Override
	public void output() {
		int x = super.getX();
		int y = super.getY();
		
		System.out.println("x=" + x + ", y=" + y + ", width="+ width + ", height="+ height + ", area=" + area);
	}

	@Override
	public void calc() {
		this.area = width * height * 0.5;
	}
}
