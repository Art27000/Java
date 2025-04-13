package pz3.task2;

public class Main {
    public static void main(String[] args) {
        Instrument[] mas = new Instrument[3];

        mas[0] = new Drum();
        mas[1] = new Guitar();
        mas[2] = new Tube();

        for (Instrument ma : mas) ma.play();
    }
}
