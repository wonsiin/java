

public class Circle extends MyPoint{
	private double radius;
	
	
	public Circle() {}
	public Circle(double radius) {
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
		return super.toString() + " , radius = " + radius;
	}
	
	

}
