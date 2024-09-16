/*
 * / **
 *  Created by ThinhTN on 9/4/24, 3:32 PM
 *  Copyright (c) 2024 . All rights reserved.
 *  Last modified 9/4/24, 3:32 PM
 * /
 */

package vn.thinhtn.java.dependencyinjection;

import vn.thinhtn.java.dependencyinjection.consumer.Consumer;
import vn.thinhtn.java.dependencyinjection.injector.EmailServiceInjector;
import vn.thinhtn.java.dependencyinjection.injector.MessageServiceInjector;
import vn.thinhtn.java.dependencyinjection.injector.SMSServiceInjector;

public class MyMessageDITest {
    public static void main(String[] args) {
        String msg = "Hi Pankaj";
        String email = "pankaj@abc.com";
        String phone = "4088888888";
        MessageServiceInjector injector = null;
        Consumer app = null;

        //Send email
        injector = new EmailServiceInjector();
        app = injector.getConsumer();
        app.processMessages(msg, email);

        //Send SMS
        injector = new SMSServiceInjector();
        app = injector.getConsumer();
        app.processMessages(msg, phone);
    }
}
