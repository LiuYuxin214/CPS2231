package Assignment3;

import java.util.Scanner;

public class Employee {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int DAY = 7;
        final int EMPLOYEE = 8;
        int[][] hours = new int[EMPLOYEE][DAY];
        System.out.println("Please enter the data of employee: ");
        for (int i = 0; i < EMPLOYEE; i++) {
            for (int j = 0; j < DAY; j++)
                hours[i][j] = input.nextInt();
        }

        int[] sum = sumHours(hours);

        for (int i = 1, j; i < sum.length; i++) {
            int currentElement = sum[i];
            for (j = i - 1; j >= 0 && sum[j] < currentElement; j--) {
                sum[j + 1] = sum[j];
            }
            sum[j + 1] = currentElement;
        }

        for (int i = 0; i < sum.length; i++)
            System.out.println("Employee" + (i + 1) + ": " + sum[i]);
    }

    public static int[] sumHours(int[][] h) {
        int[] sum = new int[h.length];
        for (int i = 0; i < h.length; i++) {
            for (int j = 0; j < h[i].length; j++)
                sum[i] += h[i][j];
        }

        return sum;
    }
}
