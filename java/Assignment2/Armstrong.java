public class Armstrong
{
 public static void main(String args[])
 {
   int num=153,rem=0,sum=0;
 int temp=num;
   while(num>0)
   {
     rem=num%10;
     num=num/10;
     sum+=rem*rem*rem;
   }
System.out.print(sum);
if(sum==temp)
  System.out.println(num+ " is Armstrong number");
else 
 System.out.println("Not armstrong");

 }
}