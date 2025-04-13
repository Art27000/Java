package pz2.task7;

public class Main {
    public static void main(String[] args) {
        Overload Square = new Overload();
        Overload Circle = new Overload();
        Overload Rectangle = new Overload();

        Square.count(1);
        Circle.count(1.0);
        Rectangle.count(1.0, 1.0);
    }
}