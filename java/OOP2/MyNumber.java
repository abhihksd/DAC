class MyNumber
{
 private int a;
 public MyNumber(){a=0;}
 public MyNumber(int a)
 {this.a=a;
 }
 public boolean isNegative()
 {
   if(a<0)
   return true;
else 
 return false;
 }
 public boolean isPositive()
 {
   if(a>0)
   return true;
else 
 return false;
 }
 public boolean isZero()
 {
  if(a==0)
   return true;
else 
 return false;
 }
 public boolean isEven()
 {if(a%2==0)
  return true;
else 
 return false;
}
}