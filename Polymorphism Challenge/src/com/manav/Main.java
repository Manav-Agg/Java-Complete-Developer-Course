package com.manav;
class Car{
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name){
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
    }

    public int getCylinders(){
        return cylinders;
    }

    public String getName(){
        return name;
    }

    public String startEngine(){
        return "Car --> startEngine()";
    }

    public String accelerate(){
        return "Car --> accelerate()";
    }

    public String brake(){
        return "Car --> brake()";
    }
}

class Mitsubishi extends Car{
    public Mitsubishi(int cylinders, String name){
        super(cylinders, name);
    }

    public String startEngine(){
        return "Mitsubishi --> startEngine()";
    }

    public String accelerate(){
        return "Mitsubishi --> accelerate()";
    }

    public String brake(){
        return "Mitsubishi --> brake()";
    }
}

class Ford extends Car{
    public Ford(int cylinders, String name){
        super(cylinders, name);
    }

    public String startEngine(){
        return "Ford --> startEngine()";
    }

    public String accelerate(){
        return "Ford --> accelerate()";
    }

    public String brake(){
        return "Ford --> brake()";
    }
}

class Holden extends Car{
    public Holden(int cylinders, String name){
        super(cylinders, name);
    }

    public String startEngine(){
        return getClass().getSimpleName() + " --> startEngine()";
    }

    public String accelerate(){
        return getClass().getSimpleName() + " --> accelerate()";
    }

    public String brake(){
        return getClass().getSimpleName() + " --> brake()";
    }
}

public class Main {

    public static void main(String[] args) {
//	      We are going to go back to the car analogy.
//        Create a base class called car
//        It should have a few fields that would be appropriate for a generic car class.
//        engine, cylinders, wheels, etc.
//        Constructor should initialize cylinders (number of) and name, and set wheels to 4
//        and engine to true. Cylinders and names would be passed parameters.
//        Create appropriate getters.
//        Create some method like startEngine, accelerate and brake
//        show a massage for each in the base class
//        Now create 3 sub-classes for your favourite vehicles.
//        Override the appropriate methods to demonstrate polymorphism in use.
//        Put all classes in the one java file.

        Car car = new Car(8, "Base Car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Mitsubishi mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());

        Ford ford = new Ford(6, "Ford Falcon");
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());

        Holden holden = new Holden(6, "Holden Commodore");
        System.out.println(holden.startEngine());
        System.out.println(holden.accelerate());
        System.out.println(holden.brake());
    }
}