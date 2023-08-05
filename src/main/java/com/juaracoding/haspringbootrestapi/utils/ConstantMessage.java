package com.juaracoding.haspringbootrestapi.utils;
/*
IntelliJ IDEA 2022.2.2 (Community Edition)
Build #IC-222.4167.29, built on September 13, 2022
Runtime version: 17.0.4+7-b469.53 amd64
@Author hakim a.k.a. Hakim Amarullah
Java Developer
Created on 8/3/2023 8:22 PM
@Last Modified 8/3/2023 8:22 PM
Version 1.0
*/

public class ConstantMessage {

    public final static String REGEX_DATE_YYYYMMDD = "^\\d{4}-(0[1-9]|1[0-2])-(0[1-9]|[1-2][0-9]|3[0-1])$";

    public final static String REGEX_DATE_DDMMYY = "";
    /*
        REGISTER
     */
    public final static String REGIS_USRNAME_NOT_EMPTY = "Username tidak boleh kosong";
    public final static String REGIS_PWD_NOT_EMPTY = "Password tidak boleh kosong";
    public final static String REGIS_EMAIL_NOT_EMPTY = "Email tidak boleh kosong";
    public final static String REGIS_NO_HP_NOT_EMPTY = "No HP tidak boleh kosong";

    public final static String ERROR_UNEXPECTED = "UNEXPECTED ERROR";
    public final static String ERROR_UNPROCCESSABLE = "Validation error. Check 'errors' field for details.";
    public final static String ERROR_NO_CONTENT = "PERMINTAAN TIDAK DAPAT DIPROSES";
    public final static String ERROR_DATA_INVALID = "DATA TIDAK VALID";
    public final static String ERROR_INTERNAL_SERVER = "INTERNAL SERVER ERROR";
    public final static String ERROR_MAIL_FORM_JSON = "Malformed JSON request";

    public final static  String ERROR_FAILED_CREATED = "Error created";
    public static final String SUCCESS_CREATED = "Data created successfully";

}

