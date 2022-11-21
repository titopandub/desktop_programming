package org.example;

// Class
class Car {
    enum EngineStatus {START, STOP}
    // Property
    EngineStatus engineStatus = EngineStatus.STOP;

    // Method
    public void startEngine() {
        System.out.println("Start Engine!");
        this.engineStatus = EngineStatus.START;
    }

    // Method
    public void stopEngine() {
        System.out.println("Stop Engine!");
        this.engineStatus = EngineStatus.STOP;
    }

    // Method
    public String getEngineStatus() {
        return engineStatus.toString();
    }
}

// Class
class Cat {
    // Property
    String name;

    // Method
    public Cat(String name) {
        this.name = name;
    }

    // Method
    public void meow() {
        System.out.println(this.name + " Meowing!");
    }

    // Method
    public String getName() {
        return name;
    }
}

// Class
class Computer {
    enum Status {ON, OFF}
    // Property
    Status status = Status.OFF;

    // Method
    public void turnOnComputer() {
        System.out.println("Turn ON Computer!");
        this.status = Status.ON;
    }

    // Method
    public void turnOffComputer() {
        System.out.println("Turn OFF Computer!");
        this.status = Status.OFF;
    }

    // Method
    public String getStatus() {
        return this.status.toString();
    }
}

public class ClassExample {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Car myCar = new Car();
        myCar.startEngine();
        System.out.println(myCar.getEngineStatus());
        myCar.stopEngine();
        System.out.println(myCar.getEngineStatus());

        Cat kitty = new Cat("Kitty");
        kitty.meow();
        System.out.println(kitty.getName());

        Computer myComputer = new Computer();
        myComputer.turnOnComputer();
        System.out.println(myComputer.getStatus());
        myComputer.turnOffComputer();
        System.out.println(myComputer.getStatus());
    }
}