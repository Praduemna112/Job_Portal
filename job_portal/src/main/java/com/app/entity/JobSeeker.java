package com.app.entity;

import javax.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Table(name="JobSeeker")
public class JobSeeker {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private int job_seeker_id;

    @Column(nullable = false, length = 500)
    private String profile_summary;

    @Column(nullable = false, length = 100)
    private String full_name;

    @Column(nullable = false, length = 15)
    private String mobile_no;

    @Lob
    @Column(nullable = false)
    private String resume;

    @Column(nullable = false, length = 100)
    private String experience;

    @ManyToOne
    @JoinColumn(name = "skill_id", nullable = false)
    private Skill skill;


}
