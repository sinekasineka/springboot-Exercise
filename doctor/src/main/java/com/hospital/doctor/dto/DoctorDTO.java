package com.hospital.doctor.dto;

import lombok.Data;

@Data

public class DoctorDTO {
    private int id;
    private String doctorName;
    private String doctorAddress;
    private int fees;
    private String tabletName;
    private long phoneNumber;
}
