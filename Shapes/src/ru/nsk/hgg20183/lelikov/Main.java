package ru.nsk.hgg20183.lelikov;

import ru.nsk.hgg20182.lelikov.*;


public class Main {
    public static void main(String[] args) {
        Shapes[] shapesArray = new Shapes[12];
        shapesArray[0] = new Square(2);
        shapesArray[1] = new Square(4);
        shapesArray[2] = new Square(6);
        shapesArray[3] = new Rectangle(4, 2);
        shapesArray[4] = new Rectangle(1, 3);
        shapesArray[5] = new Rectangle(2, 5);
        shapesArray[6] = new Triangle(1, 2, 3, 4, 5, 6);
        shapesArray[7] = new Triangle(2, 1, 3, 2, 4, 1);
        shapesArray[8] = new Triangle(4, 2, 1, 4, 3, 2);
        shapesArray[9] = new Circle(2);
        shapesArray[10] = new Circle(3);
        shapesArray[11] = new Circle(5);
    }
}
