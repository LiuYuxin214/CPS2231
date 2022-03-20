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
        System.out.println("Average of the elements in the major diagonal is  " + averageMajorDiagonal(num));
    }

    public static double averageMajorDiagonal(double[][] m) {
        double result = 0;
        for (int i = 0; i < m.length; i++)
            result += m[i][i];
        for (int i = 0; i < m.length; i++)
            result += m[i][3 - i];
        result /= 8;
        return result;
    }

}
