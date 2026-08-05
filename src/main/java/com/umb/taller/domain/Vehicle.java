package com.umb.taller.domain;

public abstract class Vehicle {
    private String model;
    private Engine engine;

    public Vehicle(String model, Engine engine) {
        this.model = model;
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public abstract void start(); // Abstraction: common contract for all vehicles

    public void info() {
        System.out.println("Model: " + model);
        if (engine != null) engine.info();
    }
}
