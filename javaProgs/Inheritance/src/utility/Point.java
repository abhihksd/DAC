package utility;

public class Point {
	private int x,y;
	 public Point()
	 {
	   x=y=0;
	 }
	 public Point(int x,int y)
	 {
	   this.x=x; this.y=y;
	 }
	public Point(Point p)
	 {
	   this.x=p.x; this.y=p.y;
	 }
	 public void showPoint()
	 {
	   System.out.println("["+x+","+y+"]"+"");
	 }
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "["+x+","+y+"]"+"";
	}
	 
}
