/*
 * / **
 *  Created by ThinhTN on 8/29/24, 3:31 PM
 *  Copyright (c) 2024 . All rights reserved.
 *  Last modified 8/29/24, 3:31 PM
 * /
 */

package vn.thinhtn.design.test;

import vn.thinhtn.design.proxy.CommandExecutor;
import vn.thinhtn.design.proxy.CommandExecutorProxy;

public class ProxyPatternTest {
    public static void main(String[] args) {
        CommandExecutor executor = new CommandExecutorProxy("thinhtn", "wrong_pwd");
        try {
            executor.runCommand("ls -ltr");
            executor.runCommand("rm -rf abc.pdf");
        } catch (Exception e) {
            System.out.println("Exception Message: " + e.getMessage());
        }

    }
}
