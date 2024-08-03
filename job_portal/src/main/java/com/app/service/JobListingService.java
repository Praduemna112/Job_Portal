package com.app.service;

import com.app.entity.JobListing;
import java.util.List;

public interface JobListingService {
    JobListing addJobListing(JobListing jobListing);
    List<JobListing> getAllJobListings();
    JobListing getJobListingById(int id);
    JobListing updateJobListing(int id, JobListing jobListing);
}
