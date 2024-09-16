/*
 * / **
 *  Created by ThinhTN on 9/4/24, 3:30 PM
 *  Copyright (c) 2024 . All rights reserved.
 *  Last modified 9/4/24, 3:30 PM
 * /
 */

package vn.thinhtn.java.dependencyinjection.consumer;

import vn.thinhtn.java.dependencyinjection.service.MessageService;

public class MyDIApplication implements Consumer {
    private MessageService service;

    public MyDIApplication(MessageService svc) {
        this.service = svc;
    }

    @Override
    public void processMessages(String msg, String rec) {
        //do some msg validation, manipulation logic etc
        this.service.sendMessage(msg, rec);
    }
}
