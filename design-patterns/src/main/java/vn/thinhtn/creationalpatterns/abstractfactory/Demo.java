/*
 * / **
 *  Created by ThinhTN on 19:42, 15/09/2024
 *  Copyright (c) 2024 . All rights reserved.
 *  Last modified 19:42, 15/09/2024
 * /
 */

package vn.thinhtn.creationalpatterns.abstractfactory;

import vn.thinhtn.creationalpatterns.abstractfactory.app.Application;
import vn.thinhtn.creationalpatterns.abstractfactory.factories.GUIFactory;
import vn.thinhtn.creationalpatterns.abstractfactory.factories.MacOSFactory;
import vn.thinhtn.creationalpatterns.abstractfactory.factories.WindowsFactory;

/**
 * Demo class. Everything comes together here.
 */
public class Demo {

    /**
     * Application picks the factory type and creates it in run time (usually at
     * initialization stage), depending on the configuration or environment
     * variables.
     */
    private static Application configureApplication() {
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
        } else {
            factory = new WindowsFactory();
        }
        app = new Application(factory);
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}