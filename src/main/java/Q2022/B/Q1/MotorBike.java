package Q2022.B.Q1;

// section B Q1 b
public class MotorBike implements Vehicle {
    private int speed;

    public void accelerate(int speed) {
        this.speed += speed;
    }

    public void decelerate(int speed) {
        this.speed -= speed;
    }

}
