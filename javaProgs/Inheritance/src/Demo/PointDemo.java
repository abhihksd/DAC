package Demo;

import utility.ColorPoint;

public class PointDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ColorPoint p1 = new ColorPoint(10, 20, "NotBlue");
			System.out.println(p1);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
