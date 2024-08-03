package com.app.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dto.JobSeekerDTO;
import com.app.entity.JobSeeker;
import com.app.repository.JobSeekerRepository;

@Service
public class JobSeekerServiceImpl implements JobSeekerService {

    @Autowired
    private JobSeekerRepository jobSeekerRepository;

    @Override
    public JobSeekerDTO createJobSeeker(JobSeekerDTO jobSeekerDTO) {
        JobSeeker jobSeeker = mapToEntity(jobSeekerDTO);
        JobSeeker savedJobSeeker = jobSeekerRepository.save(jobSeeker);
        return mapToDTO(savedJobSeeker);
    }

    @Override
    public List<JobSeekerDTO> getAllJobSeekers() {
        return jobSeekerRepository.findAll().stream()
                .map(this::mapToDTO)
                .collect(Collectors.toList());
    }

    @Override
    public JobSeekerDTO getJobSeekerById(int id) {
        return jobSeekerRepository.findById(id)
                .map(this::mapToDTO)
                .orElse(null);
    }

    @Override
    public void deleteJobSeeker(int id) {
        jobSeekerRepository.deleteById(id);
    }

    private JobSeekerDTO mapToDTO(JobSeeker jobSeeker) {
        return new JobSeekerDTO(
                jobSeeker.getJob_seeker_id(),
                jobSeeker.getProfile_summary(),
                jobSeeker.getFull_name(),
                jobSeeker.getMobile_no(),
                jobSeeker.getResume(),
                jobSeeker.getExperience(),
                jobSeeker.getSkill().getSkill_id() // Ensure Skill entity has a `getSkillId` method
        );
    }

    private JobSeeker mapToEntity(JobSeekerDTO dto) {
        JobSeeker jobSeeker = new JobSeeker();
        jobSeeker.setProfile_summary(dto.getProfileSummary());
        jobSeeker.setFull_name(dto.getFullName());
        jobSeeker.setMobile_no(dto.getMobileNo());
        jobSeeker.setResume(dto.getResume());
        jobSeeker.setExperience(dto.getExperience());
        // Assuming Skill is being handled correctly
        // You need to fetch the Skill entity based on skillId from DTO
        // jobSeeker.setSkill(skillRepository.findById(dto.getSkillId()).orElse(null));
        return jobSeeker;
    }

	
}
