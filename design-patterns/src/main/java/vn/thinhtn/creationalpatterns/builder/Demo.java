/*
 * / **
 *  Created by ThinhTN on 22:01, 15/09/2024
 *  Copyright (c) 2024 . All rights reserved.
 *  Last modified 21:53, 15/09/2024
 * /
 */

package vn.thinhtn.creationalpatterns.builder;

import vn.thinhtn.creationalpatterns.builder.builder.CarBuilder;
import vn.thinhtn.creationalpatterns.builder.builder.CarManualBuilder;
import vn.thinhtn.creationalpatterns.builder.cars.Car;
import vn.thinhtn.creationalpatterns.builder.cars.Manual;
import vn.thinhtn.creationalpatterns.builder.director.Director;

/**
 * Demo class. Everything comes together here.
 */
public class Demo {

    public static void main(String[] args) {
        Director director = new Director();

        // Director gets the concrete builder object from the client
        // (application code). That's because application knows better which
        // builder to use to get a specific product.
        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);

        // The final product is often retrieved from a builder object, since
        // Director is not aware and not dependent on concrete builders and
        // products.
        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getCarType());

        CarManualBuilder manualBuilder = new CarManualBuilder();

        // Director may know several building recipes.
        director.constructSUV(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());
    }

}