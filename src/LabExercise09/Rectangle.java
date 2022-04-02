package LabExercise09;

public class Rectangle {
    double width = 1;
    double height = 1;

    public Rectangle() {
    }

    public Rectangle(double newWidth, double newHeight) {
        this.width = newWidth;
        this.height = newHeight;
    }

    public double getArea() {
        return height * width;
    }

    public double getPerimeter() {
        return height * 2 + width * 2;
    }

    public static void main(String[] args) {
        Rectangle a = new Rectangle(4, 40);
        System.out.println("The width1 is 4");
        System.out.println("The height1 is 40");
        System.out.println("The perimeter1 is " + a.getPerimeter());
        System.out.println("The area1 is " + a.getArea());
        System.out.println("The perimeter1 is " + a.getPerimeter());
        Rectangle b = new Rectangle(3.5, 35.9);
        System.out.println("The width2 is 3.5");
        System.out.println("The height2 is 35.9");
        System.out.println("The area2 is " + b.getArea());
        System.out.println("The perimeter2 is " + b.getPerimeter());
    }
}
