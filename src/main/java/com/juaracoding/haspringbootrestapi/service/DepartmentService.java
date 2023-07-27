package com.juaracoding.haspringbootrestapi.service;
/*
IntelliJ IDEA 2022.2.2 (Community Edition)
Build #IC-222.4167.29, built on September 13, 2022
Runtime version: 17.0.4+7-b469.53 amd64
@Author hakim a.k.a. Hakim Amarullah
Java Developer
Created on 7/26/2023 8:48 PM
@Last Modified 7/26/2023 8:48 PM
Version 1.0
*/

import com.juaracoding.haspringbootrestapi.model.Department;
import com.juaracoding.haspringbootrestapi.dto.DepartmentDTO;

import java.util.List;

public interface DepartmentService {
    Department addDepartment(DepartmentDTO departmentDTO);
    List<Department> getAllDepartment();
}
