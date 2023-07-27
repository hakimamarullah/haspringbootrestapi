package com.juaracoding.haspringbootrestapi.service.impl;
/*
IntelliJ IDEA 2022.2.2 (Community Edition)
Build #IC-222.4167.29, built on September 13, 2022
Runtime version: 17.0.4+7-b469.53 amd64
@Author hakim a.k.a. Hakim Amarullah
Java Developer
Created on 7/26/2023 8:49 PM
@Last Modified 7/26/2023 8:49 PM
Version 1.0
*/

import com.juaracoding.haspringbootrestapi.model.Department;
import com.juaracoding.haspringbootrestapi.model.dto.DepartmentDTO;
import com.juaracoding.haspringbootrestapi.repository.DepartmentRepository;
import com.juaracoding.haspringbootrestapi.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public Department addDepartment(DepartmentDTO departmentDTO) {
        Department department = new Department();
        department.setName(departmentDTO.getName());

       return departmentRepository.save(department);
    }

    @Override
    public List<Department> getAllDepartment() {
        return departmentRepository.findAll();
    }
}
