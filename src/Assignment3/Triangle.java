package Assignment3;

import java.util.Scanner;

public class Triangle {

    public static void main(String[] args) {
        double[][] points = new double[3][2];
        Scanner input = new Scanner(System.in);
        System.out.print("Enter x1, y1, x2, y2, x3, y3: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                points[i][j] = input.nextDouble();
            }
        }
        double area = getTriangleArea(points);
        if (area == 0) {
            System.out.println("The three points are on the same line");
        } else {
            System.out.printf("The area of the triangle is %.2f", area);
        }
    }

    public static double getTriangleArea(double[][] points) {
        double side1 = Math.sqrt(Math.pow(points[1][0] - points[0][0], 2) + Math.pow(points[1][1] - points[0][1], 2));
        double side2 = Math.sqrt(Math.pow(points[2][0] - points[0][0], 2) + Math.pow(points[2][1] - points[0][1], 2));
        double side3 = Math.sqrt(Math.pow(points[2][0] - points[1][0], 2) + Math.pow(points[2][1] - points[1][1], 2));
        double s = (side1 + side2 + side3) / 2;
        double t = s * (s - side1) * (s - side2) * (s - side3);
        if (t < 0) return 0;
        return Math.sqrt(t);
    }

}
