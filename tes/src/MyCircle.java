

public class MyCircle extends MyPoint {
	private double radius;
	
	
	public MyCircle() {}
	public MyCircle(double radius) {
		this.radius = radius;
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
	public void output(MyPoint p) {
		super.output(p);
	}

	
}
