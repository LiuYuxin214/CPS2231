public class TestTriangle {
    public static void main(String[] args) {
        Triangle t1 = new Triangle(3, 4, 5, "blue", true);
        System.out.println(t1.getColor());
        System.out.println(t1.getSide1());
        System.out.println(t1.getSide2());
        System.out.println(t1.getSide3());
        System.out.println(t1.getPerimeter());
        System.out.println(t1.getArea());
        System.out.println(t1.getType());
    }
}
