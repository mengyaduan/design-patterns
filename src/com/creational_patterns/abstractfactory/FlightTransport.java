package com.creational_patterns.abstractfactory;

/**
 * @author yameng.dym
 */
public class FlightTransport implements Transport {

    @Override
    public void showVehicleType() {
        System.out.println("deliver cargo by plane");
    }
}
