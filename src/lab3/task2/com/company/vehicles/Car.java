package lab3.task2.com.company.vehicles;

import lab3.task2.com.company.details.Engine;
import lab3.task2.com.company.professions.Driver;

public class Car {
    public String carMake;
    public String autoClass;
    public double weight;
    public Driver dr;
    public Engine eng;

    public Car(String carMake, String autoClass, double weight, int enginePower){
        this.carMake = carMake;
        this.autoClass = autoClass;
        this.weight = weight;
        this.eng = new Engine(enginePower, carMake);
    }


    public void setDr(Car car, Driver dr){
        car.dr = dr;
    }

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

    public String toString(){
        return
                "Car info:\n" +
                "CAR MAKE: " + carMake + "\n" +
                "AUTO CLASS: " + autoClass + "\n" +
                "WEIGHT: " + weight + "\n" +
                        "--------------------\n" +
                "DRIVER: " + dr.getFirstName() + "\n\t\t" + dr.getLastName() + "\n\t\t" + dr.getPatronymicName() + "\n\t\t" + dr.getDrivingExp() + "\n" +
                        "\n--------------------\n" +
                "MOTOR POWER: " + eng.getPower() + "\n" +
                "MOTOR MANUFACTURER: " + eng.getManufacturer() + "\n";
    }
}
