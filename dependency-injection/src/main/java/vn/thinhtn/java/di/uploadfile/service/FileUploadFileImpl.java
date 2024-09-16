/*
 * / **
 *  Created by ThinhTN on 9/4/24, 4:20 PM
 *  Copyright (c) 2024 . All rights reserved.
 *  Last modified 9/4/24, 4:20 PM
 * /
 */

package vn.thinhtn.java.di.uploadfile.service;

public class FileUploadFileImpl implements UploadFileService {
    @Override
    public void uploadFile(byte[] filebytes, String name) {
        System.out.println("File upload file success");
    }
}
