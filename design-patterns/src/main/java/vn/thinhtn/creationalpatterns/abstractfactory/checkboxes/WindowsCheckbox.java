/*
 * / **
 *  Created by ThinhTN on 19:40, 15/09/2024
 *  Copyright (c) 2024 . All rights reserved.
 *  Last modified 19:40, 15/09/2024
 * /
 */

package vn.thinhtn.creationalpatterns.abstractfactory.checkboxes;

public class WindowsCheckbox implements Checkbox {

    @Override
    public void paint() {
        System.out.println("You have created WindowsCheckbox.");
    }
}