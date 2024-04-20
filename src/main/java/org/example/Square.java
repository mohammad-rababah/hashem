package org.example;

public class Square extends Shape{
    double side;

    void calculateArea(){
        area = side * side;
    }
    Square(){
       side = 1;
    }
    Square(double side){
        this.side = side;
    }
}
