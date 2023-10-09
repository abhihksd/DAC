public class BoxArray {
    private int height, width, depth;

    public BoxArray()
	{
		height=width=depth=0; 
	}

    public BoxArray(int h,int w,int d)
	{
		height=h;
		width=w;
		depth=d;
	}

    public BoxArray(int s)
	{
		height=width=depth=s;
	}
    public int  geth(){return height;}
    public int getw(){return width;}
    public int getd(){return depth;}
    public int  calcVol() {
        
         return height * width * depth;
    }
    
    

}
