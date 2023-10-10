package shapes;

import interfaces.Drawable;

public class Triangle implements Drawable {
	private int base,height;

	public Triangle(int base, int height) {
		this.base = base;
		this.height = height;
	}

	@Override
	public void drawShape() {
		// TODO Auto-generated method stub
		System.out.println("drawing triangle");

	}

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return 0.5*base*height;

	}

}
