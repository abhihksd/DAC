class Date
{
  private int dd,mm,yy;
  private static int cnt;
  static
  {
    cnt=0;
  } 
  public void showDate()
   {	
    System.out.println("The count of date object is : "+cnt);
     System.out.println(dd+"/"+mm+"/"+yy);
   }
   public void showDate(char ch)
  {
    System.out.println("The count of date object is : "+cnt);
   System.out.println(dd+""+ch+mm+ch+yy);
  }
  Date()
   {
    cnt++;
	dd=0;mm=0;yy=0;
   }
  Date(int dd,int mm,int yy)
  {
    cnt++;
     this.dd=dd;this.mm=mm;this.yy=yy;
  }
  Date(Date d)
  { 
    this.dd=d.dd;
    this.mm=d.mm;
    this.yy=d.yy;
  }
 
}
