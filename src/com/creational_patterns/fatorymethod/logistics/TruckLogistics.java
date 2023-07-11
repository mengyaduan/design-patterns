package com.creational_patterns.fatorymethod.logistics;

/**
 * @author yameng.dym
 */
public class TruckLogistics extends Logistics {

    @Override
    public Transport createTransport() {
        return new Truck();
    }
}
