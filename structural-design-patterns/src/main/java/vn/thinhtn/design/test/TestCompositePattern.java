/*
 * / **
 *  Created by ThinhTN on 8/29/24, 3:19 PM
 *  Copyright (c) 2024 . All rights reserved.
 *  Last modified 8/29/24, 3:19 PM
 * /
 */

package vn.thinhtn.design.test;

import vn.thinhtn.design.composite.Circle;
import vn.thinhtn.design.composite.Drawing;
import vn.thinhtn.design.composite.Shape;
import vn.thinhtn.design.composite.Triangle;

public class TestCompositePattern {
    public static void main(String[] args) {
        Shape tri = new Triangle();
        Shape tri1 = new Triangle();
        Shape cir = new Circle();

        Drawing drawing = new Drawing();
        drawing.add(tri);
        drawing.add(tri1);
        drawing.add(cir);

        drawing.draw("Red");

        drawing.clear();

        drawing.add(tri);
        drawing.add(cir);
        drawing.draw("Green");
    }
}
