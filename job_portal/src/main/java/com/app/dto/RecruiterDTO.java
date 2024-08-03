package com.app.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RecruiterDTO {
    private int recruiterId;
    private String companyName;
    private String location;
    private String webSite;
    private String industry;
}
