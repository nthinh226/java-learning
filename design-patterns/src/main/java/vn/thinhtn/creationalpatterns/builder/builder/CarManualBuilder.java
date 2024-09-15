/*
 * / **
 *  Created by ThinhTN on 21:46, 15/09/2024
 *  Copyright (c) 2024 . All rights reserved.
 *  Last modified 21:46, 15/09/2024
 * /
 */

package vn.thinhtn.creationalpatterns.builder.builder;

import vn.thinhtn.creationalpatterns.builder.cars.CarType;
import vn.thinhtn.creationalpatterns.builder.cars.Manual;
import vn.thinhtn.creationalpatterns.builder.components.Engine;
import vn.thinhtn.creationalpatterns.builder.components.GPSNavigator;
import vn.thinhtn.creationalpatterns.builder.components.Transmission;
import vn.thinhtn.creationalpatterns.builder.components.TripComputer;

/**
 * Unlike other creational patterns, Builder can construct unrelated products,
 * which don't have the common interface.
 * <p>
 * In this case we build a user manual for a car, using the same steps as we
 * built a car. This allows to produce manuals for specific car models,
 * configured with different features.
 */
public class CarManualBuilder implements Builder {
    private CarType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    @Override
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

    public Manual getResult() {
        return new Manual(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}