package com.example.graphics;

public abstract class Shape {
    double x;
    double y;

    public Shape(double x, double y) {
        this.x = x;
        this.y = y;
    }

    abstract double computeArea();
    abstract double computeCircumference();

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

}
