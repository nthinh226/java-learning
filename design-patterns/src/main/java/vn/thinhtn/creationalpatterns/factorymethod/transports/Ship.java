/*
 * / **
 *  Created by ThinhTN on 20:53, 15/09/2024
 *  Copyright (c) 2024 . All rights reserved.
 *  Last modified 20:53, 15/09/2024
 * /
 */

package vn.thinhtn.creationalpatterns.factorymethod.transports;

public class Ship implements Transport{
    @Override
    public void deliver() {
        System.out.println("Deliver by sea in a container");
    }
}
