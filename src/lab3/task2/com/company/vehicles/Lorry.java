package lab3.task2.com.company.vehicles;

import lab3.task2.com.company.details.Engine;
import lab3.task2.com.company.professions.Driver;

public class Lorry extends Car{
    public int carryingCapacity;
    public Lorry(String carMake, String autoClass, double weight, int enginePower, int carryingCapacity){
        super(carMake, autoClass, weight, enginePower);
        this.carryingCapacity = carryingCapacity;
    }

}
