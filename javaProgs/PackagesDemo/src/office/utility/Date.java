package office.utility;

public class Date {
	private int dd;
	private int mm;
	private int yy;
	public Date() {
		super();
	dd=mm=yy=1;
	}
	public Date(int dd, int mm, int yy) {
		super();
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}
	public int getDd() {
		return dd;
	}
	public void setDd(int dd) {
		this.dd = dd;
	}
	public int getMm() {
		return mm;
	}
	public void setMm(int mm) {
		this.mm = mm;
	}
	public int getYy() {
		return yy;
	}
	public void setYy(int yy) {
		this.yy = yy;
	}
	public void display()
	{
		System.out.println("Date: "+dd+"/"+mm+"/"+yy);
	}

}
