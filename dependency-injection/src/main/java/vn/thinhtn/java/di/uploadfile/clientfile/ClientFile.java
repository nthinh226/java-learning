/*
 * / **
 *  Created by ThinhTN on 9/4/24, 4:23 PM
 *  Copyright (c) 2024 . All rights reserved.
 *  Last modified 9/4/24, 4:23 PM
 * /
 */

package vn.thinhtn.java.di.uploadfile.clientfile;

public interface ClientFile {
    void processBase64File(String base64, String name);

    void processFile(byte[] bytes, String name);
}
