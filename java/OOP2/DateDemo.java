public class DateDemo
{
 public static void main(String args[])
 {
   Date d1=new Date();
   d1.showDate();
   d1.showDate('-');
   Date d2=new Date(12,12,2012);
   d2.showDate();
   Date d3=new Date(d2);
   d3.showDate();
   
 }
}