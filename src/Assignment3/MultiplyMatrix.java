package Assignment3;

import java.util.Scanner;

public class MultiplyMatrix {
    public static double[][] multiplyMatrix(double[][] a, double[][] b) {
        double[][] result = new double[a.length][b[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++)
                for (int t = 0; t < a[0].length; t++) {
                    result[i][j] += a[i][t] * b[t][j];
                }
        }
        return result;

    }

    public static void showMatrix(double[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static double[][] enterMatrix1() {
        Scanner input = new Scanner(System.in);
        double[][] x = new double[3][3];
        System.out.print("Enter matrix1: ");
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                x[i][j] = input.nextDouble();
        return x;
    }

    public static double[][] enterMatrix2() {
        Scanner input = new Scanner(System.in);
        double[][] x = new double[3][3];
        System.out.print("Enter matrix2: ");
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                x[i][j] = input.nextDouble();
        return x;
    }

    public static void main(String[] args) {
        double[][] a = new double[3][3];
        double[][] b = new double[3][3];
        double[][] c = new double[3][3];

        a = enterMatrix1();
        b = enterMatrix2();
        c = multiplyMatrix(a, b);
        showMatrix(a);
        System.out.println("*");
        showMatrix(b);
        System.out.println("=");
        showMatrix(c);
    }
}
