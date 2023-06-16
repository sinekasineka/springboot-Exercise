package com.student.details.dto;

import lombok.Data;

import java.util.Date;


@Data
public class StudentDTO {
    private int id;
    private String studentName;
    private int registerNumber;
    private String emailId;
    private long phoneNumber;
    private Date date;
}
