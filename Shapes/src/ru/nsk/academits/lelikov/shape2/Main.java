package ru.nsk.academits.lelikov.shape2;

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

        Arrays.sort(shapesArray, new ShapesSortByAreaComparator());

        System.out.println("Фигура с наибольшей площадью: ");
        System.out.println("Площадь: " + shapesArray[shapesArray.length - 1].getArea());
        System.out.println("Периметр: " + shapesArray[shapesArray.length - 1].getPerimeter());
        System.out.println("Высота фигуры =  " + shapesArray[shapesArray.length - 1].getHeight());
        System.out.println("Ширина фигуры =  " + shapesArray[shapesArray.length - 1].getWidth());

        System.out.println();

        Arrays.sort(shapesArray, new ShapesSortByPerimeterComparator());

        System.out.println("Фигура с вторым по велечине периметром: ");
        System.out.println("Площадь: " + shapesArray[shapesArray.length - 2].getArea());
        System.out.println("Периметр: " + shapesArray[shapesArray.length - 2].getPerimeter());
        System.out.println("Высота фигуры =  " + shapesArray[shapesArray.length - 2].getHeight());
        System.out.println("Ширина фигуры =  " + shapesArray[shapesArray.length - 2].getWidth());
    }
}