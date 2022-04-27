package LabExercise11;

import java.util.Scanner;

public class AreaOfAConvexPolygon {

    public static double areaOfAConvexPolygon(int n, double[] inputPoints) {
        double area = 0;
        double[] points = new double[inputPoints.length + 2];
        int index = 0;
        for (int i = inputPoints.length - 1; i >= 0; i--) {
            points[index] = inputPoints[i];
            index++;
        }
        points[inputPoints.length] = points[0];
        points[inputPoints.length + 1] = points[1];
        double[] xpoints = new double[(inputPoints.length + 2) / 2];
        double[] ypoints = new double[(inputPoints.length + 2) / 2];
        index = 0;
        for (int i = 0; i < inputPoints.length + 2; i += 2) {
            xpoints[index] = points[i];
            ypoints[index] = points[i + 1];
            index++;
        }
        double sumA = 0, sumB = 0;
        for (int i = 0; i <= xpoints.length - 2; i++) {
            sumA += xpoints[i] * ypoints[i + 1];
        }
        sumA += xpoints[xpoints.length - 1] * ypoints[0];
        for (int i = 0; i <= xpoints.length - 2; i++) {
            sumB += ypoints[i] * xpoints[i + 1];
        }
        sumB += ypoints[ypoints.length - 1] * xpoints[0];
        area = Math.abs(sumA - sumB) / 2.0;
        return area;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of points: ");
        int n = input.nextInt();
        System.out.println("Enter the coordinates of the points: ");
        double[] points = new double[n * 2];
        for (int i = 0; i < points.length; i++) {
            points[i] = input.nextDouble();
        }
        double area = areaOfAConvexPolygon(n, points);
        System.out.println("The total area is " + area);
    }
}