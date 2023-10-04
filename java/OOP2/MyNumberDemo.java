public class MyNumberDemo
{
 public static void main(String args[])
 {
  System.out.println("The entered number :");
  MyNumber m1=new MyNumber(8);
  if(m1.isNegative())System.out.println("is negative");
  if(m1.isPositive())System.out.println("is Positive");
  if(m1.isZero())System.out.println("is Zero");
  if(m1.isEven())System.out.println("is even");
 }
}