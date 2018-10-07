package ru.nsk.hgg2018.lelikov;

import java.util.Scanner;

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

    public Range getIntersection(Range secondInterval) {
        if (this.from >= secondInterval.to || this.to <= secondInterval.from) {
            return null;
        } else {
            return new Range(Math.max(this.from, secondInterval.from), Math.min(this.to, secondInterval.to));
        }
    }

    public Range[] getIntervalsUnion(Range secondInterval) {
        if (this.from >= secondInterval.to || this.to <= secondInterval.from) {
            return new Range[]{new Range(this.from,this.to), new Range(secondInterval.from,secondInterval.to)};
        } else {
            Range unionRange = new Range(Math.min(this.from, secondInterval.from), Math.max(this.to, secondInterval.to));
            return new Range[]{unionRange};
        }
    }

    public double getIntervalsDifference(Range firstInterval, Range secondInterval) {
        return firstInterval.getLength() - secondInterval.getLength();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задайте координаты первого интервала");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        System.out.println("Задайте координаты второго интервала");
        double c = scanner.nextDouble();
        double d = scanner.nextDouble();

        System.out.print("Укажите число ");
        double e = scanner.nextDouble();

        Range firstInterval = new Range(a, b);
        Range secondInterval = new Range(c, d);

        Range intersectionInterval = firstInterval.getIntersection(secondInterval);

        System.out.println("координаты интервала - пересечения");
        if (intersectionInterval == null) {
            System.out.println("Диапазоны не пересекаются");
        } else {
            System.out.println(intersectionInterval.from + " " + secondInterval.to);
        }

        System.out.println("Длина первого интервала");
        System.out.println(firstInterval.getLength());

        boolean result = firstInterval.isInside(e);
        if (result) {
            System.out.println("Точка c = " + e + " входит в первый интервал");
        } else {
            System.out.println("Точка c = " + e + " не входит в первый интервал");
        }

        Range[] array = firstInterval.getIntervalsUnion(secondInterval);
        if (intersectionInterval == null) {
            System.out.println("Массив объектов");
            System.out.println(" от " + array[0].getFrom() + " до " + array[0].getTo());
            System.out.println(" от " + array[1].getFrom() + " до " + array[1].getTo());
        } else {
            System.out.println("Результат объединения двух интервалов");
            System.out.println(" от " + array[0].getFrom() + " до " + array[0].getTo());
        }

        double differenceInterval = firstInterval.getIntervalsDifference(firstInterval, secondInterval);
        System.out.println("Разность двух интервалов");
        System.out.println(differenceInterval);
    }
}
