package com.juaracoding.haspringbootrestapi.service;
/*
IntelliJ IDEA 2022.2.2 (Community Edition)
Build #IC-222.4167.29, built on September 13, 2022
Runtime version: 17.0.4+7-b469.53 amd64
@Author hakim a.k.a. Hakim Amarullah
Java Developer
Created on 8/3/2023 9:51 PM
@Last Modified 8/3/2023 9:51 PM
Version 1.0
*/

import com.juaracoding.haspringbootrestapi.handler.ResponseHandler;
import com.juaracoding.haspringbootrestapi.model.TugasA;
import com.juaracoding.haspringbootrestapi.repository.TugasARepository;
import com.juaracoding.haspringbootrestapi.utils.ConstantMessage;
import jakarta.transaction.Transactional;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.WebRequest;

@Service
@Transactional
public class TugasAService{

    private TugasARepository tugasARepo;

    private String[] strExceptionArr = new String[2];



    public ResponseEntity<Object> save(TugasA tugasA, WebRequest request)
    {
        try{
            tugasARepo.save(tugasA);

        }catch (Exception e)
        {
            return new ResponseHandler().
                    generateResponse(ConstantMessage.ERROR_FAILED_CREATED,
                            HttpStatus.NOT_ACCEPTABLE,"","FE21001",request);
        }
        return new ResponseHandler().
                generateResponse(ConstantMessage.SUCCESS_CREATED,
                        HttpStatus.CREATED,"",null,request);
    }
}