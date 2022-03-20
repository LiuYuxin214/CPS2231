package Assignment3;

import java.util.Scanner;

public class AverageTheMajorDiagonalInAMatrix {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] num = new double[4][4];

        System.out.println("Enter a 4-by-4 matrix row by row: ");
        for (int i = 0; i < num.length; i++)
            for (int j = 0; j < num[i].length; j++)
                num[i][j] = input.nextDouble();
        System.out.println("Average of the elements in the major diagonal is  " + sumMajorDiagonal(num));
    }

    public static double sumMajorDiagonal(double[][] num) {
        double result = 0;
        for (int i = 0; i < num.length; i++)
            result += num[i][i];
        for (int i = 0; i < num.length; i++)
            result += num[i][3 - i];
        result /= 8;
        return result;
    }

}
