package com.app.controller;

import com.app.entity.JobListing;
import com.app.service.JobListingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jobListings")
public class JobListingController {

    @Autowired
    private JobListingService jobListingService;

    @PostMapping
    public JobListing addJobListing(@RequestBody JobListing jobListing) {
        return jobListingService.addJobListing(jobListing);
    }

    @GetMapping
    public List<JobListing> getAllJobListings() {
        return jobListingService.getAllJobListings();
    }

    @GetMapping("/{id}")
    public JobListing getJobListingById(@PathVariable int id) {
        return jobListingService.getJobListingById(id);
    }

    @PutMapping("/{id}")
    public JobListing updateJobListing(@PathVariable int id, @RequestBody JobListing jobListing) {
        return jobListingService.updateJobListing(id, jobListing);
    }
}
