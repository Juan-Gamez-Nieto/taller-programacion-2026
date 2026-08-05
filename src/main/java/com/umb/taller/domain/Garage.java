package com.umb.taller.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Garage {
    private List<Vehicle> vehicles = new ArrayList<>();

    public void park(Vehicle vehicle) { // Association: Garage associates with Vehicle
        vehicles.add(vehicle);
        System.out.println("Parked: " + vehicle.getModel());
    }

    public void startAll() { // Polymorphism: call start() on abstract Vehicle
        for (Vehicle v : vehicles) {
            v.start();
        }
    }

    public List<Vehicle> getVehicles() {
        return Collections.unmodifiableList(vehicles);
    }
}
