package org.example.company;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Car {
    private boolean engine;
    private int cylinders;
    private  String name;
    private int wheels;
    private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String toString(){
        return name + ", " + cylinders;
    }


    public boolean equals(Object car) {

        if(((Car) car).equals(name) && ((Car) car).cylinders == cylinders){
            return true;
        }else{
            return false;
        }
    }

    public String startEngine(){
        System.out.println("the Car's engine is starting");
        LOGGER.log(Level.ALL, getClass().getSimpleName());
        return "the car's engine is starting";
    }
    public String accelerate(){
        System.out.println("the Car is accelerating");
        LOGGER.log(Level.ALL, getClass().getSimpleName());
        return "the car is accelerating";
    }
    public String brake(){
        System.out.println("the Car is braking");
        LOGGER.log(Level.ALL, getClass().getSimpleName());
        return "the car is braking";
    }
}
