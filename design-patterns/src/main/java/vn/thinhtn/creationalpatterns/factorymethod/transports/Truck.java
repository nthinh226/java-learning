/*
 * / **
 *  Created by ThinhTN on 20:52, 15/09/2024
 *  Copyright (c) 2024 . All rights reserved.
 *  Last modified 20:52, 15/09/2024
 * /
 */

package vn.thinhtn.creationalpatterns.factorymethod.transports;

public class Truck implements Transport{
    @Override
    public void deliver() {
        System.out.println("Deliver by land in a box");
    }
}
