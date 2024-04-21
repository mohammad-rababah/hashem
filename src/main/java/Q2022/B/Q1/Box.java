package Q2022.B.Q1;

// section B Q1 d
public class Box {
    int length;
    int width;
    int height;

    public Box(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Box)) {
            return false;
        }
        boolean lengthEquals = this.length == ((Box) obj).length;
        boolean widthEquals = this.width == ((Box) obj).width;
        boolean heightEquals = this.height == ((Box) obj).height;

        return lengthEquals && widthEquals && heightEquals;
    }
}
