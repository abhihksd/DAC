public class Assign1
{
 public static void main(String[] args)
 {
  int a=10;
  boolean flag=true;
  for(int i=2;i<7;i++)
  {
    if(a%i==0)
    {flag=false;}
  }
  if(flag)
  {
   System.out.println("Prime");
  }
  else
  { System.out.println("Not prime");
   }
 }
}