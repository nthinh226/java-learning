/*
 * / **
 *  Created by ThinhTN on 21:45, 15/09/2024
 *  Copyright (c) 2024 . All rights reserved.
 *  Last modified 21:45, 15/09/2024
 * /
 */

package vn.thinhtn.creationalpatterns.builder.builder;

import vn.thinhtn.creationalpatterns.builder.cars.Car;
import vn.thinhtn.creationalpatterns.builder.cars.CarType;
import vn.thinhtn.creationalpatterns.builder.components.Engine;
import vn.thinhtn.creationalpatterns.builder.components.GPSNavigator;
import vn.thinhtn.creationalpatterns.builder.components.Transmission;
import vn.thinhtn.creationalpatterns.builder.components.TripComputer;

public class CarBuilder implements Builder {
    private CarType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    public void setCarType(CarType type) {
        this.type = type;
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

    public Car getResult() {
        return new Car(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}
