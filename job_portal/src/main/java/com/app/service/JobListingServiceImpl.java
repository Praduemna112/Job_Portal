package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entity.JobListing;
import com.app.repository.JobListingRepository;

@Service
public class JobListingServiceImpl implements JobListingService {

    @Autowired
    private JobListingRepository jobListingRepository;

    @Override
    public JobListing addJobListing(JobListing jobListing) {
        return jobListingRepository.save(jobListing);
    }

    @Override
    public List<JobListing> getAllJobListings() {
        return jobListingRepository.findAll();
    }

    @Override
    public JobListing getJobListingById(int id) {
        return jobListingRepository.findById(id).orElse(null);
    }

    @Override
    public JobListing updateJobListing(int id, JobListing jobListing) {
        JobListing existingJobListing = jobListingRepository.findById(id).orElse(null);
        if (existingJobListing != null) {
            existingJobListing.setJob_title(jobListing.getJob_title());
            existingJobListing.setJob_description(jobListing.getJob_description());
            existingJobListing.setRecruiter(jobListing.getRecruiter());
            existingJobListing.setSkill(jobListing.getSkill());
            return jobListingRepository.save(existingJobListing);
        }
        return null;
    }
}
