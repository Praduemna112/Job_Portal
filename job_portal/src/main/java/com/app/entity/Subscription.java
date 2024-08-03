package com.app.entity;

import java.time.LocalDate;

import javax.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@Table(name="Subscription")
public class Subscription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private int subscription_id;

    @Column(nullable = false, length = 50)
    private String subscription_type;

    @Column(nullable = false)
    private LocalDate subscription_start_date;

    @Column(nullable = false)
    private LocalDate subscription_end_date;

    @ManyToOne
    @JoinColumn(name = "job_seeker_id", nullable = false)
    private JobSeeker jobSeeker;
}
