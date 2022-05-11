

public class MyTriangle extends MyPoint{
	private double width;
	private double height;
	private String area;
	
	public MyTriangle(){}
	public MyTriangle(double width, double height) {
		this.width = width;
		this.height = height;
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
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	@Override
	public String toString() {
		return "width= " + width + " , height= " + height + " , area= " + area;
	};
	@Override
	public void output(MyPoint p) {
		super.output(p);
	}
	
	
}
