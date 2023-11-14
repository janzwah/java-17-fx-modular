package com.example.graphics;

public class Circle extends Shape{
    private double radius;

    // Konstruktor
    public Circle(double x, double y, double radius) {
        super(x, y);
        this.radius = radius;
    }

    // Implementierung der abstrakten Methode aus dem Interface Shape
    @Override
    public double computeArea() {
        return Math.PI * radius * radius;
    }

    @Override
    double computeCircumference() {
        return 2 * Math.PI * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("Radius darf nicht negativ sein");
        }
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
