package com.Constructors;

public class Bike {

    String bname;
    String bmodel;
    String color;
    double price;
    int mileage;

    // 5-arg constructor (MAIN constructor)
    Bike(String bname, String bmodel, String color, double price, int mileage) {
        this.bname = bname;
        this.bmodel = bmodel;
        this.color = color;
        this.price = price;
        this.mileage = mileage;
    }

    // 4-arg constructor
    Bike(String bname, String bmodel, String color, double price) {
        this(bname, bmodel, color, price, 10);  // 
        System.out.println("4-arg constructor");
    }

    // 3-arg constructor
    Bike(String bname, String bmodel, String color) {
        this(bname, bmodel, color, 300000); // default price
        System.out.println("3-arg constructor");
    }

    // 2-arg constructor
    Bike(String bname, String bmodel) {
        this(bname, bmodel, "black"); // default color
        System.out.println("2-arg constructor");
    }

    // 1-arg constructor
    Bike(String bname) {
        this(bname, "FZ"); // default model
        System.out.println("1-arg constructor");
    }

    // no-arg constructor
    Bike() {
        this("Unknown"); // default name
        System.out.println("no-arg constructor");
    }

    

    public static void main(String[] args) {

        System.out.println("Main method started\n");

        Bike b1 = new Bike();
        b1.show();

        Bike b2 = new Bike("FZ");
        b2.show();

        Bike b3 = new Bike("FZ", "V2");
        b3.show();

        Bike b4 = new Bike("FZ", "V3", "Blue");
        b4.show();

        Bike b5 = new Bike("FZ", "V4", "Red", 150000);
        b5.show();

        Bike b6 = new Bike("FZ", "V5", "Black", 200000, 55);
        b6.show();
    }
    void show() {
        System.out.println("Name: " + bname);
        System.out.println("Model: " + bmodel);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
        System.out.println("Mileage: " + mileage);
        System.out.println("----------------------");
    }
}
