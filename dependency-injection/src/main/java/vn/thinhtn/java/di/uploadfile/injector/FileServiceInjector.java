/*
 * / **
 *  Created by ThinhTN on 9/4/24, 4:30 PM
 *  Copyright (c) 2024 . All rights reserved.
 *  Last modified 9/4/24, 4:30 PM
 * /
 */

package vn.thinhtn.java.di.uploadfile.injector;

import vn.thinhtn.java.di.uploadfile.clientfile.ClientFile;
import vn.thinhtn.java.di.uploadfile.clientfile.ClientFileImpl;
import vn.thinhtn.java.di.uploadfile.service.FileUploadFileImpl;

public class FileServiceInjector implements UploadFileServiceInjector {
    @Override
    public ClientFile getClientFile() {
        return new ClientFileImpl(new FileUploadFileImpl());
    }
}
