class Date
{
  private int dd,mm,yy;
  public void showDate()
   {	
     System.out.println(dd+"/"+mm+"/"+yy);
   }
   public void showDate(char ch)
  {
   System.out.println(dd+""+ch+mm+ch+yy);
  }
  Date()
   {
	dd=0;mm=0;yy=0;
   }
  Date(int dd,int mm,int yy)
  {
     this.dd=dd;this.mm=mm;this.yy=yy;
  }
  Date(Date d)
  { 
    this.dd=d.dd;
    this.mm=d.mm;
    this.yy=d.yy;
  }
}
