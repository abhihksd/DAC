public class Test
{
    public static void main(String[] args) {
        int n=0,sum=0;
        while(n<=6)
        {
            sum+=n--;
        }
        System.out.println("sum: "+sum);
    }
}