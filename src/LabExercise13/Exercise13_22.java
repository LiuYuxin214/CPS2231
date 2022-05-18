package LabExercise13;

class Square {
    private double side;

    public Square() {
        this(1);
    }

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }

    public double getPerimeter() {
        return 4 * side;
    }
}

class ComparableSquare extends Square implements Comparable<ComparableSquare> {
    public ComparableSquare(double side) {
        super(side);
    }

    public int compareTo(ComparableSquare other) {
        if (this.getArea() > other.getArea()) {
            return 1;
        } else if (this.getArea() < other.getArea()) {
            return -1;
        } else {
            return 0;
        }
    }
}

public class Exercise13_22 {
    public static void main(String[] args) {
        ComparableSquare square1 = new ComparableSquare(5);
        ComparableSquare square2 = new ComparableSquare(3);
        System.out.println(square1.compareTo(square2));
    }
}