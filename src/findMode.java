public class findMode {
    public static int findMode(int[] arr) {
        int num = arr[0];
        int count = 1;
        int max = 0;
        int mode = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == num) {
                num = arr[i];
                count++;
            } else {
                if (count > max) {
                    max = count;
                    mode = arr[i - 1];
                }
                num = arr[i];
                count = 1;
            }
        }
        return mode;
    }

    public static void main(String[] args) {
        int[] nums = {2, 5, 6, 7, 7, 10, 10, 11, 11, 13, 15, 15, 15, 19, 20, 20};
        System.out.println(findMode(nums));
    }
}
