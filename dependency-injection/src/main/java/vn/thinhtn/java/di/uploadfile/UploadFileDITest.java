/*
 * / **
 *  Created by ThinhTN on 9/4/24, 4:31 PM
 *  Copyright (c) 2024 . All rights reserved.
 *  Last modified 9/4/24, 4:31 PM
 * /
 */

package vn.thinhtn.java.di.uploadfile;

import vn.thinhtn.java.di.uploadfile.clientfile.ClientFile;
import vn.thinhtn.java.di.uploadfile.injector.Base64ServiceInjector;
import vn.thinhtn.java.di.uploadfile.injector.FileServiceInjector;
import vn.thinhtn.java.di.uploadfile.injector.UploadFileServiceInjector;

public class UploadFileDITest {
    public static void main(String[] args) {
        String base64File = "123456789";
        byte[] bytes = "123456".getBytes();

        UploadFileServiceInjector uploadFileServiceInjector;
        ClientFile clientFile;

        // upload file byte array
        uploadFileServiceInjector = new FileServiceInjector();
        clientFile = uploadFileServiceInjector.getClientFile();
        clientFile.processFile(bytes, "File Bytes");

        // upload file base64
        uploadFileServiceInjector = new Base64ServiceInjector();
        clientFile = uploadFileServiceInjector.getClientFile();
        clientFile.processBase64File(base64File, "File Base64");

    }
}
