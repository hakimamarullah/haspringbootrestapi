package com.juaracoding.haspringbootrestapi.controller;
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
import com.juaracoding.haspringbootrestapi.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;


    @PostMapping(value = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Map<String, Object>> createEmployee(@RequestBody final EmployeeDTO employeeDTO){
        Map<String, Object> res = new HashMap<>();
        try {
            Employee employee = employeeService.addEmployee(employeeDTO);
            res.put("message", "created");
            res.put("status", HttpStatus.CREATED);
            res.put("data", employee);

        } catch (Exception e) {
            res.put("message", e.getMessage());
            res.put("status", HttpStatus.INTERNAL_SERVER_ERROR);
            res.put("data", null);
            return new ResponseEntity<>(res, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(res,HttpStatus.CREATED);
    }
}
