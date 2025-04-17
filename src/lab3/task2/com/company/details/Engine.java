package lab3.task2.com.company.details;

public class Engine{
    protected int power;
    protected String manufacturer;

    public Engine(int power, String man){
        this.power = power;
        this.manufacturer = man;
    }

    public int getPower() {
        return power;
    }
    public String getManufacturer(){
        return manufacturer;
    }
}
