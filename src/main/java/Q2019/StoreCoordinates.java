package Q2019;

import java.util.Set;
import java.util.HashSet;

// 2019 Q2 part(a)
public class StoreCoordinates {
    public static void main(String[] args) {
        StoreCoordinates sn = new StoreCoordinates();
    }

    public StoreCoordinates() {
        Set<Coordinate> ts = new HashSet<>();
        ts.add(new Coordinate(1, 2));
        ts.add(new Coordinate(2, 1));
        ts.add(new Coordinate(1, 2));
        ts.add(new Coordinate(4, 3));
        for (Coordinate i : ts)
            i.print();

        Coordinate c1 = new Coordinate(1, 2);
        Coordinate c2 = new Coordinate(2, 1);
        System.out.println(c1.compareTo(c2));
    }
}

class Coordinate implements Comparable<Coordinate> {
    Integer x, y;

    public Coordinate(int xValue, int yValue) {
        x = xValue;
        y = yValue;
    }

    public void print() {
        System.out.print(x);
        System.out.println(y);
    }

    // 2019 Q2 part (b)
    public int compareTo(Coordinate ob) {
        if (x > ob.x) return -1;
        else if (x < ob.x) return 1;
        else return 0;
    }
}