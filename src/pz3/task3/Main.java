package pz3.task3;

public class Main {
    public static void main(String[] args) {
        User example = new User();
        example.createQuery();
        User.Query query = new User().new Query();
        query.printToLog();

    }
}
