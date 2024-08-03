package com.app.controller;

import com.app.dto.JobSeekerDTO;
import com.app.service.JobSeekerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/jobseekers")
public class JobSeekerController {

    @Autowired
    private JobSeekerService jobSeekerService;

    @PostMapping
    public JobSeekerDTO createJobSeeker(@RequestBody JobSeekerDTO jobSeekerDTO) {
        return jobSeekerService.createJobSeeker(jobSeekerDTO);
    }

    @GetMapping("/{id}")
    public JobSeekerDTO getJobSeekerById(@PathVariable int id) {
        return jobSeekerService.getJobSeekerById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteJobSeeker(@PathVariable int id) {
        jobSeekerService.deleteJobSeeker(id);
    }
}
