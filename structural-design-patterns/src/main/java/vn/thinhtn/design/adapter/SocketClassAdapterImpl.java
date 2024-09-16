/*
 * / **
 *  Created by ThinhTN on 8/29/24, 2:31 PM
 *  Copyright (c) 2024 . All rights reserved.
 *  Last modified 8/29/24, 2:31 PM
 * /
 */

package vn.thinhtn.design.adapter;

public class SocketClassAdapterImpl extends Socket implements SocketAdapter {
    @Override
    public Volt get120Volt() {
        return getVolt();
    }

    @Override
    public Volt get12Volt() {
        Volt v = getVolt();
        return convertVolt(v, 10);
    }

    @Override
    public Volt get3Volt() {
        Volt v = getVolt();
        return convertVolt(v, 40);
    }

    private Volt convertVolt(Volt v, int i) {
        return new Volt(v.getVolts() / i);
    }
}
