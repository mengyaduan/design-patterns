package com.creational_patterns.builder.builders;

import com.creational_patterns.builder.components.Engine;
import com.creational_patterns.builder.components.GPSNavigator;
import com.creational_patterns.builder.components.Transmission;
import com.creational_patterns.builder.components.TripComputer;
import com.creational_patterns.builder.product.CarType;
import com.creational_patterns.builder.product.Manual;

public class ManualBuilder implements Builder {
    private CarType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    @Override
    public void setCarType(CarType carType) {
        this.type = carType;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;

    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public Manual getResult() {
        return new Manual(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}
