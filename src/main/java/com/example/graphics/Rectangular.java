package com.example.graphics;

public class Rectangular extends Shape {
    private double hight;
    private double width;

    // Konstruktor
    public Rectangular(double x, double y, double hight, double width) {
        super(x, y);
        this.hight = hight;
        this.width = width;
    }

    // Implementierung der abstrakten Methode aus dem Interface Shape
    @Override
    public double computeArea() {
        return hight * width;
    }

    @Override
    double computeCircumference() {
        return 2 * (hight + width);
    }

    public double getHight() {
        return hight;
    }

    public double getWidth() {
        return width;
    }

    public void setHight(double hight) {
        this.hight = hight;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangular{" +
                "hight=" + hight +
                ", width=" + width +
                '}';
    }
}

