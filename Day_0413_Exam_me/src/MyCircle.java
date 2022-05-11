

public class MyCircle extends MyPoint {
	private double radius;
	private double area;
	
	
	public MyCircle() {}
	public MyCircle(double radius) {
		this.radius = radius;
		calc();
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	@Override
	public String toString() {
		return "radius= " + radius;
	}
	@Override
	public void output() {
		int x = super.getX();
		int y = super.getY();
		
		System.out.println("x = " + x + " , y = " + y + " , radius : " + radius);
	}
	@Override
	public void calc() {
		this.area = radius * radius * Math.PI;
	}

	
}
