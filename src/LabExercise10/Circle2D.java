package LabExercise10;

public class Circle2D {
    double x, y, radius;

    Circle2D() {
        x = 0;
        y = 0;
        radius = 1;
    }

    Circle2D(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    double getX() {
        return x;
    }

    double getY() {
        return y;
    }

    double getRadius() {
        return radius;
    }

    double getArea() {
        return Math.PI * radius * radius;
    }

    double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    boolean contains(double x, double y) {
        return (Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2)) < Math.pow(radius, 2);
    }

    boolean contains(Circle2D circle) {
        return (Math.pow(circle.x - this.x, 2) + Math.pow(circle.y - this.y, 2)) < Math.pow(radius - circle.radius, 2);
    }

    boolean overlaps(Circle2D circle) {
        return ((Math.pow(circle.x - this.x, 2) + Math.pow(circle.y - this.y, 2)) < Math.pow(radius + circle.radius, 2))
                && ((Math.pow(circle.x - this.x, 2) + Math.pow(circle.y - this.y, 2)) > Math.pow(radius - circle.radius, 2));
    }

    public static void main(String[] args) {
        Circle2D c1 = new Circle2D(2, 2, 5.5);
        System.out.println("Area of c1: " + c1.getArea());
        System.out.println("Perimeter of c1: " + c1.getPerimeter());
        System.out.println("Contains (3,3): " + c1.contains(3, 3));
        System.out.println("Contains (new Circle2D(4,5,10.5)): " + c1.contains(new Circle2D(4, 5, 10.5)));
        System.out.println("Overlaps (new Circle2D(3,5,2.3)): " + c1.overlaps(new Circle2D(3, 5, 2.3)));

    }
}
