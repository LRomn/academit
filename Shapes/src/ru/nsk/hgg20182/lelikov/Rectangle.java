package ru.nsk.hgg20182.lelikov;

public class Rectangle implements Shapes {
    private double firstSideLength;
    private double secondSideLength;

    public Rectangle (double firstSideLength, double secondSideLength){
        this.firstSideLength = firstSideLength;
        this.secondSideLength = secondSideLength;
    }

    public double getFirstSideLength() {
        return firstSideLength;
    }

    public double getSecondSideLength() {
        return secondSideLength;
    }

    public void setFirstSideLength(double firstSideLength) {
        this.firstSideLength = firstSideLength;
    }

    public void setSecondSideLength(double secondSideLength) {
        this.secondSideLength = secondSideLength;
    }

    public double getWidth() {
        return Math.min(this.firstSideLength,this.secondSideLength);
    }

    public double getHeight() {
        return Math.max(this.firstSideLength,this.secondSideLength);
    }

    public double getArea() {
        return this.firstSideLength * this.secondSideLength;
    }

    public double getPerimeter() {
        return 2 * (this.firstSideLength + this.secondSideLength);
    }
}
