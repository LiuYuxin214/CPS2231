import java.util.Scanner;

public class SmallestNumbers {
    public static int findSmallerNums(int[][] nums) {
        double sum = 0;
        double average = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                sum = sum + nums[i][j];
                count++;
            }
        }
        average = sum / count;
        int count1 = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (nums[i][j] < average) {
                    count1++;
                }
            }
        }
        return count1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        int[][] arr = new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                arr[i][j] = input.nextInt();
            }
        }
        System.out.println(findSmallerNums(arr));
    }
}