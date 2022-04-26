package LabExercise11;

import java.util.Scanner;

public class Triangle extends GeometricObject {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    public Triangle() {
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    public String toString() {
        return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter side1: ");
        double side1 = input.nextDouble();
        System.out.print("Enter side2: ");
        double side2 = input.nextDouble();
        System.out.print("Enter side3: ");
        double side3 = input.nextDouble();
        Triangle t = new Triangle(side1, side2, side3);
        System.out.print("Enter color: ");
        String color = input.next();
        t.setColor(color);
        System.out.print("Enter filled: ");
        boolean filled = input.nextBoolean();
        t.setFilled(filled);
        System.out.println("Area = " + t.getArea());
        System.out.println("Perimeter = " + t.getPerimeter());
        System.out.println("Color = " + t.getColor());
        System.out.println("Filled = " + t.isFilled());
    }
}

