/*
 * / **
 *  Created by ThinhTN on 20:56, 15/09/2024
 *  Copyright (c) 2024 . All rights reserved.
 *  Last modified 20:56, 15/09/2024
 * /
 */

package vn.thinhtn.creationalpatterns.factorymethod.logictics;

import vn.thinhtn.creationalpatterns.factorymethod.transports.Transport;

public abstract class Logistic {
    public abstract void planDelivery();

    public abstract Transport createTransport();
}
