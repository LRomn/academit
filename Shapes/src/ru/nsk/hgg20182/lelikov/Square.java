package ru.nsk.hgg20182.lelikov;

public class Square implements Shapes {
    private double squareLength;

    public Square(double squareLength) {
        this.squareLength = squareLength;
    }

    public double getSquareLength() {
        return squareLength;
    }

    public void setSquareLength(double squareLength) {
        this.squareLength = squareLength;
    }

    public double getWidth() {
        return this.squareLength;
    }

    public double getHeight() {
        return this.squareLength;
    }

    public double getArea() {
        return this.squareLength * this.squareLength;
    }

    public double getPerimeter() {
        return this.squareLength * 4;
    }

    @Override
    public String toString() {
        return "Длина стороны квадрата = " + squareLength + " Периметр квадрата = " + getPerimeter() + " Площадь квадрата = " + getArea();
    }

    @Override
    public boolean equals(Object square) {
        if (square == this) {
            return true;
        }
        if (square == null || square.getClass() != this.getClass()) {
            return false;
        }
        Square s = (Square) square;
        return s.squareLength == this.squareLength;
    }

    @Override
    public int hashCode() {
        final int prime = 37;
        int hash = 1;
        hash = prime * hash * Double.hashCode(squareLength);
        return hash;
    }
}
