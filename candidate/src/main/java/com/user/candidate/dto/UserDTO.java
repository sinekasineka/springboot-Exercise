package com.user.candidate.dto;

import lombok.Data;

@Data

public class UserDTO {
    private int id;
    private String userName;
    private String userAddress;
    private long phoneNumber;
    private String emailId;
    private String qualification;
    private String district;
    private double dob;
    private int age;
}
