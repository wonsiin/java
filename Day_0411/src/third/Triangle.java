package third;

public class Triangle implements Calculate{
	private int width;
	private int height;
	
	public Triangle() {} //필수
	public Triangle(int width, int height) {
		this.width = width;  //필수
		this.height = height;	//필수
	}
	public void setWidth(int width) {	//필수
		this.width = width;
	}
	
	public int getWidth() {	//필수
		return this.width;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	public int getHeight() {
		return this.height;
	}
	
	@Override
	public String toString() {	//필수
		return "width = " + width + ", Height = " + height;
	}
	@Override
	public double area() {
		
		return (this.width * this.height)*0.5;
	}
	@Override
	public void print() {
		System.out.println("width = " + width + ", Height = " + height + ", area = " + this.area() + "test = " + area());
	}
	
}
