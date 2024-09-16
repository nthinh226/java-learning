/*
 * / **
 *  Created by ThinhTN on 8/29/24, 3:28 PM
 *  Copyright (c) 2024 . All rights reserved.
 *  Last modified 8/29/24, 3:28 PM
 * /
 */

package vn.thinhtn.design.proxy;

public class CommandExecutorImpl implements CommandExecutor {
    @Override
    public void runCommand(String cmd) throws Exception {
        //some heavy implementation
        Runtime.getRuntime().exec(cmd);
        System.out.println("'" + cmd + "' command executed.");
    }
}
