package dev.aleksandrtesliuk.ThirdTask;

import java.util.Objects;

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
    public void paint() {
        System.out.println("Painting Triangle with color " + color);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Triangle triangle)) return false;
        if (!super.equals(o)) return false;
        return Double.compare(triangle.side1, side1) == 0 &&
                Double.compare(triangle.side2, side2) == 0 &&
                Double.compare(triangle.side3, side3) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), side1, side2, side3);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                ", color='" + color + '\'' +
                '}';
    }
}

