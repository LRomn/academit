package ru.nsk.hgg20182.lelikov;

public class Square implements Shapes{
    private double squareLength;

    public Square (double squareLength){
        this.squareLength = squareLength;
    }

    public double getSquareLength() {
        return squareLength;
    }

    public void setSquareLength(double squareLength){
        this.squareLength = squareLength;
    }

    public double getWidth(){
        return this.squareLength;
    }

    public double getHeight() {
        return this.squareLength;
    }

    public double getArea() {
        return this.squareLength * this.squareLength;
    }

    public double getPerimeter(){
        return this.squareLength * 4;
    }

}
