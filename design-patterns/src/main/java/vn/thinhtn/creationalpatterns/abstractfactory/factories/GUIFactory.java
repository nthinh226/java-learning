/*
 * / **
 *  Created by ThinhTN on 19:40, 15/09/2024
 *  Copyright (c) 2024 . All rights reserved.
 *  Last modified 19:40, 15/09/2024
 * /
 */

package vn.thinhtn.creationalpatterns.abstractfactory.factories;

import vn.thinhtn.creationalpatterns.abstractfactory.buttons.Button;
import vn.thinhtn.creationalpatterns.abstractfactory.checkboxes.Checkbox;

public interface GUIFactory {
    Button createButton();

    Checkbox createCheckbox();
}
