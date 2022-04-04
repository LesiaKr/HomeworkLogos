package three.home.oop.rectangle;

public class Rectangle {
    private double length;
    private double width;

    Rectangle () {
        this.length = 10;
        this.width = 15;
    }

    Rectangle (double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double rectArea (double length, double width) {
        double area = length * width;
        return area;
    }

    public double rectPerimeter (double length, double width) {
        double perimeter = (length + width ) * 2;
        return perimeter;
    }

    @Override
    public String toString() {
        return "Rectangle [length=" + length + ", width=" + width + "]";
    }
}
