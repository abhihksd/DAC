class Complex
{
 private int real,img;
 public void showComp()
 {
   if(img<0)
   {
    System.out.println(real+""+img+"i"+"");
   }
   else
   {
    System.out.println(real+"+"+img+"i"+"");
   }
 }
 public Complex()
{ 
   real=img=1;
}
 public Complex(int r,int i)
 {
  real=r; 
  img=i;
 }

}