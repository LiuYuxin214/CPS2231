package Assignment3;

import java.util.Scanner;

public class RightmostLowestPoint {

    public static void main(String[] args) {
        double[][] points = new double[6][2];
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 6 points: ");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 2; j++) {
                points[i][j] = input.nextDouble();
            }
        }
        double[] result;
        result = getRightmostLowestPoint(points);
        System.out.println("The rightmost lowest point is (" + result[0] + ", " + result[1] + ")");
    }

    public static double[] getRightmostLowestPoint(double[][] points) {
        double[] result = {0, 0};
        for (int i = 0; i < 6; i++) {
            if (points[i][0] >= result[0] && points[i][1] <= result[1]) {
                result[0] = points[i][0];
                result[1] = points[i][1];
            }
        }
        return result;
    }
}
