package Q2022.B.Q1;

public class BoxMain {
    public static void main(String[] args) {
        Box box1 = new Box(1, 1, 3);
        Box box2 = new Box(2, 2, 3);
        if (box1.equals(box2)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }

    }
}
