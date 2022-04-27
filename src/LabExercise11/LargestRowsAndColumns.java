package LabExercise11;

import java.util.ArrayList;
import java.util.Scanner;

public class LargestRowsAndColumns {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the array size n: ");
        int n = input.nextInt();
        int[][] array = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (Math.random() < 0.5) {
                    array[i][j] = 0;
                } else {
                    array[i][j] = 1;
                }
            }
        }
        System.out.println("The random array is: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        ArrayList<Integer> numberOf1InRow = new ArrayList<>();
        ArrayList<Integer> numberOf1InColumn = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < n; i++) {
            count = 0;
            for (int j = 0; j < n; j++) {

                if (array[i][j] == 1) {
                    count++;
                }
            }
            numberOf1InRow.add(count);
        }
        for (int i = 0; i < n; i++) {
            count = 0;
            for (int j = 0; j < n; j++) {

                if (array[j][i] == 1) {
                    count++;
                }
            }
            numberOf1InColumn.add(count);
        }
        int indexRow = 0;
        int indexColumn = 0;
        for (int i = 0; i < n; i++) {
            int max = Integer.MIN_VALUE;
            if (numberOf1InRow.get(i) > max) {
                max = numberOf1InRow.get(i);
                indexRow = i;
            }
        }
        for (int i = 0; i < n; i++) {
            int max = Integer.MIN_VALUE;
            if (numberOf1InColumn.get(i) > max) {
                max = numberOf1InColumn.get(i);
                indexColumn = i;
            }
        }
        System.out.print("The largest row index: ");
        System.out.println(indexRow);
        System.out.print("The largest column index: ");
        System.out.println(indexColumn);
    }
}
