package ru.nsk.hgg2018.lelikov;

public class Range {
    private double from;
    private double to;

    public Range(double from, double to) {
        this.from = from;
        this.to = to;
    }

    public double getFrom() {
        return from;
    }

    public void setFrom(double from) {
        this.from = from;
    }

    public double getTo() {
        return to;
    }

    public void setTo(double to) {
        this.to = to;
    }

    public double getLength() {
        return this.to - this.from;
    }


    public boolean isInside(double c) {
        return this.from <= c && c <= this.to;
    }

    public int arithmeticMean() {
        int a = (int) this.from;
        int b = (int) this.to;
        int count = 0;
        int sum = 0;
        int i = a;

        while (i <= b) {
            sum += i;
            ++count;
            ++i;
        }
        return sum / count;
    }

    public static void main(String[] args) {
        Range a = new Range(2.0, 7.2);

        boolean result = a.isInside(3.4);

        System.out.println(a.getLength());
        System.out.println(result);
        System.out.println(a.arithmeticMean());
    }
}
