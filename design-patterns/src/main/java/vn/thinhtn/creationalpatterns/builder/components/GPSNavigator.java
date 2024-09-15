/*
 * / **
 *  Created by ThinhTN on 21:42, 15/09/2024
 *  Copyright (c) 2024 . All rights reserved.
 *  Last modified 21:42, 15/09/2024
 * /
 */

package vn.thinhtn.creationalpatterns.builder.components;

/**
 * Just another feature of a car.
 */
public class GPSNavigator {
    private String route;

    public GPSNavigator() {
        this.route = "221b, Baker Street, London  to Scotland Yard, 8-10 Broadway, London";
    }

    public GPSNavigator(String manualRoute) {
        this.route = manualRoute;
    }

    public String getRoute() {
        return route;
    }
}