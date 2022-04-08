class Circle {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }
}

public class Test {
    public static void main(String[] args) {
        Circle circle1 = new Circle(1);
        Circle circle2 = new Circle(2);
        swap1(circle1, circle2);
        System.out.println("After swap1: circle1 = " + circle1.radius + " circle2 = " + circle2.radius);
        swap2(circle1, circle2);
        System.out.println("After swap2: circle1 = " + circle1.radius + " circle2 = " + circle2.radius);
    }

    public static void swap1(Circle x, Circle y) {//给circle1 一个新名字x，给circle2 一个新名字y
        Circle temp = x;
        x = y;
        y = temp;
    }//circle1 name: circle1 y temp circle2 name: circle2 x

    public static void swap2(Circle x, Circle y) {
        double temp = x.radius;
        x.radius = y.radius;
        y.radius = temp;
    }
}