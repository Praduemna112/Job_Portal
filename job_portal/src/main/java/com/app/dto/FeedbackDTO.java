package com.app.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FeedbackDTO {
    private int feedbackId;
    private int jobSeekerId;
    private String feedbackTitle;
}
