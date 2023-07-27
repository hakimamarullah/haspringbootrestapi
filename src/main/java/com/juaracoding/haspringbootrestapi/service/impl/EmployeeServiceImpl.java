package com.juaracoding.haspringbootrestapi.service.impl;
/*
IntelliJ IDEA 2022.2.2 (Community Edition)
Build #IC-222.4167.29, built on September 13, 2022
Runtime version: 17.0.4+7-b469.53 amd64
@Author hakim a.k.a. Hakim Amarullah
Java Developer
Created on 7/26/2023 9:08 PM
@Last Modified 7/26/2023 9:08 PM
Version 1.0
*/

import com.juaracoding.haspringbootrestapi.model.Department;
import com.juaracoding.haspringbootrestapi.model.Employee;
import com.juaracoding.haspringbootrestapi.dto.EmployeeDTO;
import com.juaracoding.haspringbootrestapi.repository.DepartmentRepository;
import com.juaracoding.haspringbootrestapi.repository.EmployeeRepository;
import com.juaracoding.haspringbootrestapi.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public Employee addEmployee(EmployeeDTO employeeDTO) throws Exception {
        Department department = departmentRepository.findDepartmentById(employeeDTO.getDepartmentId());
        Employee employee = new Employee();
        if (department == null) {
            throw new Exception("department not found");
        }
        employee.setEmail(employeeDTO.getEmail());
        employee.setFirstName(employeeDTO.getFirstName());
        employee.setLastName(employeeDTO.getLastName());
        employee.setBirthDay(employeeDTO.getBirthDay());
        employee.setPhone(employeeDTO.getPhone());
        employee.setDepartment(department);

        employeeRepository.save(employee);

        return employee;
    }

    @Override
    public List<Employee> findEmployeeByFirstNameContains(String firstName) {
        List<Employee> employees = employeeRepository.findByFirstNameContains(firstName);
        return employees;
    }

    @Override
    public List<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }
}
