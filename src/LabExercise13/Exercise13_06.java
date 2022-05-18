package LabExercise13;

class ComparableCircle extends Circle implements Comparable<Circle> {

    public ComparableCircle(double radius) {
        super(radius);
    }

    @Override
    public int compareTo(Circle o) {
        if (this.getRadius() > o.getRadius()) {
            return 1;
        } else if (this.getRadius() < o.getRadius()) {
            return -1;
        } else {
            return 0;
        }
    }
}

class Circle extends GeometricObject {
    double radius;

    /**
     * Construct a circle with radius 1
     */
    Circle() {
        radius = 1;
    }

    /**
     * Construct a circle with a specified radius
     */
    Circle(double Radius) {
        this.radius = Radius;
    }

    /**
     * Return the area of this circle
     */
    double getArea() {
        return radius * radius * Math.PI;
    }

    /**
     * Return the perimeter of this circle
     */
    double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    /**
     * Set a new radius for this circle
     */
    void setRadius(double newRadius) {
        radius = newRadius;
    }

    double getRadius() {
        return radius;
    }
}

