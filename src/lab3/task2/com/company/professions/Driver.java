package lab3.task2.com.company.professions;

import lab3.task2.com.company.Person;

public class Driver extends Person {
    protected String firstName;
    protected String lastName;
    protected String patronymicName;
    protected int drivingExp;

    public Driver(){
        super();
        System.out.print(" And a driver\n");
    }

    public Driver(String firstName, String lastName, String patronymicName, int drivingExp){
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymicName = patronymicName;
        this.drivingExp = drivingExp;
    }
    public void getValues(){
        System.out.println(
                "\nDRIVER INFO:\n" +
                        "FIRST NAME: " + firstName + "\n" +
                        "LAST NAME: " + lastName + "\n" +
                        "PATRONYMIC NAME: " + patronymicName + "\n" +
                        "DRIVING EXPERIENCE: " + drivingExp + "\n"
        );
    }

    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }

    public String getPatronymicName() {
        return patronymicName;
    }

    public int getDrivingExp() {
        return drivingExp;
    }


}
