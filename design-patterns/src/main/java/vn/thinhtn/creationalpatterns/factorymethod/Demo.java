/*
 * / **
 *  Created by ThinhTN on 21:01, 15/09/2024
 *  Copyright (c) 2024 . All rights reserved.
 *  Last modified 21:01, 15/09/2024
 * /
 */

package vn.thinhtn.creationalpatterns.factorymethod;

import vn.thinhtn.creationalpatterns.factorymethod.logictics.Logistic;
import vn.thinhtn.creationalpatterns.factorymethod.logictics.ShipLogistic;
import vn.thinhtn.creationalpatterns.factorymethod.logictics.TruckLogistic;
import vn.thinhtn.creationalpatterns.factorymethod.transports.Transport;

public class Demo {
    public static void main(String[] args) {
        Logistic logistic = new TruckLogistic();
        Transport truckTransport = logistic.createTransport();
        truckTransport.deliver();
        logistic.planDelivery();

        logistic = new ShipLogistic();
        Transport shipTransport = logistic.createTransport();
        shipTransport.deliver();
        logistic.planDelivery();


    }
}
