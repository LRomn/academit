package ru.nsk.academits.lelikov.vector;

import ru.nsk.academits.lelikov.shape.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Shape[] shapesArray = {
                new Square(2),
                new Square(4),
                new Square(6),
                new Rectangle(4, 2),
                new Rectangle(1, 3),
                new Rectangle(2, 5),
                new Triangle(1, 2, 3, 4, 5, 6),
                new Triangle(2, 1, 3, 2, 4, 1),
                new Triangle(4, 2, 1, 4, 3, 2),
                new Circle(2),
                new Circle(3),
                new Circle(5)
        };

        Arrays.sort(shapesArray, new AreaComparator());

        Shape shape1 = shapesArray[shapesArray.length - 1];

        System.out.println("Фигура с наибольшей площадью: ");
        System.out.println("Площадь: " + shape1.getArea());
        System.out.println("Периметр: " + shape1.getPerimeter());
        System.out.println("Высота фигуры =  " + shape1.getHeight());
        System.out.println("Ширина фигуры =  " + shape1.getWidth());

        System.out.println();

        Arrays.sort(shapesArray, new PerimeterComparator());

        Shape shape2 = shapesArray[shapesArray.length - 2];

        System.out.println("Фигура с вторым по велечине периметром: ");
        System.out.println("Площадь: " + shape2.getArea());
        System.out.println("Периметр: " + shape2.getPerimeter());
        System.out.println("Высота фигуры =  " + shape2.getHeight());
        System.out.println("Ширина фигуры =  " + shape2.getWidth());
    }
}