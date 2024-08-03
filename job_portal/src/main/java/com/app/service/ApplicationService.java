package com.app.service;

import com.app.entity.Application;
import java.util.List;
import java.util.Optional;

public interface ApplicationService {
    Application saveApplication(Application application);
    Optional<Application> getApplicationById(Integer applicationId);
    List<Application> getAllApplications();
    void deleteApplication(Integer applicationId);
	Application updateApplicationStatus(int id, String status);
}
