package com.app.controller;

import com.app.entity.Recruiter;
import com.app.service.RecruiterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/recruiters")
public class RecruiterController {

    @Autowired
    private RecruiterService recruiterService;

    @PostMapping
    public Recruiter addRecruiter(@RequestBody Recruiter recruiter) {
        return recruiterService.addRecruiter(recruiter);
    }

    @GetMapping
    public List<Recruiter> getAllRecruiters() {
        return recruiterService.getAllRecruiters();
    }

    @GetMapping("/{id}")
    public Recruiter getRecruiterById(@PathVariable int id) {
        return recruiterService.getRecruiterById(id);
    }
}
