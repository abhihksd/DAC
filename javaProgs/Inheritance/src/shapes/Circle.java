package shapes;

import interfaces.Drawable;

public class Circle implements Drawable {
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public void drawShape() {
		// TODO Auto-generated method stub
		System.out.println("Drawing circle");
	}

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return PI * radius * radius;

	}

}
