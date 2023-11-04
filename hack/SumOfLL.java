import java.util.ArrayList;
import java.util.Collections;

public class SumOfLL
{

    public static void main(String[] args) {
        ArrayList<Integer> l1=new ArrayList<Integer>();
        ArrayList<Integer> l2=new ArrayList<Integer>();
        Collections.addAll(l1, 2,4,3);
        Collections.addAll(l2, 5,6,4);
        
        Collections.reverse(l1);
        Collections.reverse(l2);

        int sum1=0,sum2=0;
        for(int i=0;i<l1.size();i++)
        {
            sum1=(sum1*10)+l1.get(i);
            
        }
        for(int i=0;i<l2.size();i++)
        {
            sum2=(sum2*10)+l2.get(i);
            
        }

        System.out.println("The sum is:"+sum1+" "+sum2);
int len=0;
        int totalsum=sum1+sum2;
        if(l1.size()>l2.size())
        len=l1.size();
        else 
        len=l2.size();
        int rem=0;
        ArrayList<Integer> l3=new ArrayList<Integer>();
        System.out.println(totalsum);
        for(int i=0;i<len;i++)
        {
            rem=totalsum%10;
            totalsum=totalsum/10;
            l3.add(rem);
            
        }        
        for(int i=0;i<l3.size();i++)
        {
         System.out.println(l3.get(i));
        }
    }
}