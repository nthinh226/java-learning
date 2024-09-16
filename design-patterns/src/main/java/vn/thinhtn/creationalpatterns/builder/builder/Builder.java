/*
 * / **
 *  Created by ThinhTN on 21:40, 15/09/2024
 *  Copyright (c) 2024 . All rights reserved.
 *  Last modified 21:40, 15/09/2024
 * /
 */

package vn.thinhtn.creationalpatterns.builder.builder;

import vn.thinhtn.creationalpatterns.builder.cars.CarType;
import vn.thinhtn.creationalpatterns.builder.components.Engine;
import vn.thinhtn.creationalpatterns.builder.components.GPSNavigator;
import vn.thinhtn.creationalpatterns.builder.components.Transmission;
import vn.thinhtn.creationalpatterns.builder.components.TripComputer;

/**
 * Builder interface defines all possible ways to configure a product.
 */
public interface Builder {
    void setCarType(CarType type);

    void setSeats(int seats);

    void setEngine(Engine engine);

    void setTransmission(Transmission transmission);

    void setTripComputer(TripComputer tripComputer);

    void setGPSNavigator(GPSNavigator gpsNavigator);
}