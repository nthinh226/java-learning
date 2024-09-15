/*
 * / **
 *  Created by ThinhTN on 20:59, 15/09/2024
 *  Copyright (c) 2024 . All rights reserved.
 *  Last modified 20:59, 15/09/2024
 * /
 */

package vn.thinhtn.creationalpatterns.factorymethod.logictics;

import vn.thinhtn.creationalpatterns.factorymethod.transports.Ship;
import vn.thinhtn.creationalpatterns.factorymethod.transports.Transport;

public class ShipLogistic extends Logistic{
    @Override
    public void planDelivery() {
        System.out.println("Ship plan");
    }

    @Override
    public Transport createTransport() {
        return new Ship();
    }
}
