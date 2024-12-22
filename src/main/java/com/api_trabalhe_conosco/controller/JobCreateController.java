package com.api_trabalhe_conosco.controller;

import com.api_trabalhe_conosco.dto.JobRequestSaveDTO;
import com.api_trabalhe_conosco.model.JobModel;
import com.api_trabalhe_conosco.service.JobCreateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JobCreateController {
    @Autowired
    private JobCreateService jobCreateService;

    @PostMapping("/api/v1/create/job")
    public ResponseEntity<JobModel> jobCreate(@RequestBody JobRequestSaveDTO jobRequestSaveDTO){

        return ResponseEntity.status(HttpStatus.CREATED).body(jobCreateService.jobSave(jobRequestSaveDTO));

    }
}
