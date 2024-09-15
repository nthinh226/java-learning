/*
 * / **
 *  Created by ThinhTN on 19:42, 15/09/2024
 *  Copyright (c) 2024 . All rights reserved.
 *  Last modified 19:42, 15/09/2024
 * /
 */

package vn.thinhtn.creationalpatterns.abstractfactory.app;

import vn.thinhtn.creationalpatterns.abstractfactory.buttons.Button;
import vn.thinhtn.creationalpatterns.abstractfactory.checkboxes.Checkbox;
import vn.thinhtn.creationalpatterns.abstractfactory.factories.GUIFactory;

/**
 * Factory users don't care which concrete factory they use since they work with
 * factories and products through abstract interfaces.
 */
public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
