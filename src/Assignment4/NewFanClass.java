package Assignment4;

class NewFan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    String color = "blue";
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;

    NewFan() {

    }

    NewFan(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    int getSpeed() {
        return speed;
    }

    void setSpeed(int speed) {
        if (speed == SLOW) this.speed = SLOW;
        else if (speed == MEDIUM) this.speed = MEDIUM;
        else if (speed == FAST) this.speed = FAST;
    }

    String getColor() {
        return color;
    }

    void setColor(String color) {
        this.color = color;
    }

    double getRadius() {
        return radius;
    }

    void setRadius(double radius) {
        this.radius = radius;
    }

    boolean getOn() {
        return on;
    }

    void setOn(boolean on) {
        this.on = on;
    }

}

public class NewFanClass {

    public static void main(String[] args) {
        NewFan newFan1 = new NewFan();
        newFan1.setSpeed(3);
        newFan1.setColor("yellow");
        newFan1.setOn(true);
        newFan1.setRadius(10);
        System.out.println(newFan1.getSpeed());
        System.out.println(newFan1.getColor());
        System.out.println(newFan1.getOn());
        System.out.println(newFan1.getRadius());
        NewFan newFan2 = new NewFan();
        newFan2.setSpeed(2);
        newFan2.setColor("blue");
        newFan2.setOn(false);
        newFan2.setRadius(5);
        System.out.println(newFan2.getSpeed());
        System.out.println(newFan2.getColor());
        System.out.println(newFan2.getOn());
        System.out.println(newFan2.getRadius());
    }

}
