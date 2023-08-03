package com.juaracoding.haspringbootrestapi.core;
/*
IntelliJ IDEA 2022.2.2 (Community Edition)
Build #IC-222.4167.29, built on September 13, 2022
Runtime version: 17.0.4+7-b469.53 amd64
@Author hakim a.k.a. Hakim Amarullah
Java Developer
Created on 8/3/2023 8:05 PM
@Last Modified 8/3/2023 8:05 PM
Version 1.0
*/

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;

public interface IService<E> {
    public void mapColumn();
    //CRUD
    public Map<String,Object> save(E model, WebRequest request);
    public Map<String,Object> update(Long id, E model, WebRequest request);
    public Map<String, Object> delete(Long id, WebRequest request);
    public Map<String,Object> findAll(Pageable pageable, WebRequest request);
    public Map<String,Object> findByPage(Pageable pageable,WebRequest request,String columFirst,String valueFirst);
    public Map<String,Object> findById(Long id, WebRequest request);
    Page<E> getDataByValue(Pageable pageable, String paramColumn, String paramValue);
    List<E> getAllAkses();
    public Map<String, Object> uploadFile(List<E> listModel, MultipartFile multipartFile, WebRequest request);
    public List<E> dataToExport(WebRequest request,String columFirst,String valueFirst);
    List<E> getDataToExport(String paramColumn, String paramValue);
}
