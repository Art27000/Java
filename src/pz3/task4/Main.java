package pz3.task4;

public class Main {
    public static void main(String[] args) {
        Food food = new Food();
        Cookable cookable = new Cookable() {
            @Override
            public void cook(String str) {
                System.out.println("This is our string: " + str);
            }
        };
        food.prepare(cookable, "HI");
    }
}
