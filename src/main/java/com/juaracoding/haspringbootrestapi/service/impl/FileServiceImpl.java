package com.juaracoding.haspringbootrestapi.service.impl;
/*
IntelliJ IDEA 2022.2.2 (Community Edition)
Build #IC-222.4167.29, built on September 13, 2022
Runtime version: 17.0.4+7-b469.53 amd64
@Author hakim a.k.a. Hakim Amarullah
Java Developer
Created on 7/26/2023 7:52 PM
@Last Modified 7/26/2023 7:52 PM
Version 1.0
*/

import com.juaracoding.haspringbootrestapi.service.FileService;
import com.juaracoding.haspringbootrestapi.utils.FileUtility;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
public class FileServiceImpl implements FileService {

    @Override
    public void upload(MultipartFile file) throws IOException {
        String filePath = StringUtils.cleanPath(file.getOriginalFilename());
        String uploadPath = "uploads/";
        FileUtility.uploadFile(uploadPath, filePath, file);
    }
}
