package ru.nsk.hgg20182.lelikov;

public class Circle implements Shapes {
    private double circleRadius;

    public Circle (double circleRadius){
        this.circleRadius = circleRadius;
    }

    public double getCircleRadius() {
        return circleRadius;
    }

    public void setCircleRadius(double circleRadius) {
        this.circleRadius = circleRadius;
    }

    public double getWidth() {
        return this.circleRadius * 2;
    }

    public double getHeight() {
        return this.circleRadius * 2;
    }

    public double getArea() {
        double pi = 3.14;
        return pi * Math.pow(circleRadius,2);
    }

    public double getPerimeter() {
        double pi = 3.14;
        return 2 * pi * circleRadius;
    }
}
