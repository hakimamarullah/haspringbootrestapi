package com.juaracoding.haspringbootrestapi.model;
/*
IntelliJ IDEA 2022.2.2 (Community Edition)
Build #IC-222.4167.29, built on September 13, 2022
Runtime version: 17.0.4+7-b469.53 amd64
@Author hakim a.k.a. Hakim Amarullah
Java Developer
Created on 7/21/2023 8:09 AM
@Last Modified 7/21/2023 8:09 AM
Version 1.0
*/

import jakarta.persistence.*;

@Entity
@Table(name = "persons")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    @Column(nullable = false)
    private String firstName;
    private String lastName;

    @Column(nullable = false)
    private String email;
    private String phone;

    @Column(nullable = false, columnDefinition = "bit default 1")
    private Boolean isActive;
}
