package LabExercise09;

import java.util.Scanner;

class LinearEquation {
    private final double a;
    private final double b;
    private final double c;
    private final double d;
    private final double e;
    private final double f;

    LinearEquation(double a, double b, double c, double d, double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a, b, c, d, e, f: ");
        double a, b, c, d, e, f;
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();
        d = input.nextDouble();
        e = input.nextDouble();
        f = input.nextDouble();
        LinearEquation linearEquation = new LinearEquation(a, b, c, d, e, f);
        if (linearEquation.isSolvable() == false)
            System.out.println("The equation has no solution");
        else {
            System.out.println("x is " + linearEquation.getX() + " and y is " + linearEquation.getY());
        }
    }

    double getA() {
        return a;
    }

    double getB() {
        return b;
    }

    double getC() {
        return c;
    }

    double getD() {
        return d;
    }

    double getE() {
        return e;
    }

    double getF() {
        return f;
    }

    boolean isSolvable() {
        return a * d - b * c != 0;
    }

    double getX() {
        return (e * d - b * f) / (a * d - b * c);
    }

    double getY() {
        return (a * f - e * c) / (a * d - b * c);
    }

}
