package dev.aleksandrtesliuk.FirstTask;

public abstract class Shape {
    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    public abstract double calculateArea();

    public abstract double calculatePerimeter();

    public void paint() {
        System.out.println("Painting shape in " + color);
    }


    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Shape shape = (Shape) obj;
        return color.equals(shape.color);
    }


    public int hashCode() {
        return color.hashCode();
    }


    public String toString() {
        return "Shape with color: " + color;
    }
}

