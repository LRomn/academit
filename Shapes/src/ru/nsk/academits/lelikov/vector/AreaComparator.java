package ru.nsk.academits.lelikov.vector;

import ru.nsk.academits.lelikov.shape.Shape;

import java.util.Comparator;

public class AreaComparator implements Comparator<Shape> {

    @Override
    public int compare(Shape shapes1, Shape shapes2) {
        double area1 = shapes1.getArea();
        double area2 = shapes2.getArea();
        return Double.compare(area1, area2);
    }
}