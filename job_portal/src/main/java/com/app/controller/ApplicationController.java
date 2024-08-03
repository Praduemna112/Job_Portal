package com.app.controller;

import com.app.entity.Application;
import com.app.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/applications")
public class ApplicationController {

    @Autowired
    private ApplicationService applicationService;

    @PostMapping
    public Application addApplication(@RequestBody Application application) {
        return applicationService.saveApplication(application);
    }

    @GetMapping
    public List<Application> getAllApplications() {
        return applicationService.getAllApplications();
    }

    @GetMapping("/{id}")
    public Optional<Application> getApplicationById(@PathVariable int id) {
        return applicationService.getApplicationById(id);
    }

    @PutMapping("/{id}/status")
    public Application updateApplicationStatus(@PathVariable int id, @RequestParam String status) {
        return applicationService.updateApplicationStatus(id, status);
    }
}
