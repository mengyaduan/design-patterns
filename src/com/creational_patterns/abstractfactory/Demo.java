package com.creational_patterns.abstractfactory;

import java.util.Random;

/**
 * @author yameng.dym
 */
public class Demo {

    public static void main(String[] args) {
        Application app;
        VehicleFactory factory;
        Random random = new Random();
        if (random.nextInt(10000) % 2 == 0) {
            factory = new CarFactory();
        } else {
            factory = new FlightFactory();
        }
        app = new Application(factory);
        app.doTrans();
    }
}
