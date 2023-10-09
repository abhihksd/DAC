public class Compare {
    public static void main(String[] args) {
        int[] arr = { 10, 40, 30, 40 };
        System.out.println(Com(arr));
    }

    public static boolean Com(int[] arr) {
        boolean temp = true;
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {

                    cnt++;
                }
            }
            if (cnt > 1) {
                temp = false;
            } else {
                cnt = 0;
            }
        }

        return temp;
    }

}
