public class smallest {


    public static int small(int[] num) {
        int j = 0;
        int min = num[0];
        while (num[j] == 0) {
            min = num[j + 1];
            j++;
        }//令min不为0
        for (int i = 0; i < num.length; i++) {
            if (min > num[i] && num[i] > 0) {
                min = num[i];
            }
        }
        if (min < 0) return 0;
        else return min;
    }

    public static void main(String[] args) {
        System.out.println(small(new int[]{0, 1, 2}));
        System.out.println(small(new int[]{-1, -2}));
        System.out.println(small(new int[]{0, 1, -2, 0}));
    }

}
