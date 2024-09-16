/*
 * / **
 *  Created by ThinhTN on 9/4/24, 3:36 PM
 *  Copyright (c) 2024 . All rights reserved.
 *  Last modified 9/4/24, 3:36 PM
 * /
 */

package vn.thinhtn.java.dependencyinjection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import vn.thinhtn.java.dependencyinjection.consumer.Consumer;
import vn.thinhtn.java.dependencyinjection.consumer.MyDIApplication;
import vn.thinhtn.java.dependencyinjection.injector.MessageServiceInjector;
import vn.thinhtn.java.dependencyinjection.service.MessageService;

public class MyDIApplicationJUnitTest {
    private MessageServiceInjector injector;

    @Before
    public void setUp() {
        //mock the injector with anonymous class
        injector = new MessageServiceInjector() {

            @Override
            public Consumer getConsumer() {
                //mock the message service
                return new MyDIApplication(new MessageService() {

                    @Override
                    public void sendMessage(String msg, String rec) {
                        System.out.println("Mock Message Service implementation");

                    }
                });
            }
        };
    }

    @Test
    public void test() {
        Consumer consumer = injector.getConsumer();
        consumer.processMessages("Hi Pankaj", "pankaj@abc.com");
    }

    @After
    public void tear() {
        injector = null;
    }
}
