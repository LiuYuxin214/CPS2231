package Assignment4;

class Rectangle {
    double length = 1;
    double width = 1;

    Rectangle() {
    }

    Rectangle(double newlength, double newwidth) {
        length = newlength;
        width = newwidth;
    }

    double getArea() {
        return length * width;
    }

    double getPerimeter() {
        return length * 2 + width * 2;
    }

    void setRectangle(double newlength, double newwidth) {
        length = newlength;
        width = newwidth;
    }
}

public class RectangleClass {

    public static void main(String[] args) {
        Rectangle a = new Rectangle(40, 4);
        System.out.println("The width1 is 4");
        System.out.println("The length1 is 40");
        System.out.println("The area1 is " + a.getArea());
        System.out.println("The perimeter1 is " + a.getPerimeter());

        Rectangle b = new Rectangle();
        b.setRectangle(35.9, 3.5);
        System.out.println("The width2 is 3.5");
        System.out.println("The length2 is 35.9");
        System.out.println("The area2 is " + b.getArea());
        System.out.println("The perimeter2 is " + b.getPerimeter());
    }

}
