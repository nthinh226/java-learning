/*
 * / **
 *  Created by ThinhTN on 19:41, 15/09/2024
 *  Copyright (c) 2024 . All rights reserved.
 *  Last modified 19:41, 15/09/2024
 * /
 */

package vn.thinhtn.creationalpatterns.abstractfactory.factories;

import vn.thinhtn.creationalpatterns.abstractfactory.buttons.Button;
import vn.thinhtn.creationalpatterns.abstractfactory.buttons.WindowsButton;
import vn.thinhtn.creationalpatterns.abstractfactory.checkboxes.Checkbox;
import vn.thinhtn.creationalpatterns.abstractfactory.checkboxes.WindowsCheckbox;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}