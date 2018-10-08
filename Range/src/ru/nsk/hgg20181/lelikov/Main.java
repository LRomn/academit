package ru.nsk.hgg20181.lelikov;

import ru.nsk.hgg2018.lelikov.Range;

import java.util.Scanner;

public class Main {
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
            System.out.println(intersectionInterval.getFrom() + " " + secondInterval.getTo());
        }

        System.out.println("Длина первого интервала");
        System.out.println(firstInterval.getLength());

        boolean result = firstInterval.isInside(e);
        if (result) {
            System.out.println("Точка c = " + e + " входит в первый интервал");
        } else {
            System.out.println("Точка c = " + e + " не входит в первый интервал");
        }

        Range[] unionInterval = firstInterval.getIntervalsUnion(secondInterval);
        if (intersectionInterval == null) {
            System.out.println("Объединения двух интервалов.");
            System.out.println("Массив объектов");
            System.out.println(" от " + unionInterval[0].getFrom() + " до " + unionInterval[0].getTo());
            System.out.println(" от " + unionInterval[1].getFrom() + " до " + unionInterval[1].getTo());
        } else {
            System.out.println("Объединение двух интервалов");
            System.out.println(" от " + unionInterval[0].getFrom() + " до " + unionInterval[0].getTo());
        }

        Range[] differenceInterval = firstInterval.getIntervalsDifference(secondInterval);
        System.out.println("Разность двух интервалов: ");
        if (differenceInterval == null) {
            System.out.println("интервалы равны");
        } else if (differenceInterval.length == 1) {
            System.out.println(" от " + differenceInterval[0].getFrom() + " до " + differenceInterval[0].getTo());
        } else {
            System.out.println(" от " + differenceInterval[0].getFrom() + " до " + differenceInterval[0].getTo());
            System.out.println(" от " + differenceInterval[1].getFrom() + " до " + differenceInterval[1].getTo());
        }
    }
}
