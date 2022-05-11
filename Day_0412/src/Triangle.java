

public class Triangle extends MyPoint{
	private int width;
	private int height;
	
	public Triangle() {} 
	public Triangle(int width, int height) {
		this.width = width;  
		this.height = height;	
	}
	public void setWidth(int width) {	
		this.width = width;
	}
	
	public int getWidth() {	
		return this.width;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	public int getHeight() {
		return this.height;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", width = " + width + ", Height = " + height;
	}
	
}
