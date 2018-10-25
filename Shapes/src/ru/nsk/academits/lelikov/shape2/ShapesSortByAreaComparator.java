package ru.nsk.academits.lelikov.shape2;

import ru.nsk.academits.lelikov.shape.Shape;

import java.util.Comparator;

public class ShapesSortByAreaComparator implements Comparator<Shape> {

    @Override
    public int compare(Shape shapes1, Shape shapes2) {
        double area1 = shapes1.getArea();
        double area2 = shapes2.getArea();
        return Double.compare(area1, area2);
    }
}








