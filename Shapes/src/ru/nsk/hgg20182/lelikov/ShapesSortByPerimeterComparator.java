package ru.nsk.hgg20182.lelikov;

import java.util.Comparator;

public class ShapesSortByPerimeterComparator implements Comparator<Shapes> {

    @Override
    public int compare(Shapes perimeter1, Shapes perimeter2) {
        double area1 = perimeter1.getPerimeter();
        double area2 = perimeter2.getPerimeter();
        return Double.compare(area1, area2);
    }
}