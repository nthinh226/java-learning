/*
 * / **
 *  Created by ThinhTN on 9/4/24, 3:31 PM
 *  Copyright (c) 2024 . All rights reserved.
 *  Last modified 9/4/24, 3:31 PM
 * /
 */

package vn.thinhtn.java.dependencyinjection.injector;

import vn.thinhtn.java.dependencyinjection.consumer.Consumer;

public interface MessageServiceInjector {
    Consumer getConsumer();

}
