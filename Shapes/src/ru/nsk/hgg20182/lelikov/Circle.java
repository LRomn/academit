package ru.nsk.hgg20182.lelikov;

public class Circle implements Shapes {
    private double circleRadius;

    public Circle(double circleRadius) {
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
        return pi * Math.pow(circleRadius, 2);
    }

    public double getPerimeter() {
        double pi = 3.14;
        return 2 * pi * circleRadius;
    }

    @Override
    public String toString() {
        return "Радиус окружности = " + circleRadius + " Диаметр окружности = " + getWidth() + " Площадь окружности = " + getArea() + " Периметр окружности = " + getPerimeter();
    }

    @Override
    public boolean equals(Object circle) {
        if (circle == this) {
            return true;
        }
        if (circle == null || circle.getClass() != this.getClass()) {
            return false;
        }
        Circle c = (Circle) circle;
        return circleRadius == c.circleRadius;
    }

    @Override
    public int hashCode() {
        final int prime = 37;
        int hash = 1;
        hash = prime * hash + Double.hashCode(circleRadius);
        return hash;
    }
}
