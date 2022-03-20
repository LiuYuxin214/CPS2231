package Assignment3;

import java.util.Scanner;

public class Sort {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size (Rows X Columns): ");
        int a = input.nextInt();
        int b = input.nextInt();
        int[][] array = new int[a][b];
        System.out.print("Enter the array: ");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                array[i][j] = input.nextInt();
            }
        }
        sort(array);
    }

    public static void sort(int[][] array) {
        int[] temp = new int[2];
        for (int i1 = 0; i1 < array.length - 1; i1++) {
            for (int i2 = i1 + 1; i2 < array.length; i2++) {
                if (array[i1][0] > array[i2][0]) {
                    temp[0] = array[i1][0];
                    temp[1] = array[i1][1];
                    array[i1][0] = array[i2][0];
                    array[i1][1] = array[i2][1];
                    array[i2][0] = temp[0];
                    array[i2][1] = temp[1];
                }
            }
        }
        for (int i1 = 0; i1 < array.length - 1; i1++) {
            for (int i2 = i1 + 1; i2 < array.length; i2++) {
                if (array[i1][0] == array[i2][0]) {
                    if (array[i1][1] > array[i2][1]) {
                        temp[0] = array[i1][0];
                        temp[1] = array[i1][1];
                        array[i1][0] = array[i2][0];
                        array[i1][1] = array[i2][1];
                        array[i2][0] = temp[0];
                        array[i2][1] = temp[1];
                    }
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
