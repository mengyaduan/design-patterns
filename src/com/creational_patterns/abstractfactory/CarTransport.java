package com.creational_patterns.abstractfactory;

/**
 * @author yameng.dym
 */
public class CarTransport implements Transport {

    @Override
    public void showVehicleType() {
        System.out.println("deliver cargo by car");
    }
}
