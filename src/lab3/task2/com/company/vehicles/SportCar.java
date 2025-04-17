package lab3.task2.com.company.vehicles;

import lab3.task2.com.company.details.Engine;
import lab3.task2.com.company.professions.Driver;

public class SportCar extends Car {
    public final int MAX_SPEED = 290;

    public SportCar(String carMake, String autoClass, double weight, int enginePower){
        super(carMake, autoClass, weight, enginePower);
    }
}
