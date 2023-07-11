package com.creational_patterns.abstractfactory;

/**
 * @author yameng.dym
 */
public class CarFactory implements VehicleFactory {
    @Override
    public Transport createTransport() {
        return new CarTransport();
    }

    @Override
    public Engine createEngine() {
        return new CarEngine();
    }

    @Override
    public Operation createOperation() {
        return new CarOperation();
    }
}
