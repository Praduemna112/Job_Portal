package com.app.service	;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entity.Application;
import com.app.repository.ApplicationRepository;

@Service
public class ApplicationServiceImpl implements ApplicationService {

    private final ApplicationRepository applicationRepository;

    @Autowired
    public ApplicationServiceImpl(ApplicationRepository applicationRepository) {
        this.applicationRepository = applicationRepository;
    }

    @Override
    public Application saveApplication(Application application) {
        return applicationRepository.save(application);
    }

    @Override
    public Optional<Application> getApplicationById(Integer applicationId) {
        return applicationRepository.findById(applicationId);
    }

    @Override
    public List<Application> getAllApplications() {
        return applicationRepository.findAll();
    }

    @Override
    public void deleteApplication(Integer applicationId) {
        applicationRepository.deleteById(applicationId);
    }

	@Override
	public Application updateApplicationStatus(int id, String status) {
		// TODO Auto-generated method stub
		return null;
	}
}
