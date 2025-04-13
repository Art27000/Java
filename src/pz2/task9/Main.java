package pz2.task9;

public class Main {
    public static void main(String[] args) {
        Animals cat = new Animals("Barsik",5, 5.0, 20.0);
        Animals dog = new Animals("Barsik", 7, 15.0, 40.0);
        dog.show();
        cat.show();
        cat.compareNames(dog);
        cat.compareWithConst();
    }
}
