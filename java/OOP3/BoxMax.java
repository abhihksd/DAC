import java.util.Scanner;

public class BoxMax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x,y,z;
    
        BoxArray[] b=new BoxArray[3];
        for(int i=0;i<3;i++)
        {
            System.out.println("Enter height width and depth for box "+(i+1));
            x=sc.nextInt();
            y=sc.nextInt();
            z=sc.nextInt();
            b[i]=new BoxArray(x,y,z);
        }
        int [] boxvol=new int[3];
        for(int i=0;i<3;i++)
        {
            boxvol[i]=b[i].calcVol();
            
        }
        BoxArray b1=(boxvol[0]>boxvol[1])?boxvol[0]>boxvol[2]?b[0]:b[2]:boxvol[1]>boxvol[2]?b[1]:b[2];
        System.out.println("Box with dimensions: "+b1.geth()+"x"+b1.getw()+"x"+b1.getd()+" has the highest volume");
        System.out.println("The greatest volume is: "+b1.calcVol());
    }
    
}
