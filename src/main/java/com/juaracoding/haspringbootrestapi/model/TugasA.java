package com.juaracoding.haspringbootrestapi.model;
/*
IntelliJ IDEA 2022.2.2 (Community Edition)
Build #IC-222.4167.29, built on September 13, 2022
Runtime version: 17.0.4+7-b469.53 amd64
@Author hakim a.k.a. Hakim Amarullah
Java Developer
Created on 8/2/2023 9:23 PM
@Last Modified 8/2/2023 9:23 PM
Version 1.0
*/

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.sql.Date;
import java.time.LocalDateTime;

@Entity
@Table(name = "MstTugasA")
public class TugasA {

    @Id
    @Column(name = "IdTugasA")
    private String IdTugasA;

    @Column(name = "Nama", length = 40)
    @NotNull
    private String nama;

    @Column(name = "Alamat", length = 500)
    @NotNull
    private String alamat;


    @Column(name = "TanggalLahir")
    @NotNull
    private Date tanggalLahir;

    @Column(name = "JenisKelamin", length = 1)
    @NotNull
    private String jenisKelamin;

    @Column(name = "MasihHidup")
    @NotNull
    private Boolean masihHidup;

    @Column(name = "CreatedDate", columnDefinition = "datetime2(7)")
    @NotNull
    private LocalDateTime createdDate;

    @Column(name = "CreatedBy")
    @NotNull
    private Integer createdBy;

    @Column(name = "ModifiedDate", columnDefinition = "datetime2(7)")
    private LocalDateTime modifiedDate;

    @Column(name = "ModifiedBy")
    private Integer modifiedBy;

    @Column(name = "IsDelete", columnDefinition = "smallint")
    @NotNull
    private Boolean isDelete;
}
