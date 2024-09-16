/*
 * / **
 *  Created by ThinhTN on 9/4/24, 4:29 PM
 *  Copyright (c) 2024 . All rights reserved.
 *  Last modified 9/4/24, 4:29 PM
 * /
 */

package vn.thinhtn.java.di.uploadfile.injector;

import vn.thinhtn.java.di.uploadfile.clientfile.ClientFile;
import vn.thinhtn.java.di.uploadfile.clientfile.ClientFileImpl;
import vn.thinhtn.java.di.uploadfile.service.Base64UploadFileImpl;

public class Base64ServiceInjector implements UploadFileServiceInjector {
    @Override
    public ClientFile getClientFile() {
        return new ClientFileImpl(new Base64UploadFileImpl());
    }
}
