package lab3.task2.com.company;

import lab3.task2.com.company.professions.Driver;
import lab3.task2.com.company.vehicles.Car;
import lab3.task2.com.company.vehicles.Lorry;

public class Person {
    protected Person(){
        System.out.print("Hi, I'm a person.");
    }
    protected Person(String firstName, String lastName, String patronymicName, int drivingExp, Lorry lorry){
        Driver dr = new Driver(firstName, lastName, patronymicName, drivingExp);
        dr.getValues();
    }
    protected Person(String firstName, String lastName, String patronymicName, int drivingExp, Car car){
        Driver dr = new Driver(firstName, lastName, patronymicName, drivingExp);
        car.dr = dr;
        dr.getValues();
    }
}
