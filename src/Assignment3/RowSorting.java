package Assignment3;

import java.util.Arrays;
import java.util.Scanner;

public class RowSorting {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] array = new double[4][4];
        System.out.println("Enter a 4x4 array: ");
        for (int i = 0; i < array.length; i++)
            for (int j = 0; j < array[i].length; j++)
                array[i][j] = input.nextDouble();

        System.out.println("The result: ");
        show(sortRows(array));
    }

    public static double[][] sortRows(double[][] array) {
        double[][] temp = array.clone();
        for (int i = 0; i < array.length; i++)
            Arrays.sort(temp[i]);
        return temp;
    }

    public static void show(double[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++)
                System.out.printf(array[i][j] + " ");
            System.out.println();
        }
    }
}