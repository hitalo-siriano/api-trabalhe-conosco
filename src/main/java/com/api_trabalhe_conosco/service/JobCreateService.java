package com.api_trabalhe_conosco.service;

import java.time.LocalDateTime;

import com.api_trabalhe_conosco.dto.JobRequestSaveDTO;
import com.api_trabalhe_conosco.model.JobModel;
import com.api_trabalhe_conosco.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JobCreateService {
    @Autowired
    private JobRepository jobRepository;

    public JobModel jobSave(JobRequestSaveDTO jobRequestSaveDTO) {

        JobModel jobModel = new JobModel();
        jobModel.setTitle(jobRequestSaveDTO.title());
        jobModel.setDescription(jobRequestSaveDTO.description());
        jobModel.setLocation(jobRequestSaveDTO.location());
        jobModel.setEmploymentType(jobRequestSaveDTO.employmentType());
        jobModel.setStatus("Aberto");
        jobModel.setCompanyName(jobRequestSaveDTO.companyName());
        jobModel.setWorkModality(jobRequestSaveDTO.workModality());
        jobModel.setPostedDate(LocalDateTime.now());



        return jobRepository.save(jobModel);
    }
}
