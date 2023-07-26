package com.juaracoding.haspringbootrestapi.controller;
/*
IntelliJ IDEA 2022.2.2 (Community Edition)
Build #IC-222.4167.29, built on September 13, 2022
Runtime version: 17.0.4+7-b469.53 amd64
@Author hakim a.k.a. Hakim Amarullah
Java Developer
Created on 7/26/2023 7:48 PM
@Last Modified 7/26/2023 7:48 PM
Version 1.0
*/


import com.juaracoding.haspringbootrestapi.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping(value = "/hello")
public class HelloController {

    @Autowired
    private FileService fileService;

    @PostMapping(value = "/upload")
    public String upload(@RequestParam(value = "file")MultipartFile file) {
        try {
            fileService.upload(file);
            return String.format("%s uploaded!", file.getOriginalFilename());
        } catch (IOException ioe){
            return String.format("Failed to upload files %s", ioe.getMessage());
        }
    }
}
