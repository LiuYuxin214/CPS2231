package Assignment3;

import java.util.Scanner;

import static java.lang.System.exit;

public class LinearEquations {

    public static void main(String[] args) {

        Scanner input = new java.util.Scanner(System.in);

        System.out.print("Enter a linear equations:");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();

        if ((a * d - b * c) != 0) {
            double x = (e * d - b * f) / a * d - b * c;
            double y = (a * f - e * c) / a * d - b * c;

            System.out.println("x is " + x + " and y is " + y);
        } else {
            System.out.println("The equation do not have solution");
            exit(0);
        }
    }

}
