package lab3.task2.com.company;

import lab3.task2.com.company.details.Engine;
import lab3.task2.com.company.vehicles.Car;
import lab3.task2.com.company.professions.Driver;
import lab3.task2.com.company.vehicles.Lorry;
import lab3.task2.com.company.vehicles.SportCar;

public class Main {
    public static void main(String[] args) {
        Car mazda = new Car("MAZDA", "Medium car", 1.700, 130);
        Person mike = new Person("Mike", "Brown", "Johnson", 10, mazda);
        System.out.println(mazda);
        SportCar lamborghini = new SportCar("LAMBORGHINI", "Coupe", 1.200, 620);
        Person carl = new Person("Carl", "Waterson", "", 5, lamborghini);
        System.out.println(lamborghini);
    }
}
