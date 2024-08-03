package com.app.entity;

import javax.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@Table(name="Recruiter")
public class Recruiter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private int recruiter_id;

    @Column(nullable = false)
    private String company_name;

    @Column(nullable = false)
    private String location;

    @Column(nullable = false)
    private String web_site;

    @Column(nullable = false)
    private String industry;
}
