class Calculator
{
 private int num1,num2;
 public Calculator()
 {
   num1=num2=0;
 }
 public Calculator(int n1,int n2)
 {
   num1=n1; num2=n2;
 }
 public void Add()
 {
  System.out.println(num1+num2);
 }
 public void Sub()
 {
  System.out.println(num1-num2);
 }
 public void Multi()
 {
  System.out.println(num1*num2);
 }
 public void Divide()
 {
   if(num2>0)
  System.out.println(num1/num2);
 else{
  System.out.println("Num 2 cant be zero");}
 }
}