/*
 * / **
 *  Created by ThinhTN on 9/4/24, 4:09 PM
 *  Copyright (c) 2024 . All rights reserved.
 *  Last modified 9/4/24, 4:09 PM
 * /
 */

package vn.thinhtn.java.di.uploadfile.service;

public class Base64UploadFileImpl implements UploadFileService{
    @Override
    public void uploadFile(byte[] filebytes, String name) {
        System.out.println("Base64 upload file success");
    }
}
