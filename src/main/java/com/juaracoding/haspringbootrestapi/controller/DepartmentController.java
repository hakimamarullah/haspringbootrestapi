package com.juaracoding.haspringbootrestapi.controller;
/*
IntelliJ IDEA 2022.2.2 (Community Edition)
Build #IC-222.4167.29, built on September 13, 2022
Runtime version: 17.0.4+7-b469.53 amd64
@Author hakim a.k.a. Hakim Amarullah
Java Developer
Created on 7/24/2023 9:07 PM
@Last Modified 7/24/2023 9:07 PM
Version 1.0
*/

import com.juaracoding.haspringbootrestapi.model.Department;
import com.juaracoding.haspringbootrestapi.dto.DepartmentDTO;
import com.juaracoding.haspringbootrestapi.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/departments")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping(value = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Map<String, Object>> createDepartment(@RequestBody final DepartmentDTO departmentDTO){
        Map<String, Object> res = new HashMap<>();
        res.put("message", "created");
        res.put("status", HttpStatus.CREATED.toString());
        res.put("data", departmentService.addDepartment(departmentDTO));

        return new ResponseEntity<>(res,HttpStatus.CREATED);
    }

    @GetMapping(value = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Department>> getAllDepartment() {
        return ResponseEntity.ok(departmentService.getAllDepartment());
    }
}