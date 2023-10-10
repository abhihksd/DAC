package Demo;

import shapes.*;
import interfaces.Drawable;

public class InterfaceShapeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Drawable d = new Rectangle();
		//d.drawShape();
		Drawable[] draw = { new Rectangle(10,20), new Circle(5), new Triangle(3, 4) };
		for (Drawable dr : draw) {
			dr.drawShape();
			System.out.println("Area: "+dr.calculateArea());
		}

	}

}
