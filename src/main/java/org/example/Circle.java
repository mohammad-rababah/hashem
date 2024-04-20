package org.example;

public class Circle extends Shape{
    double radius;

    void calculateArea(){
        area = 3.14 * radius * radius;
    }
    void calculateArea( int radius){
        area = 3.14 * radius * radius;
    }
    void calculateArea( double radius){
        area = 3.14 * radius * radius;
    }
}

