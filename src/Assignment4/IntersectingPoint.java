package Assignment4;

import java.util.Scanner;

public class IntersectingPoint {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
        double x1, y1, x2, y2, x3, y3, x4, y4;
        x1 = input.nextDouble();
        y1 = input.nextDouble();
        x2 = input.nextDouble();
        y2 = input.nextDouble();
        x3 = input.nextDouble();
        y3 = input.nextDouble();
        x4 = input.nextDouble();
        y4 = input.nextDouble();
        double a, b, c, d, e, f;
        a = y1 - y2;
        b = -(x1 - x2);
        c = y3 - y4;
        d = -(x3 - x4);
        e = (y1 - y2) * x1 - (x1 - x2) * y1;
        f = (y3 - y4) * x3 - (x3 - x4) * y3;
        LinearEquation linearEquation = new LinearEquation(a, b, c, d, e, f);
        if (linearEquation.isSolvable() == false)
            System.out.println("The two line are parallel");
        else {
            System.out.println("The intersecting point is at (" + linearEquation.getX() + ", " + linearEquation.getY() + ")");
        }

    }

}
