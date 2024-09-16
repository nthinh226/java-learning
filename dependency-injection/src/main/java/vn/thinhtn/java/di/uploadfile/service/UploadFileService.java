/*
 * / **
 *  Created by ThinhTN on 9/4/24, 4:08 PM
 *  Copyright (c) 2024 . All rights reserved.
 *  Last modified 9/4/24, 4:08 PM
 * /
 */

package vn.thinhtn.java.di.uploadfile.service;

public interface UploadFileService {
    void uploadFile(byte[] filebytes, String name);
}
