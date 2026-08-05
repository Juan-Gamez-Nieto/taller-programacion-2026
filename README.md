# Guia-1-taller-de-programacion
## Step 6: GitHub Copilot Code Review & Critical Evaluation

### 1. Copilot `/review` Output
```text
Quick Summary:
Files: Engine.java, Vehicle.java, Car.java, Garage.java, Main.java

OOP Pillars Demonstrated:
- Abstraction: Vehicle (abstract class).
- Encapsulation: Private fields + getters/setters (Engine, Vehicle).
- Inheritance: Car extends Vehicle.
- Polymorphism: Garage.startAll() calls start() on Vehicle instances.
- Additional: Composition (Vehicle has an Engine).

Observations & Recommendations:
- Null-safety: Car.start() assumes getEngine() is not null; validate or use Objects.requireNonNull(engine) in Vehicle constructor.
- Optional Immutability: Make Engine.horsepower final and remove setter if horsepower is immutable.
- toString / equals: Add toString() (and equals/hashCode if stored in comparison-based collections).
- Logging: Use Logger instead of System.out.println for production scalability.
- Public API: Garage.getVehicles() returns an unmodifiable list (good practice).
- Java Compatibility: Usage of 'var' in Main requires JDK 10+ (ensure target environment matches).
- Testing: Add unit tests for Garage.park() and startAll().