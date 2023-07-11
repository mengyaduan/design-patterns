package com.creational_patterns.abstractfactory;

/**
 * @author yameng.dym
 */
public class Application {
    private Transport transport;
    private Engine engine;
    private Operation operation;

    public Application(VehicleFactory vehicleFactory) {
        transport = vehicleFactory.createTransport();
        engine = vehicleFactory.createEngine();
        operation = vehicleFactory.createOperation();
    }


    public void doTrans() {
        transport.showVehicleType();
        engine.start();
        operation.operate();
    }
}
