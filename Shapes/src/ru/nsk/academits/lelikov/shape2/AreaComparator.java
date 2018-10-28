package ru.nsk.academits.lelikov.shape2;

import ru.nsk.academits.lelikov.shape.Shape;

import java.util.Comparator;

public class AreaComparator implements Comparator<Shape> {

    @Override
    public int compare(Shape shape1, Shape shape2) {
        double area1 = shape1.getArea();
        double area2 = shape2.getArea();
        return Double.compare(area1, area2);
    }
}