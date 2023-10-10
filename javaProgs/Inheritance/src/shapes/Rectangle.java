package shapes;

import interfaces.Drawable;

public class Rectangle implements Drawable {
	private int length, breadth;

	public Rectangle(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public void drawShape() {
		// TODO Auto-generated method stub
		System.out.println("drawing Rectangle");
	}

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return length * breadth;

	}

}
