package com.app.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ApplicationDTO {
    private int applicationId;
    private int jobId;
    private int jobSeekerId;
    private String status;
}
