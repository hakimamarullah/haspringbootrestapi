package com.juaracoding.haspringbootrestapi.service;
/*
IntelliJ IDEA 2022.2.2 (Community Edition)
Build #IC-222.4167.29, built on September 13, 2022
Runtime version: 17.0.4+7-b469.53 amd64
@Author hakim a.k.a. Hakim Amarullah
Java Developer
Created on 7/26/2023 9:07 PM
@Last Modified 7/26/2023 9:07 PM
Version 1.0
*/

import com.juaracoding.haspringbootrestapi.model.Employee;
import com.juaracoding.haspringbootrestapi.model.dto.EmployeeDTO;

import java.util.List;

public interface EmployeeService {
    Employee addEmployee(EmployeeDTO employeeDTO) throws Exception;
    List<Employee> findEmployeeByFirstNameContains(String firstName);
    List<Employee> getAllEmployee();
}
