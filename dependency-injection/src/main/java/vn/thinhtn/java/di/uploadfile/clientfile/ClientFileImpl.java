/*
 * / **
 *  Created by ThinhTN on 9/4/24, 4:25 PM
 *  Copyright (c) 2024 . All rights reserved.
 *  Last modified 9/4/24, 4:25 PM
 * /
 */

package vn.thinhtn.java.di.uploadfile.clientfile;

import vn.thinhtn.java.di.uploadfile.service.UploadFileService;

public class ClientFileImpl implements ClientFile {
    private final UploadFileService fileService;

    public ClientFileImpl(UploadFileService fileService) {
        this.fileService = fileService;
    }

    @Override
    public void processBase64File(String base64, String name) {
        this.fileService.uploadFile(base64.getBytes(), name);

    }

    @Override
    public void processFile(byte[] bytes, String name) {
        this.fileService.uploadFile(bytes, name);
    }
}
