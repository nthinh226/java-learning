/*
 * / **
 *  Created by ThinhTN on 8/29/24, 2:32 PM
 *  Copyright (c) 2024 . All rights reserved.
 *  Last modified 8/29/24, 2:32 PM
 * /
 */

package vn.thinhtn.design.adapter;

public class SocketObjectAdapterImpl implements SocketAdapter {
    // Using Composition for adapter pattern
    private Socket socket = new Socket();

    @Override
    public Volt get120Volt() {
        return socket.getVolt();
    }

    @Override
    public Volt get12Volt() {
        Volt v = socket.getVolt();
        return convertVolt(v, 10);
    }

    @Override
    public Volt get3Volt() {
        Volt v = socket.getVolt();
        return convertVolt(v, 40);
    }

    private Volt convertVolt(Volt v, int i) {
        return new Volt(v.getVolts() / i);
    }
}
