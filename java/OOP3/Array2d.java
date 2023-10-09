//6. Create 3*3 array for storing integers.
//  Create single dimensional arrays to maintain rowwise sum and columnwise sum of the
// 2d array
public class Array2d {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        //displaying array
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        //rowwise sum
        Array2d a1 = new Array2d();
        int[] rowwise = a1.rowwiseSum(arr);
        for (int i = 0; i < rowwise.length; i++) {
            System.out.println(rowwise[i]);
        }
        System.out.println("*********************");
        //column wise sum
        int[] columnwise = a1.columnwiseSum(arr);
        for (int i = 0; i < columnwise.length; i++) {
            System.out.println(columnwise[i]);

        }

    }

    public int[] rowwiseSum(int[][] arr) {
        int[] sum = new int[3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                sum[i] += arr[i][j];
            }
        }
        return sum;
    }

    public int[] columnwiseSum(int[][] arr) {
        int[] sum = new int[3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                sum[i] += arr[j][i];
            }
        }
        return sum;
    }

}
