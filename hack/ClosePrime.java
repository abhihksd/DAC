import java.util.ArrayList;

public class ClosePrime{
    public static void main(String[] args) {
    
        int left=113,right=139 ;
        boolean flag;
        ArrayList<Integer> arr=new ArrayList<>();
        int [] res={-1,-1};
        
        for(int i=left;i<=right;i++)
        {
            flag=true;
            for(int j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    flag=false;
                    break;
                }
            }
            if(flag)
            {
                arr.add(i);
            }
        
        }

        res=findDiff(arr);
        // if(arr.size()>0){
        // for(int i=0;i<arr.size();i++)
        // {
        // res[0]=arr.get(0);
        // res[1]=arr.get(1);}}
        System.out.println("the array numbers are: "+res[0]+"   "+res[1]);
    }
    public static int[] findDiff(ArrayList<Integer> arr )
    {
        
        int[] res=new int[2];
        int smallesDef=arr.get(1)-arr.get(0);
        res[0]=arr.get(0);
        res[1]=arr.get(1);
        int dif;
        for(int i=0;i<arr.size()-1;i++)
        {
            
            
            dif=arr.get(i+1)-arr.get(i);
            
            System.out.println(dif);
            if(smallesDef>dif)
            {
                smallesDef=dif;
                res[0]=arr.get(i);
                res[1]=arr.get(i+1);
            }
            System.out.println("SMallest diff: "+smallesDef+" " + dif );
        }
        for(int i=0;i<res.length;i++)
        {
            System.out.println("IN find def method: "+res[i]+" ");
        }
        return res;
    }
}