package pz3.task3;

public class User {
    private String login = "arttest";
    private String password = "12345";

    public class Query {
        protected void printToLog(){
            System.out.println("User with:");
            System.out.println("LOGIN: " + login);
            System.out.println("PASSWORD: " + password);
            System.out.println("---Has left a request---\n");
        }
    }

    public void createQuery(){
        Query query = new Query();
        query.printToLog();
    }
}
