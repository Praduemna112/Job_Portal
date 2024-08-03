package com.app.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class JobListingDTO {
    private int jobId;
    private String jobTitle;
    private int recruiterId;
    private String jobDescription;
    private int skillId;
}
