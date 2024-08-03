package com.app.service;

import com.app.entity.Recruiter;
import java.util.List;

public interface RecruiterService {
    Recruiter addRecruiter(Recruiter recruiter);
    List<Recruiter> getAllRecruiters();
    Recruiter getRecruiterById(int id);
}
