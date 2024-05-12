package dev.aleksandrtesliuk.FirstTask;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[]{
                new Circle("Red", 5.0),
                new Rectangle("Blue", 4.0, 6.0),
                new Triangle("Green", 3.0, 4.0, 5.0)
        };

        for (Shape shape : shapes) {
            shape.paint();
            System.out.println("Area: " + shape.calculateArea());
            System.out.println("Perimeter: " + shape.calculatePerimeter());
            System.out.println(shape);
            System.out.println();
        }
    }
}
