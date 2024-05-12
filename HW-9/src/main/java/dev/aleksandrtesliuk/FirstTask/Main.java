package dev.aleksandrtesliuk.FirstTask;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[] {
                new Circle("Red", 5),
                new Rectangle("Blue", 3, 4),
                new Triangle("Green", 3, 4, 5)
        };

        for (Shape shape : shapes) {
            System.out.println("Area: " + shape.calculateArea());
            System.out.println("Perimeter: " + shape.calculatePerimeter());
            shape.paint();
            System.out.println(shape);
        }
    }
}
