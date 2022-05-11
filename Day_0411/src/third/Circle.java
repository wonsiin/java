package third;

import java.util.Scanner;

public class Circle implements Calculate {
	Triangle t1 = new Triangle();
	private int radius;
	
	public Circle() {
	}
	public Circle(int radius) {
		this.radius = radius;
		
	}
	
	public void setRabius(int radius) {
		this.radius = radius;
	}
	public int getRabius() {
		return this.radius;
	}
	
	
	@Override
	public String toString() {
		return "radius = " + radius;
	}
	
	
	@Override
	public double area() {
		radius = (int) ((this.radius * this.radius)*PI);
//		return Math.pow(radius, 2)*Math.PI;
		return this.radius;
	}

	@Override
	public void print() {
		System.out.println("radius = " + area());
		System.out.println(radius);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Circle c1 = new Circle();
		System.out.print("반지름 값을 적어주세요 : ");
		int ra = sc.nextInt();
		c1.setRabius(ra);

		c1.print();
		
		
	}

}
