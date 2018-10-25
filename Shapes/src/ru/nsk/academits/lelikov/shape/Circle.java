package ru.nsk.academits.lelikov.shape;

public class Circle implements Shape {
    private double radius;

    public Circle(double circleRadius) {
        this.radius = circleRadius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getWidth() {
        return this.radius * 2;
    }

    public double getHeight() {
        return this.radius * 2;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Радиус окружности = " + radius + " Диаметр окружности = " + getWidth() + " Площадь окружности = " + getArea() + " Периметр окружности = " + getPerimeter();
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
        return radius == c.radius;
    }

    @Override
    public int hashCode() {
        final int prime = 37;
        int hash = 1;
        hash = prime * hash + Double.hashCode(radius);
        return hash;
    }
}
