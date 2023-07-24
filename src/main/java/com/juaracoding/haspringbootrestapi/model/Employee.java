package com.juaracoding.haspringbootrestapi.model;
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

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Date;

public class Employee {
    private String Id;
    private String firstName;
    private String lastName;
    private Date birthDay;
    private String email;
    private String phone;
    @JsonIgnoreProperties("employees")
    private Department department;

    public Employee(String id, String firstName, String lastName, Date birthDay, String email, String phone, Department department) {
        Id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDay = birthDay;
        this.email = email;
        this.phone = phone;
        this.department = department;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }
}
