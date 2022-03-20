package Assignment3;

import java.util.Scanner;

public class ClosestPoints {

    public static void main(String[] args) {
        final int big = 100;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number points: ");
        int num = input.nextInt();
        double[][] points = new double[num][3];
        double[][] closestpoints = new double[num][num - 1];
        for (double[] point : points) {
            java.util.Arrays.fill(point, big);
        }
        System.out.print("Enter " + num + " points: ");
        for (int i = 0; i < num; ++i) {
            points[i][0] = input.nextDouble();
            points[i][1] = input.nextDouble();
        }
        int p1 = 0, p2 = 1;
        double closest = distance(points[p1][0], points[p1][1], points[p2][0], points[p2][1]);
        for (int i = 0; i < points.length - 1; ++i) {
            int count = 0;
            for (int j = i + 1; j < points.length - 1; ++j) {
                double distance = distance(points[i][0], points[i][1], points[j][0], points[j][1]);

                if (distance <= points[i][2]) {
                    points[i][2] = distance;
                    if (points[i][2] <= closest) closestpoints[i][count++] = j;
                }


                if (closest > distance) closest = distance;
            }
        }
        for (int i = 0; i < points.length; ++i) {
            if (points[i][2] == closest) {
                for (int j = 0; j < closestpoints[i].length; j++) {
                    if (closestpoints[i][j] != 0.0) {
                        System.out.println("The closest two points are (" + points[i][0] + "," + points[i][1] + ")" + " and (" +
                                points[(int) closestpoints[i][j]][0] + "," + points[(int) closestpoints[i][j]][1] + ")" + "");
                    }
                }
            }
        }
        System.out.println("Their distance is " + closest);
    }

    public static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }
}
