package Assignment4;

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

public class QuadraticEquationClass {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a,b,c: ");
        double a, b, c;
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();
        QuadraticEquation qE = new QuadraticEquation(a, b, c);
        if (qE.getDiscriminant() < 0) {
            System.out.print("The equation has no real roots");
        } else if (qE.getDiscriminant() == 0) {
            System.out.print("The equation has one root " + qE.getRoot1());
        } else if (qE.getDiscriminant() > 0) {
            System.out.print("The equation has two roots " + qE.getRoot1() + " and " + qE.getRoot2());
        }

    }

}
