package dev.aleksandrtesliuk.FirstTask;

public class Triangle extends Shape {
    private final double side1;
    private final double side2;
    private final double side3;

    public Triangle(String color, double side1, double side2, double side3) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double calculateArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        Triangle triangle = (Triangle) obj;
        return Double.compare(triangle.side1, side1) == 0 &&
                Double.compare(triangle.side2, side2) == 0 &&
                Double.compare(triangle.side3, side3) == 0;
    }

    @Override
    public int hashCode() {
        return 31 * super.hashCode() + Double.hashCode(side1) + Double.hashCode(side2) + Double.hashCode(side3);
    }

    @Override
    public String toString() {
        return "Triangle with sides: " + side1 + ", " + side2 + ", " + side3 + ", color: " + color;
    }
}

