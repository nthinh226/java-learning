/*
 * / **
 *  Created by ThinhTN on 8/29/24, 3:28 PM
 *  Copyright (c) 2024 . All rights reserved.
 *  Last modified 8/29/24, 3:28 PM
 * /
 */

package vn.thinhtn.design.proxy;

public class CommandExecutorProxy implements CommandExecutor {
    private boolean isAdmin;
    private CommandExecutor executor;

    public CommandExecutorProxy(String user, String pwd) {
        if ("thinhtn".equals(user) && "1".equals(pwd)) isAdmin = true;
        executor = new CommandExecutorImpl();
    }

    @Override
    public void runCommand(String cmd) throws Exception {
        if (isAdmin) {
            executor.runCommand(cmd);
        } else {
            if (cmd.trim().startsWith("rm")) {
                throw new Exception("rm command is not allowed for non-admin users.");
            } else {
                executor.runCommand(cmd);
            }
        }
    }
}
