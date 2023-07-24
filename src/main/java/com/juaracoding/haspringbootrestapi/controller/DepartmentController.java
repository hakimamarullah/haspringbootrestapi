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
import com.juaracoding.haspringbootrestapi.model.Employee;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/department")
public class DepartmentController {

    @GetMapping(value = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public Department getDepartment(){
        Department department = new Department();
        department.setId("001");
        department.setName("IT");

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("1", "John", "Doe", new Date(), "john@example.com", "123456789", department));
        employees.add(new Employee("2", "Jane", "Smith", new Date(), "jane@example.com", "987654321", department));
        employees.add(new Employee("3", "Michael", "Johnson", new Date(), "michael@example.com", "111222333", department));
        employees.add(new Employee("4", "Emily", "Brown", new Date(), "emily@example.com", "444555666",department));
        employees.add(new Employee("5", "William", "Lee", new Date(), "william@example.com", "777888999", department));

        department.setEmployees(employees);
        return department;

    }

    @GetMapping(value = "/employees", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Employee> getEmployees() {
        Department department = new Department();
        department.setId("001");
        department.setName("IT");

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("1", "John", "Doe", new Date(), "john@example.com", "123456789", department));
        employees.add(new Employee("2", "Jane", "Smith", new Date(), "jane@example.com", "987654321", department));
        employees.add(new Employee("3", "Michael", "Johnson", new Date(), "michael@example.com", "111222333", department));
        employees.add(new Employee("4", "Emily", "Brown", new Date(), "emily@example.com", "444555666",department));
        employees.add(new Employee("5", "William", "Lee", new Date(), "william@example.com", "777888999", department));

        department.setEmployees(employees);
        return employees;
    }
}
