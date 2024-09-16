/*
 * / **
 *  Created by ThinhTN on 9/4/24, 3:23 PM
 *  Copyright (c) 2024 . All rights reserved.
 *  Last modified 9/4/24, 3:23 PM
 * /
 */

package vn.thinhtn.java.legacy;

public class MyApplication {
    private EmailService email = new EmailService();

    public void processMessages(String msg, String rec) {
        // do some msg validation, manipulation login etc
        this.email.sendEmail(msg, rec);
    }
}
