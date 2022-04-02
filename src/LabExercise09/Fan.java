package LabExercise09;

class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    int speed = SLOW;
    boolean on = false;
    double radius = 5;
    String color = "blue";

    Fan() {

    }

    Fan(double newradius, String newcolor) {
        radius = newradius;
        color = newcolor;
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan(10, "yellow");
        fan1.setSpeed(3);
        fan1.turnOn();
        Fan fan2 = new Fan(5, "blue");
        fan2.setSpeed(2);
        fan2.turnOff();
        System.out.println(fan1.fanToString());
        System.out.println(fan2.fanToString());
    }

    void setSpeed(int newspeed) {
        if (newspeed == SLOW) speed = SLOW;
        else if (newspeed == MEDIUM) speed = MEDIUM;
        else if (newspeed == FAST) speed = FAST;
    }

    void turnOn() {
        on = true;
    }

    void turnOff() {
        on = false;
    }

    String fanToString() {
        if (on == true) {
            return speed + " " + color + " " + radius;
        } else {
            return color + " " + radius + " fan is off";
        }
    }

}
