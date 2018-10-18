package ru.nsk.hgg20182.lelikov;

import java.util.Comparator;

public class ShapesSortByAreaComparator implements Comparator<Shapes> {

    @Override
    public int compare(Shapes shapes1, Shapes shapes2) {
        double area1 = shapes1.getArea();
        double area2 = shapes2.getArea();
        return Double.compare(area1, area2);
    }
}








