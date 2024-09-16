/*
 * / **
 *  Created by ThinhTN on 21:42, 15/09/2024
 *  Copyright (c) 2024 . All rights reserved.
 *  Last modified 21:42, 15/09/2024
 * /
 */

package vn.thinhtn.creationalpatterns.builder.components;


import vn.thinhtn.creationalpatterns.builder.cars.Car;

/**
 * Just another feature of a car.
 */
public class TripComputer {

    private Car car;

    public void setCar(Car car) {
        this.car = car;
    }

    public void showFuelLevel() {
        System.out.println("Fuel level: " + car.getFuel());
    }

    public void showStatus() {
        if (this.car.getEngine().isStarted()) {
            System.out.println("Car is started");
        } else {
            System.out.println("Car isn't started");
        }
    }
}
