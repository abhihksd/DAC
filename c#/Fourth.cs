using System
class Fourth{
    public static void Main(string[] args)
    {
        int math=0,phy=0,chem=0;
        var totalob;
        int[] arr =TryParse(Console.ReadLine(math,phy,chem));
        for(int i in arr)
        {
            sum+=i;
        }
        if(sum>=180)
        {
            Console.WriteLine("Eligible");

        }
        else
        Console.WriteLine("NOT");


    }
}