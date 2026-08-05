package com.umb.taller;

import com.umb.taller.domain.Car;
import com.umb.taller.domain.Engine;
import com.umb.taller.domain.Garage;

public class Main {
    public static void main(String[] args) {
        System.out.println("Proyecto Taller Programación UMB 2026 - Demo POO");

        Engine e1 = new Engine(120);
        Car car1 = new Car("Sedan", e1, 4);

        Engine e2 = new Engine(250);
        Car car2 = new Car("Coupe", e2, 2);

        Garage garage = new Garage();
        garage.park(car1);
        garage.park(car2);

        System.out.println("\nInformación de vehículos:");
        for (var v : garage.getVehicles()) {
            v.info();
            System.out.println();
        }

        System.out.println("Arrancando todos los vehículos (polimorfismo en acción):");
        garage.startAll();
    }
}