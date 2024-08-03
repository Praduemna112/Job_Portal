package com.app.dto;

import lombok.*;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SubscriptionDTO {
    private int subscriptionId;
    private String subscriptionType;
    private LocalDate subscriptionStartDate;
    private LocalDate subscriptionEndDate;
    private int jobSeekerId;
}
