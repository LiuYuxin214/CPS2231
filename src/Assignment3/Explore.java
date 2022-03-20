package Assignment3;

import java.util.Scanner;

public class Explore {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size for the array: ");
        int size = input.nextInt();
        int[][] table = new int[size][size];
        random(table);
        show(table);
        System.out.print(find(table));
        System.out.println(diagonal(table));
    }

    public static String find(int[][] array) {
        StringBuffer result = new StringBuffer();
        int rowSum, columnSum;

        for (int i = 0; i < array.length; i++) {
            rowSum = columnSum = 0;

            for (int j = 0; j < array[i].length; j++) {
                rowSum += array[i][j];
                columnSum += array[j][i];
            }

            if (rowSum == 0) result.append("All 0s on row " + i + "\n");
            if (rowSum == array[0].length) result.append("All 1s on row " + i + "\n");
            if (columnSum == 0) result.append("All 0s on column " + i + "\n");
            if (columnSum == array.length) result.append("All 1s on column " + i + "\n");
        }

        if (result.indexOf("row") == -1)
            result.append("No same numbers on a row\n");
        if (result.indexOf("column") == -1)
            result.append("No same numbers on a column\n");

        return result.toString();
    }

    public static String diagonal(int[][] array) {
        StringBuffer result = new StringBuffer();
        int Diagonal1, Diagonal2;
        Diagonal1 = Diagonal2 = 0;

        for (int i = 0, k = array.length - 1; i < array.length; i++, k--) {
            Diagonal1 += array[i][i];
            Diagonal2 += array[i][k];
        }

        if (Diagonal1 == 0) result.append("All 0s on the major diagonal");
        else if (Diagonal1 == array.length) result.append("All 1s on the major diagonal");
        else result.append("No same numbers on the major diagonal");
        result.append("\n");
        if (Diagonal2 == 0) result.append("All 0s on the sub-diagonal");
        else if (Diagonal2 == array.length) result.append("All 1s on the sub-diagonal");
        else result.append("No same numbers on the sub-diagonal");
        return result.toString();
    }

    public static void random(int[][] array) {
        for (int i = 0; i < array.length; i++)
            for (int j = 0; j < array[i].length; j++) {
                if (Math.random() < 0.5)
                    array[i][j] = 0;
                else
                    array[i][j] = 1;
            }
    }

    public static void show(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++)
                System.out.print(array[i][j] + " ");
            System.out.println();
        }
    }
}