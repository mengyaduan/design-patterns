package com.creational_patterns.abstractfactory;

/**
 * @author yameng.dym
 */
public class FlightFactory implements VehicleFactory {
    @Override
    public Transport createTransport() {
        return new FlightTransport();
    }

    @Override
    public Engine createEngine() {
        return new FlightEngine();
    }

    @Override
    public Operation createOperation() {
        return new FlightOperation();
    }
}
