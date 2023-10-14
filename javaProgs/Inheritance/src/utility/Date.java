package utility;
import java.io.Serializable;
public class Date implements Serializable {
	 private int dd,mm,yy;
	  public void showDate()
	   {	
	     System.out.println(dd+"/"+mm+"/"+yy);
	   }
	   public void showDate(char ch)
	  {
	   System.out.println(dd+""+ch+mm+ch+yy);
	  }
	  public Date()
	   {
		dd=0;mm=0;yy=0;
	   }
	  public Date(int dd,int mm,int yy)
	  {
	     this.dd=dd;this.mm=mm;this.yy=yy;
	  }
	  public Date(Date d)
	  { 
	    this.dd=d.dd;
	    this.mm=d.mm;
	    this.yy=d.yy;
	  }
	public int getYy() {
		return yy;
	}
	public void setYy(int yy) {
		this.yy = yy;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return dd+"/"+mm+"/"+yy;
	}

}
