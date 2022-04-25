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
        int[] nums = {1, 2, 3};
        System.out.println(findMode(nums));
    }
}
