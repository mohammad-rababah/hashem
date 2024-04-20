package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.radius = 5;
        printArea(circle);

        Square square = new Square();// default constructor
        square.side = 5;
        printArea(square);
    }
    // polymorphism
    public static void printArea(Shape shape) {
        shape.calculateArea();
        System.out.println(shape.area);
    }

}
