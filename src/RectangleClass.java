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
        Rectangle a = new Rectangle(4, 40);
        System.out.println(a.getArea());
        Rectangle b = new Rectangle();
        b.setRectangle(3.5, 35.9);
        System.out.println(b.getArea());
    }

}
