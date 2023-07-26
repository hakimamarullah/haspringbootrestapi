package com.juaracoding.haspringbootrestapi.model.dto;
/*
IntelliJ IDEA 2022.2.2 (Community Edition)
Build #IC-222.4167.29, built on September 13, 2022
Runtime version: 17.0.4+7-b469.53 amd64
@Author hakim a.k.a. Hakim Amarullah
Java Developer
Created on 7/26/2023 9:09 PM
@Last Modified 7/26/2023 9:09 PM
Version 1.0
*/

import lombok.Data;

import java.util.Date;

@Data
public class EmployeeDTO {private String firstName;
    private String lastName;
    private Date birthDay;
    private String email;
    private String phone;
    private Long departmentId;

}
