package com.app.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class JobSeekerDTO {
    private int jobSeekerId;
    private String profileSummary;
    private String fullName;
    private String mobileNo;
    private String resume;
    private String experience;
    private int skillId;
}
