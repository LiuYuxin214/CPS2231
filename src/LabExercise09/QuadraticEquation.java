package LabExercise09;

import java.util.Scanner;

class QuadraticEquation {
    private double a = 0;
    private double b = 0;
    private double c = 0;

    QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a, b, c: ");
        double a, b, c;
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        if (quadraticEquation.getDiscriminant() < 0) {
            System.out.print("The equation has no real roots");
        } else if (quadraticEquation.getDiscriminant() == 0) {
            System.out.print("The equation has one root " + quadraticEquation.getRoot1());
        } else if (quadraticEquation.getDiscriminant() > 0) {
            System.out.print("The equation has two roots " + quadraticEquation.getRoot1() + " and " + quadraticEquation.getRoot2());
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

    double getDiscriminant() {
        return Math.pow(b, 2) - 4 * a * c;
    }

    double getRoot1() {
        if (getDiscriminant() < 0) return 0;
        return (-b + Math.sqrt(getDiscriminant())) / (2 * a);
    }

    double getRoot2() {
        if (getDiscriminant() < 0) return 0;
        return (-b - Math.sqrt(getDiscriminant())) / (2 * a);
    }

}
