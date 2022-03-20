package Assignment3;

import java.util.Scanner;

public class Explore {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size for the matrix: ");
        int size = input.nextInt();
        int[][] table = new int[size][size];
        random(table);
        show(table);
        System.out.print(rowAndColumn(table));
        System.out.println(diagonal(table));
    }

    public static String rowAndColumn(int[][] m) {
        StringBuffer result = new StringBuffer();
        int rowSum, columnSum;

        for (int i = 0; i < m.length; i++) {
            rowSum = columnSum = 0;

            for (int j = 0; j < m[i].length; j++) {
                rowSum += m[i][j];
                columnSum += m[j][i];
            }

            if (rowSum == 0) result.append("All 0s on row " + i + "\n");
            if (rowSum == m[0].length) result.append("All 1s on row " + i + "\n");
            if (columnSum == 0) result.append("All 0s on column " + i + "\n");
            if (columnSum == m.length) result.append("All 1s on column " + i + "\n");
        }

        if (result.indexOf("row") == -1)
            result.append("No same numbers on a row\n");
        if (result.indexOf("column") == -1)
            result.append("No same numbers on a column\n");

        return result.toString();
    }

    public static String diagonal(int[][] m) {
        StringBuffer result = new StringBuffer();
        int Diagonal1, Diagonal2;
        Diagonal1 = Diagonal2 = 0;

        for (int i = 0, k = m.length - 1; i < m.length; i++, k--) {
            Diagonal1 += m[i][i];
            Diagonal2 += m[i][k];
        }

        if (Diagonal1 == 0) result.append("All 0s on the major diagonal");
        else if (Diagonal1 == m.length) result.append("All 1s on the major diagonal");
        else result.append("No same numbers on the major diagonal");
        result.append("\n");
        if (Diagonal2 == 0) result.append("All 0s on the sub-diagonal");
        else if (Diagonal2 == m.length) result.append("All 1s on the sub-diagonal");
        else result.append("No same numbers on the sub-diagonal");
        return result.toString();
    }

    public static void random(int[][] m) {
        for (int i = 0; i < m.length; i++)
            for (int j = 0; j < m[i].length; j++) {
                if (Math.random() < 0.5)
                    m[i][j] = 0;
                else
                    m[i][j] = 1;
            }
    }

    public static void show(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++)
                System.out.print(m[i][j] + " ");
            System.out.println();
        }
    }
}