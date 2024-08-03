package com.app.service;

import com.app.dto.JobSeekerDTO;
import com.app.entity.JobSeeker;
import java.util.List;

public interface JobSeekerService {
    
    List<JobSeekerDTO> getAllJobSeekers();
    JobSeekerDTO getJobSeekerById(int id);
	void deleteJobSeeker(int id);
	JobSeekerDTO createJobSeeker(JobSeekerDTO jobSeekerDTO);
}
