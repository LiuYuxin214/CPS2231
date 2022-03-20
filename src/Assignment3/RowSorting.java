package Assignment3;

import java.util.Arrays;
import java.util.Scanner;

public class RowSorting {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] m = new double[4][4];
        System.out.println("Enter a 4-by-4 matrix row by row: ");
        for (int i = 0; i < m.length; i++)
            for (int j = 0; j < m[i].length; j++)
                m[i][j] = input.nextDouble();
        System.out.println();
        System.out.println("The row-sorted array is ");
        show(sortRows(m));
    }

    public static double[][] sortRows(double[][] m) {
        double[][] temp = m.clone();
        for (int i = 0; i < m.length; i++)
            Arrays.sort(temp[i]);
        return temp;
    }

    public static void show(double[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++)
                System.out.printf(m[i][j] + " ");
            System.out.println();
        }
    }
}