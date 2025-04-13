package lab3.task2.com.company.vehicles;

import lab3.task2.com.company.details.Engine;
import lab3.task2.com.company.professions.Driver;

public class Car {
    public String carMake;
    public String autoClass;
    public double weight;
    public Driver dr;
    public Engine eng;

    public void start(){
        System.out.println("Поехали!");
    }
    public void stop(){
        System.out.println("Останаливаемся");
    }
    public void turnRight(){
        System.out.println("Поворот направо");
    }
    public void turnLeft(){
        System.out.println("Поворот налево");
    }

    public void ToString(){
        System.out.println(
                "Car info:\n" +
                "CAR MAKE: " + carMake + "\n" +
                "AUTO CLASS: " + autoClass + "\n" +
                "WEIGHT: " + weight + "\n" +
                "DRIVER: " + dr + "\n" +
                "MOTOR: " + eng + "\n"
        );
    }
}
