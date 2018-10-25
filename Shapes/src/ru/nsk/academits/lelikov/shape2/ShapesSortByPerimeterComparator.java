package ru.nsk.academits.lelikov.shape2;

import ru.nsk.academits.lelikov.shape.Shape;

import java.util.Comparator;

public class ShapesSortByPerimeterComparator implements Comparator<Shape> {

    @Override
    public int compare(Shape perimeter1, Shape perimeter2) {
        double area1 = perimeter1.getPerimeter();
        double area2 = perimeter2.getPerimeter();
        return Double.compare(area1, area2);
    }
}