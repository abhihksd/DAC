import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter 5 numbers: ");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        Array a1 = new Array();
        System.out.println("The greatest number is: " + a1.findMax(arr));
        System.out.println("The smallest number is: " + a1.findMin(arr));
        System.out.println("The average of array is: " + a1.findAvg(arr));
    }

    public int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;

    }

    public int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;

    }

    public float findAvg(int[] arr) {
        float avg = 0f;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

        }
        avg=sum/arr.length;
        return avg;
    }

}
