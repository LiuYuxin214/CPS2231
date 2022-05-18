class obj {
    double radius;

    obj(double radius) {
        this.radius = radius;
    }
}

public class Test {
    public static void main(String[] args) {
        obj obj1 = new obj(1);
        obj obj2 = new obj(2);
        swap1(obj1, obj2);
        System.out.println("After swap1: circle1 = " + obj1.radius + " circle2 = " + obj2.radius);
        swap2(obj1, obj2);
        System.out.println("After swap2: circle1 = " + obj1.radius + " circle2 = " + obj2.radius);
    }

    public static void swap1(obj x, obj y) {//给circle1 一个新名字x，给circle2 一个新名字y
        x = new obj(10);
        obj temp = x;
        x = y;
        y = temp;
    }//circle1 name: circle1 y temp circle2 name: circle2 x

    public static void swap2(obj x, obj y) {
        double temp = x.radius;
        x.radius = y.radius;
        y.radius = temp;
    }
}