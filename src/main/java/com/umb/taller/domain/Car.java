package com.umb.taller.domain;

public class Car extends Vehicle {
    private int doors;

    public Car(String model, Engine engine, int doors) {
        super(model, engine);
        this.doors = doors;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    @Override
    public void start() { // Inheritance + Polymorphism: concrete implementation
        System.out.println("Car '" + getModel() + "' starting with " + getEngine().getHorsepower() + " HP");
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Doors: " + doors);
    }
}
