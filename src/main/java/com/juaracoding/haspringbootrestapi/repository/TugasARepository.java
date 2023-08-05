package com.juaracoding.haspringbootrestapi.repository;
/*
IntelliJ IDEA 2022.2.2 (Community Edition)
Build #IC-222.4167.29, built on September 13, 2022
Runtime version: 17.0.4+7-b469.53 amd64
@Author hakim a.k.a. Hakim Amarullah
Java Developer
Created on 8/3/2023 9:52 PM
@Last Modified 8/3/2023 9:52 PM
Version 1.0
*/

import com.juaracoding.haspringbootrestapi.model.TugasA;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TugasARepository extends JpaRepository<TugasA, String> {
}
