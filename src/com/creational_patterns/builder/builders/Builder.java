package com.creational_patterns.builder.builders;

import com.creational_patterns.builder.components.Engine;
import com.creational_patterns.builder.components.GPSNavigator;
import com.creational_patterns.builder.components.Transmission;
import com.creational_patterns.builder.components.TripComputer;
import com.creational_patterns.builder.product.CarType;

public interface Builder {
    void setCarType(CarType carType);

    void setSeats(int seats);

    void setEngine(Engine engine);

    void setTransmission(Transmission transmission);

    void setTripComputer(TripComputer tripComputer);

    void setGPSNavigator(GPSNavigator gpsNavigator);
}
