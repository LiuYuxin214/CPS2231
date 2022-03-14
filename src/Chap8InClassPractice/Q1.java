package Chap8InClassPractice;

import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] array = new int[3][3];
        for (int i = 0; i <= 2; i++)
            for (int j = 0; j <= 2; j++)
                array[i][j] = input.nextInt();
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        int sum = 0;
        for (int i = 0; i <= 2; i++)
            for (int j = 0; j <= 2; j++)
                sum += array[i][j];
        System.out.println("sum: " + sum);

        int max = array[0][0];
        for (int i = 0; i <= 2; i++)
            for (int j = 0; j <= 2; j++) {
                if (max < array[i][j]) {
                    max = array[i][j];
                }
            }
        System.out.println("max: " + max);

        int min = array[0][0];
        for (int i = 0; i <= 2; i++)
            for (int j = 0; j <= 2; j++) {
                if (min > array[i][j]) {
                    min = array[i][j];
                }
            }
        System.out.println("min: " + min);

        for (int i = 0; i <= 2; i++)
            for (int j = 0; j <= 2; j++) {
                if (array[i][j] % 2 == 0) {
                    System.out.println(i + " " + j);
                }
            }

        int tsum = 0;
        for (int i = 0; i <= 2; i++)
            tsum += array[i][i];
        System.out.println(tsum / 3);
    }
}

