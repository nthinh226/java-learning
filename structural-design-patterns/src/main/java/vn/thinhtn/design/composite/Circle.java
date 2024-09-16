/*
 * / **
 *  Created by ThinhTN on 8/29/24, 3:15 PM
 *  Copyright (c) 2024 . All rights reserved.
 *  Last modified 8/29/24, 3:15 PM
 * /
 */

package vn.thinhtn.design.composite;
// Leaf Object
public class Circle implements Shape {
    @Override
    public void draw(String fillColor) {
        System.out.println("Drawing Circle with color " + fillColor);
    }
}
