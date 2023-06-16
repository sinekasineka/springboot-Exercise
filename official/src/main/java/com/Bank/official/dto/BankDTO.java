package com.Bank.official.dto;

import lombok.Data;

@Data

public class BankDTO {
    private  int id;
    private String bankName;
    private String branchName;
    private  String address;

    private String district ;
    private int phoneNumber;
}
