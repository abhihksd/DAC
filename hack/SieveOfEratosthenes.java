import java.util.Arrays;
public class SieveOfEratosthenes
{
    public static void main(String[] args) {
        
    
    int n=50;
    boolean[] sieve=new boolean[n+1];
    Arrays.fill(sieve,true);
        
        
    for(int p=2;p*p<=n;p++)
    {
        if(sieve[p]==true)
        {
            for(int i=p*p;i<=n;i+=p)
            sieve[i]=false;
        }
    }
        
    
    for(int i=2;i<=n;i++)
    {
        if(sieve[i])
        System.out.println(i);
    }

    }

}