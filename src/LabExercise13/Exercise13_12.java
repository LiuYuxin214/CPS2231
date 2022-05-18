package LabExercise13;

public class Exercise13_12 {

    public static double sumArea(GeometricObject[] a) {
        double sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] instanceof Circle) {
                Circle c = (Circle) a[i];
                sum += c.getArea();
            } else if (a[i] instanceof Rectangle) {
                Rectangle r = (Rectangle) a[i];
                sum += r.getArea();
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        GeometricObject[] a = new GeometricObject[4];
        a[0] = new Circle(5);
        a[1] = new Rectangle(3, 4);
        a[2] = new Circle(2);
        a[3] = new Rectangle(4, 5);
        System.out.println(sumArea(a));
    }
}
