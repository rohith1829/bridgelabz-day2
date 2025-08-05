package com.bridgelabz;

public abstract class Shape {
    abstract double getArea();
    abstract void printType();
}

class Circle extends Shape {
    double radius;

    Circle(double r) { radius = r; }

    double getArea() { return Math.PI * radius * radius; }

    void printType() { System.out.println("Shape: Circle"); }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double l, double w) { length = l; width = w; }

    double getArea() { return length * width; }

    void printType() { System.out.println("Shape: Rectangle"); }
}

class Triangle extends Shape {
    double base, height;

    Triangle(double b, double h) { base = b; height = h; }

    double getArea() { return 0.5 * base * height; }

    void printType() { System.out.println("Shape: Triangle"); }
}

 class ShapeTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(4, 6);
        shapes[2] = new Triangle(3, 7);

        for (Shape s : shapes) {
            s.printType();
            System.out.println("Area: " + s.getArea());
        }
    }
}

