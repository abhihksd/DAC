public class BoxDemo
{
 public static void main(String args[])
 {
   Box b1=new Box();
   b1.calcVol();
   Box b2=new Box(2,3,4);
   b2.calcVol();
   Box b3=new Box(2);
   b3.calcVol();

 }
}