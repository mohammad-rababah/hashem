package Q2022.B.Q1;

// section B Q1 e
public class Car {
    String color;
    int year;


    Engine engine; // this is composition example

    void changeEngin(Engine engine) {
        this.engine = engine;

    }


}
