class Box
{
private int height,width,depth;
	public Box()
	{
		height=width=depth=0; 
	}
	public Box(int h,int w,int d)
	{
		height=h;
		width=w;
		depth=d;
	}
	public Box(int s)
	{
		height=width=depth=s;
	}
	public void calcVol()
	{
		int vol=height*width*depth;
	  System.out.println("Volume is: "+vol);
	}

}