package com.creational_patterns.builder;

import com.creational_patterns.builder.builders.Builder;
import com.creational_patterns.builder.builders.CarBuilder;
import com.creational_patterns.builder.builders.ManualBuilder;
import com.creational_patterns.builder.derector.Director;
import com.creational_patterns.builder.product.Car;
import com.creational_patterns.builder.product.Manual;

public class Demo {
    public static void main(String[] args) {
        Director director = new Director();
        CarBuilder carBuilder = new CarBuilder();

        director.constructSportsCar(carBuilder);

        Car car = carBuilder.getResult();
        car.setFuel(111);
        System.out.println(car.getEngine().getMileage());
        car.getTripComputer().showStatus();
        car.getEngine().on();
        car.getEngine().go(20.12);
        car.getTripComputer().showFuelLevel();
        car.getTripComputer().showStatus();
        car.getEngine().off();
        System.out.println(car.getEngine().getMileage());
        car.getTripComputer().showStatus();


        System.out.println("=====================");

        ManualBuilder manualBuilder = new ManualBuilder();
        director.constructSUV(manualBuilder);
        Manual manual = manualBuilder.getResult();
        System.out.println(manual.print());


    }
}
