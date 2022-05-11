package third;

public class Triangle implements Calculate{
	private int width;
	private int height;
	
	public Triangle() {} //�ʼ�
	public Triangle(int width, int height) {
		this.width = width;  //�ʼ�
		this.height = height;	//�ʼ�
	}
	public void setWidth(int width) {	//�ʼ�
		this.width = width;
	}
	
	public int getWidth() {	//�ʼ�
		return this.width;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	public int getHeight() {
		return this.height;
	}
	
	@Override
	public String toString() {	//�ʼ�
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
