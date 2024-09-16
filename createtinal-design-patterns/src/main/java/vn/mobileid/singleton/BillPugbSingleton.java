/*
 * / **
 *  Created by ThinhTN on 8/29/24, 2:24 PM
 *  Copyright (c) 2024 . All rights reserved.
 *  Last modified 8/29/24, 10:07 AM
 * /
 */

package vn.mobileid.singleton;

public class BillPugbSingleton {
    private BillPugbSingleton() {
    }

    private static class SingletonHelper {
        private static final BillPugbSingleton INSTANCE = new BillPugbSingleton();
    }

    public static BillPugbSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }
}
