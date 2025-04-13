package pz2.task9;

import java.util.Objects;

public class Animals {
    private static final int AGE = 100;
    private static final double WEIGHT = 120;
    private static final double HEIGHT = 200;

    private String name;
    private int age;
    private double weight;
    private double height;

    public Animals(){

    }

    public Animals(String name, int age, double weight, double height){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public void show(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight);
        System.out.println("Height: " + height);
        System.out.println();
    }

    public void compareNames(Animals ob1){
        if(this.name.equals(ob1.name)){
            System.out.println("Names are equal");
        }
        else System.out.println("Names are not equal") ;
    }

    public void compareWithConst(){
        if(age > AGE){
            System.out.println("More than " + AGE + " years");
        }
        else System.out.println("Less than " + AGE + " years");
        if(weight > WEIGHT){
            System.out.println("More than " + WEIGHT + " kg");
        }
        else System.out.println("Less than " + WEIGHT + " kg");
        if(height > HEIGHT){
            System.out.println("More than " + HEIGHT + " cm");
        }
        else System.out.println("Less than " + HEIGHT + " cm");
        System.out.println();
    }

}
