package com.fatorymethod.logistics;

public class ShipLogistics extends Logistics {
    @Override
    public Transport createTransport() {
        return new Ship();
    }
}
