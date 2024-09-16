/*
 * / **
 *  Created by ThinhTN on 9/4/24, 3:28 PM
 *  Copyright (c) 2024 . All rights reserved.
 *  Last modified 9/4/24, 3:28 PM
 * /
 */

package vn.thinhtn.java.dependencyinjection.service;

public class SMSServiceImpl implements MessageService {
    @Override
    public void sendMessage(String msg, String rec) {
        //logic to send SMS
        System.out.println("SMS sent to " + rec + " with Message=" + msg);
    }
}
