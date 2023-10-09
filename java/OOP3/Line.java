public class Line {
    Point startPoint;
    Point endPoint;
    public Line()
    {
        startPoint=new Point();
        endPoint=new Point();
    }
    public Line(Point p1,Point p2)
    {
        startPoint=new Point(p1);
        endPoint=new Point(p2);
    }
    public void display()
    {
        startPoint.showPoint();
        endPoint.showPoint();
    }

    
}
