public class BoxArrayDemo {
    public static void main(String[] args) {
        BoxArray [] arr=new BoxArray[3];
        arr[0]=new BoxArray(2,3,4);
        arr[1]=new BoxArray(5,6,7);
        arr[2]=new BoxArray(8,8,9);
        for(int i=0;i<arr.length;i++)
        {
            
            System.out.println(arr[i].calcVol());
        }
   
    }
    
}
