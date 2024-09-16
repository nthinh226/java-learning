/*
 * / **
 *  Created by ThinhTN on 21:48, 15/09/2024
 *  Copyright (c) 2024 . All rights reserved.
 *  Last modified 21:48, 15/09/2024
 * /
 */

package vn.thinhtn.creationalpatterns.builder.director;

import vn.thinhtn.creationalpatterns.builder.builder.Builder;
import vn.thinhtn.creationalpatterns.builder.cars.CarType;
import vn.thinhtn.creationalpatterns.builder.components.Engine;
import vn.thinhtn.creationalpatterns.builder.components.GPSNavigator;
import vn.thinhtn.creationalpatterns.builder.components.Transmission;
import vn.thinhtn.creationalpatterns.builder.components.TripComputer;

/**
 * Director defines the order of building steps. It works with a builder object
 * through common Builder interface. Therefore it may not know what product is
 * being built.
 */
public class Director {

    public void constructSportsCar(Builder builder) {
        builder.setCarType(CarType.SPORTS_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(3.0, 0));
        builder.setTransmission(Transmission.SEMI_AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }

    public void constructCityCar(Builder builder) {
        builder.setCarType(CarType.CITY_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(1.2, 0));
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }

    public void constructSUV(Builder builder) {
        builder.setCarType(CarType.SUV);
        builder.setSeats(4);
        builder.setEngine(new Engine(2.5, 0));
        builder.setTransmission(Transmission.MANUAL);
        builder.setGPSNavigator(new GPSNavigator());
    }
}