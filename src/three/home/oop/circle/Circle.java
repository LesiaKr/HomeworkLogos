package three.home.oop.circle;

public class Circle {
    private double radius;
    private double diameter;

    Circle (double radius, double diameter) {
        this.radius = radius;
        this.diameter = diameter;
    }

    public Circle() {
    }

    public double getRadius() {
        return radius;
    }
    public double getDiameter() {
        return diameter;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public double circleArea (double diameter) {
        double area = (Math.PI * Math.pow(diameter,2)) / 4;
        return area;
    }
    public double circleLength (double radius) {
        double length = Math.PI * radius * 2;
        return length;
    }

    @Override
    public String toString() {
        return "Circle [radius=" + radius + ", diameter=" + diameter + "]";
    }
}
