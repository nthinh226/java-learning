/*
 * / **
 *  Created by ThinhTN on 9/4/24, 3:32 PM
 *  Copyright (c) 2024 . All rights reserved.
 *  Last modified 9/4/24, 3:32 PM
 * /
 */

package vn.thinhtn.java.dependencyinjection.injector;

import vn.thinhtn.java.dependencyinjection.consumer.Consumer;
import vn.thinhtn.java.dependencyinjection.consumer.MyDIApplication;
import vn.thinhtn.java.dependencyinjection.service.SMSServiceImpl;

public class SMSServiceInjector implements MessageServiceInjector {

    @Override
    public Consumer getConsumer() {
        return new MyDIApplication(new SMSServiceImpl());
    }

}
